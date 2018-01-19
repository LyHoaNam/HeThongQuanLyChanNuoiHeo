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
 * @author cuhoa_000
 */

public class CaiDatBUS {
    classData DB=new classData();
    public String GioChoAn(String sLoaiChuong)
    {
        String sql="SELECT giochoan FROM `loaichuong` WHERE MaLoaiChuong='"+sLoaiChuong+"'";
        ResultSet rs=DB.getData(sql);
        String sGio=null;
        try {
            while(rs.next())
            {
                sGio=rs.getString("giochoan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CaiDatBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sGio;
    }
    public boolean UpdateGioChoAn(String sGio,String sIdLoaiChuong) throws SQLException
    {
        String sql="UPDATE `loaichuong` SET `GioChoAn`="+sGio+" WHERE MaLoaiChuong='"+sIdLoaiChuong+"'";
        if(DB.updateData(sql))
            return true;
        return false;
    }
    public boolean InsertChuong(String sMaLoaiChuong) throws SQLException
    {
        String sql="INSERT INTO `chuong`( `MaLoaiChuong`, `SoLuongHeoDangChua`) VALUES ('"+sMaLoaiChuong+"',0)";
         if(DB.updateData(sql))
            return true;
        return false;
    }
}
