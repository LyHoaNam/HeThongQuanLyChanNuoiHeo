/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.KhoBUS;
import Business.LoaiHangBUS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import gui.KhoGUI;


/**
 *
 * @author Admin
 */
public class LoaiHangGUI extends javax.swing.JFrame {

    
    public LoaiHangGUI() {
        initComponents();
        HienThiLoaiHang();
    }

    //public KhoGUI() ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoaiHang_Sua = new javax.swing.JTextField();
        txtTenLoaiHang_Sua = new javax.swing.JTextField();
        btnLuuSua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnXoaLoaiHang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaLoaiHang_Them = new javax.swing.JTextField();
        txtTenLoaiHang_Them = new javax.swing.JTextField();
        btnThemLoaiHang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLoaiHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã loại hàng", "Tên loại hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiHang.setRowHeight(30);
        tblLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiHang);

        jLabel1.setText("LOẠI HÀNG");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã loại hàng:");

        jLabel3.setText("Tên loại hàng:");

        txtMaLoaiHang_Sua.setEnabled(false);

        btnLuuSua.setText("Lưu sửa");
        btnLuuSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuSuaMouseClicked(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        btnXoaLoaiHang.setText("Xóa");
        btnXoaLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaLoaiHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaLoaiHang_Sua)
                            .addComponent(txtTenLoaiHang_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnXoaLoaiHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLuuSua)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLoaiHang_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLoaiHang_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuuSua)
                    .addComponent(btnXoaLoaiHang))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Chi tiết loại hàng", jPanel2);

        jLabel4.setText("Mã loại hàng:");

        jLabel5.setText("Tên loại hàng:");

        btnThemLoaiHang.setText("Thêm");
        btnThemLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemLoaiHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaLoaiHang_Them)
                            .addComponent(txtTenLoaiHang_Them, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThemLoaiHang)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaLoaiHang_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenLoaiHang_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(btnThemLoaiHang)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thêm loại hàng", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiHangMouseClicked
        int selectedRowIndex = tblLoaiHang.getSelectedRow();
        String ma = tblLoaiHang.getValueAt(selectedRowIndex, 0).toString();
        txtMaLoaiHang_Sua.setText(ma);
        String ten= tblLoaiHang.getValueAt(selectedRowIndex, 1).toString();
        txtTenLoaiHang_Sua.setText(ten);
    }//GEN-LAST:event_tblLoaiHangMouseClicked
    //Luu sua loai hang
    private void btnLuuSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuSuaMouseClicked
        LoaiHangBUS lh = new LoaiHangBUS(txtMaLoaiHang_Sua.getText(), txtTenLoaiHang_Sua.getText());
        try {
            jLabel6.setText(lh.getMaLoaiHang());
            jLabel7.setText(lh.getTenLoaiHang());
            boolean a= lh.SuaLoaiHang(lh);
            if(a==true)
            {
            JOptionPane.showMessageDialog(null,"Sua thanh cong.");
            HienThiLoaiHang();
            }
            else JOptionPane.showMessageDialog(null,"Sua khong thanh cong.");
        } catch (SQLException ex) {
            Logger.getLogger(LoaiHangGUI.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }//GEN-LAST:event_btnLuuSuaMouseClicked
    //Them loai hang
    private void btnThemLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemLoaiHangMouseClicked
        LoaiHangBUS lh = new LoaiHangBUS(txtMaLoaiHang_Them.getText(), txtTenLoaiHang_Them.getText());
        try {
            
            if(lh.KiemTraKhoaChinh(lh)==true)
            {
                boolean a= lh.ThemLoaiHang(lh);
            if(a==true)
            {
            JOptionPane.showMessageDialog(null,"Them thanh cong.");
            HienThiLoaiHang();
            }
            else JOptionPane.showMessageDialog(null,"Them that bai."); 
            }
            else JOptionPane.showMessageDialog(null, "Mã loại hàng đã tồn tại.");
            
           
        } catch (SQLException ex) {
            Logger.getLogger(LoaiHangGUI.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_btnThemLoaiHangMouseClicked
    //Xoa loai hang
    private void btnXoaLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaLoaiHangMouseClicked
        LoaiHangBUS lh = new LoaiHangBUS(txtMaLoaiHang_Sua.getText(), txtTenLoaiHang_Sua.getText());
        int p =JOptionPane.showConfirmDialog(null, "Bạn sẽ xóa loại hàng: "+lh.getTenLoaiHang(), "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            try {
                boolean a = lh.XoaLoaiHang(lh);
                if(a==true)
            {
                JOptionPane.showMessageDialog(null, "Xoa thanh cong");
                HienThiLoaiHang();
                JPanel pn= new KhoGUI();
                pn.setVisible(true);
                
            }
            else JOptionPane.showMessageDialog(null, "Xoa that bai");
            } catch (SQLException ex) {
                Logger.getLogger(LoaiHangGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnXoaLoaiHangMouseClicked
    //Kiem tra cac truong bat buoc sua
    public boolean KiemTraTruongBatBuoc_Sua()
    {
        if(txtMaLoaiHang_Sua.getText()=="")
        {
            return false;
        }
        return true;
    }
    //Hien thi danh sach loai hang
    public void HienThiLoaiHang()
    {
        LoaiHangBUS lh = new LoaiHangBUS();
        ResultSet rs = lh.getLoaiHang();
        DefaultTableModel model;
        model= (DefaultTableModel) tblLoaiHang.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try {
            while(rs.next())
            {
                Vector vector  = new Vector();
                vector.add(rs.getString("MaLoaiHang"));
                vector.add(rs.getString("TenLoaiHang"));
                model.addRow(vector);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiHangGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            String ma = tblLoaiHang.getValueAt(0, 0).toString();
            txtMaLoaiHang_Sua.setText(ma);
            String ten= tblLoaiHang.getValueAt(0, 1).toString();
            txtTenLoaiHang_Sua.setText(ten);
            
    }
   
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
            java.util.logging.Logger.getLogger(LoaiHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoaiHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoaiHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoaiHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaiHangGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuSua;
    private javax.swing.JButton btnThemLoaiHang;
    private javax.swing.JButton btnXoaLoaiHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLoaiHang;
    private javax.swing.JTextField txtMaLoaiHang_Sua;
    private javax.swing.JTextField txtMaLoaiHang_Them;
    private javax.swing.JTextField txtTenLoaiHang_Sua;
    private javax.swing.JTextField txtTenLoaiHang_Them;
    // End of variables declaration//GEN-END:variables
}
