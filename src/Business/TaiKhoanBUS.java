/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.ResultSet;
import Data.classData;

public class TaiKhoanBUS {
    
    classData DB=new classData();
    public ResultSet getTaiKhoan()
    {
        String sql="select * from khachhang";
        return DB.getData(sql);
    }
    public boolean setTaiKhoan()
    {
        
        return true;
    }
}
