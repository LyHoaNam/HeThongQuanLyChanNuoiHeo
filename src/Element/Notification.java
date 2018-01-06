
package Element;

import java.awt.Component;
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
       if(value!= null)
       {
           int rnd =(int)(Math.random()+4);
           setIcon (new ImageIcon (this.getClass().getResource("Notification.png")));// thay doi icon
           
       }
       else
       {
           
           setIcon(null);
       }
       setHorizontalAlignment(JLabel.CENTER);
       return this;
    }
}
