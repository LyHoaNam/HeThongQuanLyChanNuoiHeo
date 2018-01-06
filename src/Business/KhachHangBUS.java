/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import Element.KhachHangELE;
import java.sql.ResultSet;

/**
 *
 * @author namminhlp
 */
public class KhachHangBUS {
    classData DB=new classData();
    public KhachHangBUS() {
        
    }
    public ResultSet getAll() {
       String sql="Select * FROM khachhang";
       return DB.getData(sql);
    }
    public ResultSet getByID (String id) {
        String sql="SELECT * FROM khachhang WHERE MaKhachHang ='"+ id + "' LIMIT 1";
        return DB.getData(sql);
    }
}
