/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.LoaiHangBUS;
import Business.ThucAnBUS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThemSuaThucAnGUI extends javax.swing.JFrame {

    private static ThucAnBUS thucan;
    public ThemSuaThucAnGUI(ThucAnBUS ta) {
        initComponents();
        this.thucan=ta;
        ChonChucNang();
         HienThiLoaiHang();
       
    }
    //public KhoGui() LogicalParent { get; set; }
        //Phân loại chức năng
        void ChonChucNang()
        {
            if (thucan == null)
            {
                btnSuaThucAn.setVisible(false);
            }
            else
            {
                
                HienThiThongTinThucAn(thucan);
                btnThemThucAn.setVisible(false);
                txtMaThucAn.setEnabled(false);
            }
        }
    public void HienThiThongTinThucAn(ThucAnBUS ta)
    {
        lblTieuDe.setText("SỬA THỨC ĂN");
        txtMaThucAn.setText(ta.getMaThucAn());
        txtTenThucAn.setText(ta.getTenThucAn());
//        Vector vector= new Vector();
//        String lh=ta.getMaLoaiHang();
        cbbLoaiHang.addItem(ta.getMaLoaiHang());
        txtDonViTinh.setText(ta.getDonViTinh());
    }
    public void HienThiLoaiHang()
    {
        LoaiHangBUS lh= new LoaiHangBUS();
        ResultSet rs= lh.getLoaiHang();
        try {
            while(rs.next())
            {
                String s= rs.getString("MaLoaiHang")+ "  "+rs.getString("TenLoaiHang");
                cbbLoaiHang.addItem(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTieuDe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaThucAn = new javax.swing.JTextField();
        txtTenThucAn = new javax.swing.JTextField();
        txtDonViTinh = new javax.swing.JTextField();
        cbbLoaiHang = new javax.swing.JComboBox<>();
        btnThemThucAn = new javax.swing.JButton();
        btnSuaThucAn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTieuDe.setText("THÊM THỨC ĂN");

        jLabel2.setText("Mã thức ăn:");

        jLabel3.setText("Tên thức ăn:");

        jLabel4.setText("Loại hàng:");

        jLabel5.setText("Đơn vị tính:");

        txtDonViTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonViTinhActionPerformed(evt);
            }
        });

        btnThemThucAn.setText("Thêm");
        btnThemThucAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemThucAnMouseClicked(evt);
            }
        });

        btnSuaThucAn.setText("Sửa");
        btnSuaThucAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaThucAnMouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lblTieuDe))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemThucAn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSuaThucAn)
                                .addGap(0, 192, Short.MAX_VALUE))
                            .addComponent(txtTenThucAn)
                            .addComponent(cbbLoaiHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDonViTinh)
                            .addComponent(txtMaThucAn))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemThucAn)
                    .addComponent(btnSuaThucAn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonViTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonViTinhActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtDonViTinhActionPerformed
    private String CutString(String s)
    {
        int n= s.length();
        String[] lh;
        lh = s.split(" ");   
        return lh[0];
    }
    private void btnThemThucAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemThucAnMouseClicked
        String lh= CutString(cbbLoaiHang.getSelectedItem().toString());
        ThucAnBUS ta=new ThucAnBUS(txtMaThucAn.getText(), txtTenThucAn.getText(), lh, 0, txtDonViTinh.getText());
        jLabel1.setText(ta.getMaThucAn());
        jLabel6.setText(ta.getMaLoaiHang());
        try {
            boolean a = ta.ThemThucAn(ta);
            if(a==true)
            {
                JOptionPane.showMessageDialog(null, "Thanh cong");
                
            }
            else JOptionPane.showMessageDialog(null,"That bai");
        } catch (SQLException ex) {
            Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemThucAnMouseClicked

    private void btnSuaThucAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaThucAnMouseClicked
        String lh= CutString(cbbLoaiHang.getSelectedItem().toString());
        ThucAnBUS ta=new ThucAnBUS(txtMaThucAn.getText(), txtTenThucAn.getText(), lh, 0, txtDonViTinh.getText());
      
        try {
            boolean a = ta.SuaThucAn(ta);
            if(a==true)
            {
                JOptionPane.showMessageDialog(null, "Thanh cong");
            }
            else JOptionPane.showMessageDialog(null,"That bai");
        } catch (SQLException ex) {
            Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaThucAnMouseClicked
    
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
            java.util.logging.Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSuaThucAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSuaThucAnGUI(thucan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaThucAn;
    private javax.swing.JButton btnThemThucAn;
    private javax.swing.JComboBox<String> cbbLoaiHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtMaThucAn;
    private javax.swing.JTextField txtTenThucAn;
    // End of variables declaration//GEN-END:variables
}
