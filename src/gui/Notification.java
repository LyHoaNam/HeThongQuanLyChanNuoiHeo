
package gui;

import Business.NotificationBUS;
import Element.*;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author cuhoa_000
 */
public class Notification extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent (JTable table,
                                                    
                                                    Object value,
                                                    boolean isSelected,
                                                    boolean hasFocus,
                                                    int row, int column)
    {
       if(isSelected)
       {
           this.setBackground(table.getSelectionBackground());
           this.setForeground(table.getSelectionForeground());
       }
       else
       {
           this.setBackground(table.getBackground());
           this.setForeground(table.getForeground());
       }
       NotificationBUS objNo=new NotificationBUS();
       Calendar calendar = Calendar.getInstance();
       String sMaChuong=(String) table.getValueAt(row, 0);
       int iHour = objNo.getGioChoAn(sMaChuong);
       int iHourHT=calendar.get(Calendar.HOUR_OF_DAY);
       // Sau 7h thong bao cho an
       if((value != null)&&(iHour-iHourHT>=5))
       {
           int rnd =(int)(Math.random()+4);
           setIcon (new ImageIcon (this.getClass().getResource("Notification.png")));// thay doi icon
           
       }
       else
       {
           
           setIcon(null);
           //return null;
       }
       setHorizontalAlignment(JLabel.CENTER);
       return this;
    }
}
