/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.HeoBUS;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import gui.HeoGUI;

/**
 *
 * @author cuhoa_000
 */
public class ThemHeoConGUI extends javax.swing.JFrame {

    /**
     * Creates new form ThemHeoGUI
     */
    
    private static ThemHeoConGUI obj=null;
    public static ThemHeoConGUI getObj(String sMaChuong)
    { if(obj==null){
        obj=new ThemHeoConGUI(sMaChuong); 
        }
        return obj; 
    }
    private ThemHeoConGUI(String sMaChuong) {
        initComponents();
        txtMaChuong.setText(sMaChuong);
    }
     private ThemHeoConGUI() {
        initComponents();
       
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
        DateNS = new com.toedter.calendar.JDateChooser();
        txtMaHeoCha = new javax.swing.JTextField();
        txtMaHeoMe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThemHeoCon = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JToggleButton();
        spnCanNang = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JToggleButton();
        cbGioiTinh = new javax.swing.JComboBox<>();
        btnXoaHeo = new javax.swing.JToggleButton();
        lbMaChuong = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        txtMaChuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM HEO CON");

        panelContain.setBackground(new java.awt.Color(255, 255, 255));

        DateNS.setDateFormatString("yyyy-MM-dd\n");

        jLabel3.setText("Mã Heo Mẹ");

        jLabel4.setText("Mã Heo Cha");

        tableThemHeoCon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Cân nặng", "Giới tính", "Chuồng"
            }
        ));
        jScrollPane1.setViewportView(tableThemHeoCon);

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacNhanMouseClicked(evt);
            }
        });
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jLabel2.setText("Cân nặng (kg)");

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đực", "Cái" }));

        btnXoaHeo.setText("Xóa Heo");
        btnXoaHeo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaHeoMouseClicked(evt);
            }
        });
        btnXoaHeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHeoActionPerformed(evt);
            }
        });

        lbMaChuong.setText("Mã chuồng:");

        lbGioiTinh.setText("Giới tính");

        txtMaChuong.setText("jTextField2");

        javax.swing.GroupLayout panelContainLayout = new javax.swing.GroupLayout(panelContain);
        panelContain.setLayout(panelContainLayout);
        panelContainLayout.setHorizontalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainLayout.createSequentialGroup()
                        .addComponent(btnXoaHeo)
                        .addGap(18, 18, 18)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainLayout.createSequentialGroup()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaHeoMe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lbGioiTinh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaHeoCha, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lbMaChuong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnCanNang, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(txtMaChuong))
                                .addGap(48, 48, 48)
                                .addComponent(DateNS, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        panelContainLayout.setVerticalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHeoCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaHeoMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnCanNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGioiTinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaChuong)
                    .addComponent(DateNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnXoaHeo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(panelContain, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        
            DefaultTableModel model;
            model = (DefaultTableModel) tableThemHeoCon.getModel();
            Vector vector=new Vector();
            int stt=tableThemHeoCon.getRowCount()+1;
            vector.add(stt);
            vector.add(spnCanNang.getValue());
            vector.add(cbGioiTinh.getSelectedItem());
            vector.add(txtMaChuong.getText().toString());
            model.addRow(vector);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnXacNhanMouseClicked

    private void btnXoaHeoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaHeoMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnXoaHeoMouseClicked

    private void btnXoaHeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHeoActionPerformed
        // TODO add your handling code here:
        try
        {
       ((DefaultTableModel)tableThemHeoCon.getModel()).removeRow(tableThemHeoCon.getSelectedRow());
        }
        catch(Exception exc)
        {
            System.out.println(exc);
        }
    }//GEN-LAST:event_btnXoaHeoActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        HeoBUS objHeo=new HeoBUS();
        int n=tableThemHeoCon.getRowCount();
        
       ArrayList<String> lstCanNang=new ArrayList();
        ArrayList<String> lstGioiTinh=new ArrayList();
        
        
        String sDateNS=((JTextField)DateNS.getDateEditor().getUiComponent()).getText();
        //System.out.println(sDateNS);
        int iCountTrue=0;
        for(int i=0;i<n;i++)
        {
        try {
            String sCanNang=tableThemHeoCon.getModel().getValueAt(i, 1).toString();
            String sGioiTinh=tableThemHeoCon.getModel().getValueAt(i,2).toString();
            String sIdChuong=tableThemHeoCon.getModel().getValueAt(i, 3).toString();
            if(sGioiTinh =="Đực") 
            sGioiTinh="D";
            else
            sGioiTinh="C";
            
            if(objHeo.ThemHeoCon(txtMaHeoMe.getText(),txtMaHeoCha.getText(),sDateNS,sGioiTinh))
            {
                
                HeoBUS objMAHEO=new HeoBUS();
                String sIdHeo=objMAHEO.getIDHeo();
                if(objHeo.ThemCanNang(sCanNang, sDateNS, sIdHeo))
                    if(objHeo.ThemCtChuong(sIdHeo, sIdChuong, sDateNS))
                    iCountTrue++;
               
            }
            }
        catch (SQLException ex) 
            {
            Logger.getLogger(ThemHeoConGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(iCountTrue==n)
                JOptionPane.showMessageDialog(null, "Thêm heo thành công",
                  "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
        else
             JOptionPane.showMessageDialog(null, "Có lỗi trong quá trình nhập heo",
                  "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            
        
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(ThemHeoConGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemHeoConGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemHeoConGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemHeoConGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemHeoConGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateNS;
    private javax.swing.JToggleButton btnThem;
    private javax.swing.JToggleButton btnXacNhan;
    private javax.swing.JToggleButton btnXoaHeo;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbMaChuong;
    private javax.swing.JPanel panelContain;
    private javax.swing.JSpinner spnCanNang;
    private javax.swing.JTable tableThemHeoCon;
    private javax.swing.JTextField txtMaChuong;
    private javax.swing.JTextField txtMaHeoCha;
    private javax.swing.JTextField txtMaHeoMe;
    // End of variables declaration//GEN-END:variables
}
