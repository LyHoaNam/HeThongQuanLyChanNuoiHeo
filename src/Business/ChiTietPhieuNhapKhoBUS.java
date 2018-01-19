/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuNhapKhoBUS {
    private String MaThucAn;
    private int MaPhieuNhapKho;
    private double SoLuong;
    private double ThanhTien;
    
    //Khởi tạo không tham số
    public ChiTietPhieuNhapKhoBUS()
    {
        
    }
    //Khởi tạo có tham số (đầy đủ)
    public ChiTietPhieuNhapKhoBUS(int maphieunhapkho, String mathucan, double soluong, double thanhtien)
    {
        this.MaPhieuNhapKho=maphieunhapkho;
        this.MaThucAn=mathucan;
        this.SoLuong=soluong;
        this.ThanhTien=thanhtien;
    }
    
    public String getMaThucAn()
    {
        return this.MaThucAn;
    }
    public int getMaPhieuNhapKho()
    {
        return this.MaPhieuNhapKho;
    }
    public double getSoLuong()
    {
        return this.SoLuong;
    }
    public double getThanhTien()
    {
        return this.ThanhTien;
    }
    
    //Tạo biến thuộc lớp class data
    classData DB= new classData();
    //Thêm chi tiết phiếu nhập hàng
    public boolean ThemChiTietPhieuNhapKho() throws SQLException
    {
        String sql= "insert into ctPhieuNhapKho values("+this.getMaPhieuNhapKho()+",'"+this.getMaThucAn()+"', "+this.getSoLuong()+", "+this.getThanhTien()+")";     
            return DB.updateData(sql);       
    }
    //Xóa chi tiết phiếu nhập kho, xóa hết chi tiết liên quan tới phiếu nhập kho
    public boolean XoaChiTietPhieuNhapKho(PhieuNhapKhoBUS pnk) throws SQLException
    {
        
        String sql="delete from ctPhieuNhapKho where MaPhieuNhapKho="+pnk.getMaPhieuNhapKho();
        return DB.updateData(sql);
    }
}