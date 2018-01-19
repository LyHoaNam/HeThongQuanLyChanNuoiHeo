/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Element.HeoELE;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import Business.ChuyenChuongBUS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author cuhoa_000
 */
public class ChuyenChuongGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChuyenChuongGUI
     */
    ArrayList <String> lstMaLoaiChuong=new ArrayList();
    private static ChuyenChuongGUI obj=null;
    public static ChuyenChuongGUI getObj(String sLoaiChuong, String sIdChuong, ArrayList<HeoELE> lstHeo)
    {
        if(obj==null)
        {
            obj=new ChuyenChuongGUI(sLoaiChuong,sIdChuong,lstHeo);
        }
        return obj;
    }
    public ChuyenChuongGUI() {
        initComponents();
    }
    public ChuyenChuongGUI(String sLoaiChuong, String sIdMaChuong, ArrayList<HeoELE> lstHeo)
    {
        initComponents();
        
        lbLoaiChuong.setText(sLoaiChuong);
        lbChuongHienTai.setText(sIdMaChuong);
        //add info in tableThongTinHeo
        DefaultTableModel model=(DefaultTableModel)tbThongTinHeo.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for(int i=0;i<lstHeo.size();i++)
        {
            Vector vector=new Vector();
            vector.add(i+1);
            vector.add(lstHeo.get(i).getMaHeo());
            vector.add(lstHeo.get(i).getTinhTrang());
            vector.add(lstHeo.get(i).getGiaNhap());
            vector.add(lstHeo.get(i).getHeoMe());
            vector.add(lstHeo.get(i).getHeoCha());
            vector.add(lstHeo.get(i).getXuatXu());
            model.addRow(vector);;
        }
        
        showComboLoaiChuong();
    }
    private void showComboLoaiChuong()
    {
        lstMaLoaiChuong.clear();
        cbLoaiChuong.removeAllItems();
        ChuyenChuongBUS objLoaiChuong=new ChuyenChuongBUS();
        ResultSet rs=objLoaiChuong.getLoaiMaChuong();
        try
        {
            while(rs.next())
            {
                cbLoaiChuong.addItem(rs.getString("TenLoaiChuong"));
                lstMaLoaiChuong.add(rs.getString("MaLoaiChuong"));
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi o showComboLoaiChuong "+exc);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinHeo = new javax.swing.JTable();
        lbLoaiChuong = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        cbChuong = new javax.swing.JComboBox<>();
        lbChuongHienTai = new javax.swing.JLabel();
        cbLoaiChuong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbNhanVien1 = new javax.swing.JLabel();
        lbNhanVien2 = new javax.swing.JLabel();
        lbNhanVien3 = new javax.swing.JLabel();
        lbNhanVien4 = new javax.swing.JLabel();
        lbXacNhan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelContain.setBackground(new java.awt.Color(255, 255, 255));

        tbThongTinHeo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Stt", "Mã Heo", "Tình Trạng", "Giá Nhập", "Heo Mẹ", "Heo Cha", "Xuất Xứ"
            }
        ));
        jScrollPane1.setViewportView(tbThongTinHeo);

        lbLoaiChuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLoaiChuong.setForeground(new java.awt.Color(0, 182, 121));
        lbLoaiChuong.setText("Ten Loai Chuong");

        dateC.setDateFormatString("yyyy-MM-dd\n");

        cbChuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbChuongHienTai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbChuongHienTai.setText("jLabel5");

        cbLoaiChuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbLoaiChuongMouseReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("THÔNG TIN HEO");
        jLabel4.setOpaque(true);

        lbNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNhanVien1.setForeground(new java.awt.Color(0, 153, 102));
        lbNhanVien1.setText("Ngày");

        lbNhanVien2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNhanVien2.setForeground(new java.awt.Color(0, 153, 102));
        lbNhanVien2.setText("Chuồng hiện tại");

        lbNhanVien3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNhanVien3.setForeground(new java.awt.Color(0, 153, 102));
        lbNhanVien3.setText("Loại Chuồng mới:");

        lbNhanVien4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNhanVien4.setForeground(new java.awt.Color(0, 153, 102));
        lbNhanVien4.setText("Chuồng mới");

        lbXacNhan.setBackground(new java.awt.Color(0, 153, 102));
        lbXacNhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        lbXacNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Checkmark_25px.png"))); // NOI18N
        lbXacNhan.setText("XÁC NHẬN");
        lbXacNhan.setOpaque(true);
        lbXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXacNhanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelContainLayout = new javax.swing.GroupLayout(panelContain);
        panelContain.setLayout(panelContainLayout);
        panelContainLayout.setHorizontalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainLayout.createSequentialGroup()
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContainLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lbNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addComponent(lbNhanVien2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbChuongHienTai)
                                .addGap(45, 45, 45)
                                .addComponent(lbNhanVien3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNhanVien4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbChuong, 0, 93, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(panelContainLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lbXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContainLayout.setVerticalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLoaiChuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhanVien2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChuongHienTai)
                    .addComponent(lbNhanVien3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNhanVien4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showComboChuong()
    {
        ChuyenChuongBUS objChuong=new ChuyenChuongBUS();
        cbChuong.removeAllItems();
        String sId=lstMaLoaiChuong.get(cbLoaiChuong.getSelectedIndex());
        ResultSet rs=objChuong.getMaChuong(sId);
        try
        {
            while(rs.next())
            {
                cbChuong.addItem(rs.getString("MaChuong"));
                
            }
        }
        catch(SQLException exc)
        {
            System.out.println(" Loi o showcomboChuong ChuyenChuongGUI "+exc);
        }
        
    }
    
    private void cbLoaiChuongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbLoaiChuongMouseReleased
        // TODO add your handling code here:
        showComboChuong();
    }//GEN-LAST:event_cbLoaiChuongMouseReleased

    private void lbXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXacNhanMouseClicked
        // TODO add your handling code here:
        ChuyenChuongBUS objCHeo=new ChuyenChuongBUS();
        int iCheck=0;
        for(int i=0;i<tbThongTinHeo.getRowCount();i++)
        {
            String sMaHeo=(String) tbThongTinHeo.getValueAt(i, 1);
            String MaChuong=(String) cbChuong.getSelectedItem();
            String sDate=((JTextField)dateC.getDateEditor().getUiComponent()).getText();
            try {
                if(objCHeo.InsertChuyenChuong(sMaHeo, MaChuong, sDate))
                    iCheck++;
            } catch (SQLException ex) {
                Logger.getLogger(ChuyenChuongGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(iCheck==tbThongTinHeo.getRowCount())
        {
             JOptionPane.showMessageDialog(null, "Chuyên chuồng thành công",
                  "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Chuyển chuồng thất bại",
                  "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lbXacNhanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenChuongGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbChuong;
    private javax.swing.JComboBox<String> cbLoaiChuong;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChuongHienTai;
    private javax.swing.JLabel lbLoaiChuong;
    private javax.swing.JLabel lbNhanVien1;
    private javax.swing.JLabel lbNhanVien2;
    private javax.swing.JLabel lbNhanVien3;
    private javax.swing.JLabel lbNhanVien4;
    private javax.swing.JLabel lbXacNhan;
    private javax.swing.JPanel panelContain;
    private javax.swing.JTable tbThongTinHeo;
    // End of variables declaration//GEN-END:variables
}
