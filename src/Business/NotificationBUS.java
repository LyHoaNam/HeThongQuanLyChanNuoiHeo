
package Business;

import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;


public class NotificationBUS 
{
    classData DB=new classData();
    public int getGioChoAn(String idChuong)
    {
        String sql="SELECT * FROM giochoan WHERE id in (SELECT Max(id) "
                + "FROM giochoan GROUP BY MaChuong) AND MaChuong='"+idChuong+"'";
        ResultSet rs=DB.getData(sql);
        int temp=-1;
        try
        {
            while(rs.next())
            {
            temp=rs.getInt("GioChoAn");
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi o NotificationBUS "+exc);
        }
        return temp;
    }
}
