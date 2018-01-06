/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.ResultSet;
import Data.classData;
import java.sql.SQLException;

public class ChoAnBUS 
{
    classData DB=new classData();
    public ResultSet GetCongThucAn(String idLoaiChuong)
    {
        String sql="SELECT MaCongThuc,TenCongThuc FROM `congthucan` WHERE MaLoaiChuong='"+ idLoaiChuong+"'";
        return DB.getData(sql);
        
    }
    public ResultSet getThanhPhanTA(String idCongThuc)
    {
        String sql="SELECT c.SoLuong, t.TenThucAn, t.TonKho,t.MaThucAn FROM `ctcongthucan` c join thucan t on c.MaThucAn=t.MaThucAn "
                + "WHERE c.MaCongThuc='"+idCongThuc+"'";
        return DB.getData(sql);
    }
    public ResultSet getThucAn()
    {
        String sql="select * from ThucAn";
        return DB.getData(sql);
    }
    public boolean InsertPhieuXuatTA(String ngay, String idNhanVien, String idChuong) throws SQLException
    {
        String sql="INSERT INTO `phieuxuatthucan`( `NgayXuat`, `MaNhanVien`, `MaChuong`) VALUES ('"+ngay+"','"+idNhanVien+"','"+idChuong+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public boolean InsertChiTietPhieuXuatTA(String idThucAn,String idPhieuXuat,int SoLuong) throws SQLException
    {
        String sql="INSERT INTO `ctphieuxuat`(`MaThucAn`, `SoLuongXuat`, `MaPhieuXuatTA`) VALUES ('"+idThucAn+"',"+SoLuong+",'"+idPhieuXuat+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public boolean UpdateThucAn(int iTonKho, String idThucAn) throws SQLException
    {
        String sql="UPDATE `thucan` SET `TonKho`="+iTonKho+" WHERE MaThucAn='"+idThucAn+"'";
        if(DB.updateData(sql))
            return true;
        return false;
    }
      public String getIDPhieuXuatTA()
    {
        String sql="SELECT  MaPhieuXuatTA FROM phieuxuatthucan ORDER BY MaPhieuXuatTA DESC LIMIT 1";
        ResultSet rs= DB.getData(sql);
        String sResult="";
        try
        {
        while(rs.next())
        {
            sResult=rs.getString("MaPhieuXuatTA");
        }
        }
        catch(SQLException exc)
        {
            System.out.println("Ngoai le o getIDHEO.BUS");
        }
        return sResult;
    }
      public boolean InsertGioChoAn(String idChuong, int Gio) throws SQLException
      {
          String sql="INSERT INTO `giochoan`(`GioChoAn`, `MaChuong`) VALUES ("+Gio+",'"+idChuong+"')";
          if(DB.updateData(sql))
              return true;
          return false;
      }
}
