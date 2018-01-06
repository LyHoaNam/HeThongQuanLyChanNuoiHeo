
package Business;

import Data.classData;
import java.sql.ResultSet;

public class CapitalBUS {
    classData DB=new classData();
    public ResultSet getNhanVien(String sMaTaiKhoan)
    {
        String sql="SELECT * FROM `nhanvien` WHERE MaTaiKhoan='"+sMaTaiKhoan+"'";
        return DB.getData(sql);
    }
    
}
