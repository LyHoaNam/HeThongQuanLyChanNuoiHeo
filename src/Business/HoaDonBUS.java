/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author namminhlp
 */
public class HoaDonBUS {
     classData DB=new classData();
     public boolean insertHoaDon (String MaNV, int SoLuong, String MaKH, String NgayLapHD) throws SQLException
     {
        String sql;
        CTHoaDonBUS busCTHD = new CTHoaDonBUS();
        sql = "INSERT INTO `hoadon` (`MaNhanVien`, `SoLuong`, `MaKhachHang`,`NgayLapHD`) VALUES ('"
                 +MaNV+"','"+SoLuong+"','"+MaKH+"','"+NgayLapHD+"')";
        return DB.updateData(sql);
      }
     public int getIDhasInserted() throws SQLException {
         String sql;
         int ID = 0;
         sql = "SELECT * FROM hoadon ORDER BY SoHD DESC LIMIT 1";
         ResultSet rs = DB.getData(sql);
         while (rs.next()) {
             ID = rs.getInt(1);
         }
         return ID;
     }
     public void UpdateCtChuong(String idChuong,String idHeo) throws SQLException
     {
         String sql="UPDATE `ctchuong` SET `NgayXuatChuong`=now() where MaChuong ='"+idChuong+"' AND MaHeo='"+idHeo+"'";
         DB.updateData(sql);
     }
     
}
