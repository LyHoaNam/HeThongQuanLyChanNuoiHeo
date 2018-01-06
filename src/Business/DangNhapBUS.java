
package Business;

import Data.classData;
import java.sql.ResultSet;

/**
 *
 * @author cuhoa_000
 */
public class DangNhapBUS {
    classData DB =new classData();
    public ResultSet getLoaiNhanVien(String tk, String mk)
    {
        String sql="SELECT * FROM `taikhoan` WHERE taikhoan = '"+tk+"' AND MatKhau='"+mk+"'";
        return DB.getData(sql);
    }
    
}
