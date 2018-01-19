
package Business;

import Data.classData;
import java.sql.ResultSet;


public class BaoCaoThongKeBUS {
    classData DB=new classData();
    public ResultSet getHoaDon100()
    {
        String sql="SELECT * FROM `hoadon` ORDER BY SoHD DESC LIMIT 100";
        return DB.getData(sql);
    }
    public ResultSet getDonGia()
    {
        String sql="SELECT sum(c.DonGia) sumd,MONTH(h.NgayLapHD) monthd FROM cthd c JOIN hoadon h on c.SoHD=h.SoHD GROUP BY monthd";
        return DB.getData(sql);
    }
    
       public ResultSet getDonGiaNgay()
    {
        String sql="SELECT sum(c.DonGia) sumd FROM cthd c JOIN hoadon h on c.SoHD=h.SoHD WHERE DAY(h.NgayLapHD)=31";
        return DB.getData(sql);
    }
           public ResultSet getDonGiaThang()
    {
        String sql="SELECT sum(c.DonGia) sumd FROM cthd c JOIN hoadon h on c.SoHD=h.SoHD WHERE MoNTH(h.NgayLapHD)=12 GROUP BY MONTH(h.NgayLapHD)";
        return DB.getData(sql);
    }
                   public ResultSet getDonGiaNam()
    {
        String sql="SELECT sum(c.DonGia) sumd FROM cthd c JOIN hoadon h on c.SoHD=h.SoHD WHERE YEAR(h.NgayLapHD)=2017 GROUP BY YEAR(h.NgayLapHD)";
        return DB.getData(sql);
    }
           
}
