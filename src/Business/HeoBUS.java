
package Business;
import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql="SELECT DISTINCT * FROM `heo` WHERE MaHeo IN (SELECT C.MaHeo FROM ctchuong C JOIN chuong CH on CH.MaChuong= C.MaChuong WHERE C.MaChuong ='"+ id+"')";
        return DB.getData(sql);
    }
    public boolean ThemHeoCon(String idMaLoaiHeo, String idHeoMe, String idHeoCha, String NgaySinh, String gt ) throws SQLException
    {
        String sql="INSERT INTO `heo`( `MaLoaiHeo`, `TinhTrang`, `HeoMe`, `HeoCha`, `NgaySinh`, `GioiTinh`) VALUES "
                + "( '"+ idMaLoaiHeo+"','DN','"+ idHeoMe+"','"+idHeoCha+"','"+NgaySinh+"','"+gt+"')";
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
    public boolean ThemCaNang(String cannag,String ngaycan,String maheo) throws SQLException
    {
        String sql="INSERT INTO `cannang`(`CanNang`, `NgayCan`, `MaHeo`) VALUES ("+ cannag +",'"+ngaycan+"','"+maheo+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
 
    
}
