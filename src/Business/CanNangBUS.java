/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import Element.CanNangELE;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CanNangBUS {
    classData DB=new classData();
     public ResultSet getCaNang(String id)
     {
         String sql="SELECT * FROM `cannang` WHERE MaHeo='"+id+"'";
         return DB.getData(sql);
     }
     public boolean InsertCanNang(String sdate, String sCanNang,String sMaHeo) throws SQLException
     {
         String sql="INSERT INTO `cannang`(`CanNang`, `NgayCan`, `MaHeo`) "
                 + "VALUES ('"+sCanNang+"','"+sdate+"','"+sMaHeo+"')";
        if(DB.updateData(sql))
            return true;
         return false;
     }
    
}
