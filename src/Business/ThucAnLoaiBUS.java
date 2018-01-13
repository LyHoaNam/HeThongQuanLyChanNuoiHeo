/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ThucAnLoaiBUS {
    private int MaThucAnLoai;
    private String MaThucAn;
    private double SoLuong;
    private String NgayLoai;
    
    public ThucAnLoaiBUS()
    {
        
    }
    public ThucAnLoaiBUS(int mathucanloai, String mathucan, double soluong, String ngayloai)
    {
        this.MaThucAnLoai=mathucanloai;
        this.MaThucAn= mathucan;
        this.SoLuong=soluong;
        this.NgayLoai=ngayloai;
    }
    public String getMaThucAn()
    {
        return this.MaThucAn;
    }
    public double getSoLuong()
    {
        return this.SoLuong;
    }
    public String getNgayLoai()
    {
        return this.NgayLoai;
    }
    classData DB= new  classData();
    //lấy danh sách thức ăn loại
    public ResultSet getThucAnLoai()
    {
        String sql="select MaThucAnLoai, b.MaThucAn, TenThucAn, SoLuong, NgayLoai, DonViTinh from ThucAnLoai a join ThucAn b on a.MaThucAn=b.MaThucAn";
        return DB.getData(sql);
    }
    //Thêm thức ăn loại
    public boolean ThemThucAnLoai(ThucAnLoaiBUS tal) throws SQLException
    {
        String sql ="insert into ThucAnLoai (`MaThucAn`, `SoLuong`, `NgayLoai`) values('"+tal.MaThucAn+"', "+tal.SoLuong+", '"+tal.NgayLoai+"')";
        return DB.updateData(sql);
    }
    //Sửa thức ăn loại
    public boolean SuaThucAnLoai(ThucAnLoaiBUS tal) throws SQLException
    {
        String sql ="update ThucAnLoai set SoLuong="+tal.SoLuong+", NgayLoai='"+tal.NgayLoai+"' where MaThucAnLoai="+tal.MaThucAnLoai;
        return DB.updateData(sql);
    }
    //Xóa thức ăn loại
    public boolean XoaThucAnLoai(ThucAnLoaiBUS tal) throws SQLException
    {
        String sql ="delete from ThucAnLoai where MaThucAnLoai="+tal.MaThucAnLoai;
        return DB.updateData(sql);
    }
    
}
