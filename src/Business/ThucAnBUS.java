/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThucAnBUS {
    private String MaThucAn;
    private String TenThucAn;
    private String MaLoaiHang;
    private double TonKho;
    private String DonViTinh;
    
    
    public String getMaThucAn()
    {
        return this.MaThucAn;
    }
    public String getTenThucAn()
    {
        return this.TenThucAn;
    }
    public String getMaLoaiHang()
    {
        return this.MaLoaiHang;
    }
    public double getTonKho()
    {
        return this.TonKho;
    }
    public String getDonViTinh()
    {
        return this.DonViTinh;
    }
    
    //khoi tao khong doi so
    public ThucAnBUS()
    {
        
    }
    //khoi tao co doi so
    public ThucAnBUS(String mathucan, String tenthucan, String maloaihang, double tonkho, String donvitinh)
    {
        this.MaThucAn=mathucan;
        this.TenThucAn=tenthucan;
        this.MaLoaiHang=maloaihang;
        this.TonKho=tonkho;
        this.DonViTinh=donvitinh;
    }
    
    classData DB= new classData();
    
    
    //Lay danh sach thuc an
    public ResultSet getThucAn()
    {
        
        String sql = "select * from ThucAn";
        return DB.getData(sql);
    }
    //Lay thong tin thuc an bang ma
    public ThucAnBUS getThucAnBangMa(String mathucan)
    {
        ThucAnBUS ta=new ThucAnBUS();
        String sql="select MaThucAn, TenThucAn, MaLoaiHang, TonKho, DonViTinh from ThucAn where MaThucAn='"+mathucan+"'";
        ResultSet rs= DB.getData(sql);
        try {
            while(rs.next())
            {
            this.MaThucAn=rs.getString("MaThucAn");
            this.TenThucAn=rs.getString("TenThucAn");
            this.MaLoaiHang=rs.getString("MaLoaiHang");
            this.TonKho=rs.getDouble("TonKho");
            this.DonViTinh=rs.getString("DonViTinh");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ThucAnBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    //Them thuc an
    public boolean ThemThucAn(ThucAnBUS ta) throws SQLException
    {
        String sql= "insert into THUCAN values('"+ta.MaThucAn+"','"+ta.TenThucAn+"','"+ta.MaLoaiHang+"','"+ta.TonKho+"', '"+ta.DonViTinh+"')";
        return DB.updateData(sql);
        
    }
    public boolean SuaThucAn(ThucAnBUS ta) throws SQLException
    {
        String sql="update THUCAN set TenThucAn='"+ta.TenThucAn+"', MaLoaiHang='"+ta.MaLoaiHang+"', DonViTinh='"+ta.DonViTinh+"' where MaThucAn='"+ta.MaThucAn+"'";
        return DB.updateData(sql);
    }
    public boolean XoaThucAn(ThucAnBUS ta) throws SQLException
    {
        String sql="delete from ThucAn where MaThucAn='"+ta.MaThucAn+"'";
        return DB.updateData(sql);
    }
    public ResultSet HienThiThucAnTheoMaLoaiHang(String lh)
    {
        String sql ="select * from ThucAn where MaLoaiHang='"+lh+"'";
        return DB.getData(sql);
    }
    //Cap nhat ton kho
    public boolean CapNhatTonKho(double soLuong) throws SQLException
    {
        String sql="update ThucAn set TonKho=TonKho+"+soLuong+" where MaThucAn='"+this.MaThucAn+"'";
        JOptionPane.showMessageDialog(null, "ĐÃ upadte");
        return DB.updateData(sql);
    }
}
