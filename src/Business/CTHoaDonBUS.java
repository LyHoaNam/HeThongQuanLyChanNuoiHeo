/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.classData;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author namminhlp
 */
public class CTHoaDonBUS {
     classData DB=new classData();
     public boolean insertCTHD (int MaHD, List<String> lsMaHeo, double DonGia) throws SQLException
     {
        String sql;
        for (String s : lsMaHeo) {
            sql = "INSERT INTO `cthd` VALUES ("+MaHD+",'"+ s+"',"+DonGia+")";
            if (!DB.updateData(sql)) {
                return false;
            }
        }
        return true;
        
      }
}
