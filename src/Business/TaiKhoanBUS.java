/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.ResultSet;
import Data.classData;
import java.sql.SQLException;

public class TaiKhoanBUS {
    
    classData DB=new classData();
    public ResultSet getTaiKhoanNhanVien(String sNhanVien)
    {
        String sql="SELECT * FROM nhanvien N JOIN taikhoan T ON N.MaTaiKhoan=T.MaTaiKhoan WHERE N.MaNhanVien='"+sNhanVien+"'";
        return DB.getData(sql);
    }
    public boolean checkMatKhau(String matkhau,String taikhoan) throws SQLException
    {
        String sql="SELECT `MaTaiKhoan`, `MatKhau` FROM `taikhoan` WHERE MatKhau='"+matkhau+"' AND MaTaiKhoan='"+taikhoan+"'";
        ResultSet rs=DB.getData(sql);
        String sMaTaiKhoan=null;
        while(rs.next())
        {
            sMaTaiKhoan=rs.getString("MaTaiKhoan");
        }
        if(sMaTaiKhoan!=null)
        {
            return true;
        }
        return false;
    }
    public boolean setMatKhau(String sMatKhauMoi,String sMaTaiKhoan) throws SQLException
    {
        String sql="UPDATE `taikhoan` SET `MatKhau`='"+sMatKhauMoi+"' WHERE MaTaiKhoan='"+sMaTaiKhoan+"'";
        if(DB.updateData(sql))
            return true;
        return false;
        
    }
    public ResultSet getAllNhanVien()
    {
        String sql="SELECT * FROM nhanvien N JOIN taikhoan T ON N.MaTaiKhoan=T.MaTaiKhoan WHERE T.loainhanvien !='ad'";
        return DB.getData(sql);
    }
    public boolean InsertTaiKhoan(String sTaiKhoan, String sMatKhau, String sLoaiNhanVien) throws SQLException
    {
        String sql="INSERT INTO `taikhoan`( `TaiKhoan`, `MatKhau`, `loainhanvien`) "
                + "VALUES ('"+sTaiKhoan+"','"+sMatKhau+"','"+sLoaiNhanVien+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public String getLastIdTK()
    {
        String sql="SELECT MAX(MaTaiKhoan) maxtk FROM `taikhoan` LIMIT 1";
        ResultSet rs=DB.getData(sql);
        String Result=null;
        try
        {
        while(rs.next())
        {
            Result=rs.getString("maxtk");
        }
        }
        catch(SQLException exc)
        {
            System.out.println(exc);
        }
        return Result;
    }
    public boolean InsertNhanVien(String name, String sdt, String ngay,
    String Ma) throws SQLException
    {
        String sql="INSERT INTO `nhanvien`( `HoTen`, `SoDienThoai`, `NgayVaoLam`, `MaTaiKhoan`) "
                + "VALUES ('"+name+"','"+sdt+"','"+ngay+"','"+Ma+"')";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public boolean DeleteNhanVien(String sMaTK) throws SQLException
    {
        String sql="DELETE FROM `nhanvien` WHERE MaNhanVien='"+sMaTK+"'";
        if(DB.updateData(sql))
            return true;
        return false;
    }
     public boolean DeleteTaiKhoan(String sMaTK) throws SQLException
    {
        String sql="DELETE FROM `taikhoan` WHERE MaTaiKhoan='"+sMaTK+"'";
        if(DB.updateData(sql))
            return true;
        return false;
    }
}
