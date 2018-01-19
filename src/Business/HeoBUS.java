
package Business;
import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author cuhoa_000
 */
public class HeoBUS 
{
    classData DB = new classData();
    public ResultSet getKhachHang()
    {
        String sql="Select * from khachhang";
       return DB.getData(sql);
    }
    public ResultSet getLoaiChuong()
    {
        String sql="Select * from LoaiChuong ";
        return DB.getData(sql);
    }
    public ResultSet getChuong(String id)
    {
        String sql="Select * from chuong where MaLoaiChuong = '"+ id+"'";
        return DB.getData(sql);
                
    }
    public int getSoLuongChuong(String id)
    {
        String sql="select count(MaChuong) SoLuong from chuong where MaLoaiChuong = '"+ id+"'";
        ResultSet rs=DB.getData(sql);
        int temp=0;
        try
        {
        while(rs.next())
        {
            temp=rs.getInt("SoLuong");
        }
        }catch(SQLException exc)
        {
            System.out.println(exc);
        }
        return temp;
     }
    public ResultSet getAllHeo()
    {
        String sql="select * from heo";
        return DB.getData(sql);
    }
    public ResultSet getTableHeo(String id)
    {
        String sql="SELECT * FROM heo WHERE MaHeo IN (SELECT p1.MaHeo "
                + "FROM ctchuong p1 "
                + "INNER JOIN ( SELECT max(NgayNhapChuong) MaxPostDate, MaHeo "
                + "FROM ctchuong GROUP BY MaHeo ) p2 "
                + "ON p1.MaHeo =p2.MaHeo AND p1.NgayNhapChuong=p2.MaxPostDate "
                + "WHERE p1.NgayXuatChuong is null AND "
                + "p1.MaChuong='"+id+"' ORDER BY p1.NgayNhapChuong DESC)";
        return DB.getData(sql);
    }
    public boolean ThemHeoCon( String idHeoMe, String idHeoCha, String NgaySinh, String gt ) throws SQLException
    {
        String sql="INSERT INTO `heo`(  `TinhTrang`, `HeoMe`, `HeoCha`, `NgaySinh`, `GioiTinh`) VALUES "
                + "( 'DN','"+ idHeoMe+"','"+idHeoCha+"','"+NgaySinh+"','"+gt+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public String getIDHeo()
    {
        String sql="SELECT  MaHeo FROM heo ORDER BY MaHeo DESC LIMIT 1";
        ResultSet rs= DB.getData(sql);
        String sResult="";
        try
        {
            while(rs.next())
            {
                sResult=rs.getString("MaHeo");
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Ngoai le o getIDHEO.BUS");
        }
        return sResult;
    }
    public boolean ThemCanNang(String cannag,String ngaycan,String maheo) throws SQLException
    {
        String sql="INSERT INTO `cannang`(`CanNang`, `NgayCan`, `MaHeo`) VALUES ("+ cannag +",'"+ngaycan+"','"+maheo+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public boolean ThemCtChuong(String idHeo, String idChuong, String Ngay) throws SQLException
    {
        String sql="INSERT INTO `ctchuong`(`MaHeo`, `MaChuong`, `NgayNhapChuong`) VALUES ('"+idHeo+"','"+idChuong+"','"+Ngay+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public void UpdateChuong() throws SQLException
    {
        String sql="UPDATE `chuong` SET `SoLuongHeoDangChua`=0 WHERE 1";
        DB.updateData(sql);
    }
 
    
}
