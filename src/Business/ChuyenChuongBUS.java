
package Business;

import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ChuyenChuongBUS 
{
    classData DB=new classData();
    public ResultSet getLoaiMaChuong()
    {
        String sql="SELECT MaLoaiChuong, TenLoaiChuong FROM `loaichuong`";
        return DB.getData(sql);
    }
    public ResultSet getMaChuong(String id)
    {
        String sql="SELECT MaChuong, SoLuongHeoDangChua FROM chuong WHERE MaLoaiChuong='"+id+"'";
        return DB.getData(sql);
    }
    public boolean InsertChuyenChuong(String idHeo, String idChuong, String Ngay) throws SQLException
    {
        String sql="INSERT INTO `ctchuong`(`MaHeo`, `MaChuong`, `NgayNhapChuong`) VALUES "
                + "('"+idHeo+"','"+idChuong+"','"+Ngay+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    
}
