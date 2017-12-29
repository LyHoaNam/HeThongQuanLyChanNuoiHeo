
package Business;
import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ThuocBUS 
{
    classData DB=new classData();
    public ResultSet getThuoc()
    {
        String sql="select * from Thuoc";
        return DB.getData(sql);
    }
    public boolean ThemThongTinDungThuoc(String idHeo, String LieuLuong, String idThuoc, String date, String Dvt) throws SQLException
    {
        String sql="INSERT INTO `thongtindungthuoc`( `MaHeo`, `LieuLuong`, "
                + "`MaThuoc`, `NgaySuDung`, `DonViTInh`) VALUES ('"+idHeo+"','"
                +LieuLuong+"','"+idThuoc+"','"+date+"','"+Dvt+"')";
        if(DB.updateData(sql))
        {
            
            return true;
        }
        return false;
    }
    
}
