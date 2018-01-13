/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;






public class PhieuNhapKhoBUS {
    private int MaPhieuNhapKho;
    private String ngay;
    private double tongtien;
    
    //Khởi tạo không đối số
    public PhieuNhapKhoBUS()
    {
        
    }
    //Khởi tạo có đối số
    public PhieuNhapKhoBUS (int ma, String ngay, double tongtien)
    {
        this.MaPhieuNhapKho=ma;
        this.ngay= ngay;
        this.tongtien=tongtien;
    }
    //Các hàm get
    public int getMaPhieuNhapKho()
    {
        return this.MaPhieuNhapKho;
    }
    public String getNgayNhapKho()
    {
        return this.ngay;
    }
    public double getTongTien()
    {
        return this.tongtien;
    }
    public void setMaPhieuNhapKho(int maPhieuNhapKho)
    {
        this.MaPhieuNhapKho=maPhieuNhapKho;
    }
    //Tạo biến class Data
    classData DB = new classData();
    //Lấy danh sách phiếu nhập kho
    public ResultSet getPhieuNhapKho()
    {
        
        String sql= "select * from PhieuNhapKho";
        return DB.getData(sql);
    }
    //Lấy danh sách phiếu nhập kho theo mã phiếu nhập kho
    public ResultSet getChiTietPhieuNhapKho(int maphieunhapkho)
    {
        
        String sql="select a.MaThucAn, TenThucAn, SoLuong, DonViTinh, ThanhTien from ctPhieuNhapKho a join thucan b on a.MaThucAn=b.MaThucAn where MaPhieuNhapKho="+maphieunhapkho;
        return DB.getData(sql);
    }
    //Thêm phiếu nhập kho
    public boolean ThemPhieuNhapKho() throws SQLException
    {
        String sql="insert into PhieuNhapKho(NgayNhapKho, TongTien) values('"+this.getNgayNhapKho()+"', "+this.getTongTien()+")";
        return DB.updateData(sql);
    }
    //Cập nhật tổng tiền
    public boolean CapNhatTongTien(double tongTien) throws SQLException
    {
        String sql ="update PhieuNhapKho set TongTien="+tongTien+" where MaPhieuNhapKho="+this.MaPhieuNhapKho ;
        return DB.updateData(sql);
    }
    //Lấy phiếu nhập kho mới nhất (có mã cao nhất)
    public int LayMaPhieuNhapKhoMoiNhat()
    {
                String sql0="select Max(MaPhieuNhapKho) MaPhieuNhapKho from PhieuNhapKho";
        ResultSet rs=DB.getData(sql0);
        String strma="1";
        
        try {
            while(rs.next())
            {
                strma=rs.getString("MaPhieuNhapKho");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapKhoBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        int intMa=Integer.parseInt(strma);
        return intMa;
    }
    //Sửa phiếu nhập kho
    public boolean SuaPhieuNhapKho(PhieuNhapKhoBUS pnk) throws SQLException
    {
        int intMa=LayMaPhieuNhapKhoMoiNhat();
        
        //String sql ="update PhieuNhapKho set NgayNhap='"+pnk.getNgayNhapKho()+"', TongTien="+pnk.getTongTien()+" where MaPhieuNhapKho="+pnk.MaPhieuNhapKho ;      
        String sql ="update PhieuNhapKho set NgayNhapKho='"+pnk.getNgayNhapKho()+"', TongTien="+pnk.getTongTien()+" where MaPhieuNhapKho="+pnk.getMaPhieuNhapKho() ;
        return DB.updateData(sql);
    }
    //Xóa phiếu nhập kho
    public boolean XoaPhieuNhapKho() throws SQLException
    {
        ChiTietPhieuNhapKhoBUS ct = new ChiTietPhieuNhapKhoBUS();
        try {
            ct.XoaChiTietPhieuNhapKho(this);
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapKhoBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql="delete from PhieuNhapKho where MaPhieuNhapKho="+this.MaPhieuNhapKho;
        return DB.updateData(sql);
    }
    //Lấy giá trị phiếu nhập mới thêm, bằng hàm max
    public PhieuNhapKhoBUS LayPhieuNhapKhoMoiNhat()
    {
        String sql = "select * from PhieuNhapKho where MaPhieuNhapKho=(select max(MaPhieuNhapKho) from PhieuNhapKho)";
        PhieuNhapKhoBUS pnk = new PhieuNhapKhoBUS();
        ResultSet rs= pnk.getPhieuNhapKho();
        try {
            while(rs.next())
            {
                String strMaPhieuNhapKho =rs.getString("MaPhieuNhapKho");
                int maPhieuNhapKho= Integer.parseInt(strMaPhieuNhapKho);
                this.MaPhieuNhapKho=maPhieuNhapKho;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapKhoBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pnk;
    }
    
}
