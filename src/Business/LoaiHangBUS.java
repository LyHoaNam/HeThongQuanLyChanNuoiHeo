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

/**
 *
 * @author Admin
 */
public class LoaiHangBUS {
    
    private String MaLoaiHang;
    private String TenLoaiHang;
    classData DB= new classData();
    public LoaiHangBUS()
    {
        
    }
    public LoaiHangBUS(String maloaihang, String tenloaihang)
    {
        this.MaLoaiHang=maloaihang;
        this.TenLoaiHang=tenloaihang;
    }
    
     public String getMaLoaiHang()
     {
         return this.MaLoaiHang;
     }
     public String getTenLoaiHang()
     {
         return this.TenLoaiHang;
     }
    
    //lay thong tin loai hang
    public ResultSet getLoaiHang()
    {
        
        String sql="select * from LoaiHang";
        
        return DB.getData(sql);
    }
    //Them loai hang
    public boolean ThemLoaiHang(LoaiHangBUS lh) throws SQLException
    {
        String sql ="insert into LoaiHang value('"+lh.MaLoaiHang+"','"+lh.TenLoaiHang+"')";
        
            return DB.updateData(sql);
        
    }
    //Sua loai hang
    public boolean SuaLoaiHang(LoaiHangBUS lh) throws SQLException
    {
        String sql ="update LoaiHang set TenLoaiHang='"+lh.TenLoaiHang+"' where MaLoaiHang='"+lh.MaLoaiHang+"'";       
        return DB.updateData(sql);
    }
    //Sua loai hang
    public boolean XoaLoaiHang(LoaiHangBUS lh) throws SQLException
    {
        String sql="delete from LoaiHang where MaLoaiHang='"+lh.MaLoaiHang+"'";
        return DB.updateData(sql);  
    }
    public boolean KiemTraKhoaChinh(LoaiHangBUS lh)
    {
        String sql = "select * from LoaiHang where MaLoaiHang='"+lh.MaLoaiHang+"'";
        ResultSet rs=DB.getData(sql);
        try {
            while (rs.last())
            {
                int r =rs.getRow();
                if(r>0)
                    return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiHangBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
}
