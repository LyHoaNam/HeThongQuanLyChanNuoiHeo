/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.CapitalBUS;
import Element.NhanVienELE;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author cuhoa_000
 */
public class CapitalGUI extends javax.swing.JFrame {

    /**
     * Creates new form CapitalGUI
     */
    NhanVienELE objNV=null;
    public CapitalGUI() {
        
        initComponents();
        
    }
    private void PhanQuyen(String idTaiKhoan, String LoaiNhanVien)
    {
        CapitalBUS objCap=new CapitalBUS();
        ResultSet rs=objCap.getNhanVien(idTaiKhoan);
        
        try
        {
            while(rs.next())
            {
                objNV=new NhanVienELE(rs.getString("HoTen"),
                        rs.getString("MaNhanVien"),rs.getString("MaTaiKhoan"),
                        rs.getString("NgayVaoLam"),rs.getString("SoDienThoai"));
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi o CapitalGUI PhanQUyen " +exc);
        }
        lbUser.setText(objNV.getTenNhanVien());
        if(LoaiNhanVien.equals("k"))
        {
            jLbHeo.setVisible(false);
        }
        else
            if(LoaiNhanVien.equals("h"))
            {
                jLbKho.setVisible(false);
            }
    }
    public CapitalGUI(String idTaiKhoan, String sLoaiNhanVien)
    {
        initComponents();
        PhanQuyen(idTaiKhoan,sLoaiNhanVien);
    }
    private JPanel panelChild;
    private void ShowPanel(JPanel pn)
    {
        panelChild =pn;
        panelContain.removeAll();
        panelContain.add(panelChild);
        panelContain.validate();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jLbKho = new javax.swing.JLabel();
        jLbCaiDat = new javax.swing.JLabel();
        jLbHeo = new javax.swing.JLabel();
        jLbAccount = new javax.swing.JLabel();
        jLbBaoCaoThongKe = new javax.swing.JLabel();
        panelContain = new javax.swing.JPanel();
        panelTrungChu = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PanelMenu.setBackground(new java.awt.Color(51, 51, 51));
        PanelMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMenuMouseDragged(evt);
            }
        });

        jLbKho.setBackground(new java.awt.Color(51, 51, 51));
        jLbKho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/warehousewhite-02.png"))); // NOI18N
        jLbKho.setToolTipText("");
        jLbKho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbKho.setOpaque(true);
        jLbKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbKhoMouseClicked(evt);
            }
        });

        jLbCaiDat.setBackground(new java.awt.Color(51, 51, 51));
        jLbCaiDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbCaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/seting-white-02.png"))); // NOI18N
        jLbCaiDat.setToolTipText("");
        jLbCaiDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbCaiDat.setOpaque(true);
        jLbCaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbCaiDatMouseClicked(evt);
            }
        });

        jLbHeo.setBackground(new java.awt.Color(51, 51, 51));
        jLbHeo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbHeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/pig-white-02.png"))); // NOI18N
        jLbHeo.setToolTipText("");
        jLbHeo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbHeo.setOpaque(true);
        jLbHeo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbHeoMouseClicked(evt);
            }
        });

        jLbAccount.setBackground(new java.awt.Color(51, 51, 51));
        jLbAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLbAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/accountwhite-02.png"))); // NOI18N
        jLbAccount.setToolTipText("");
        jLbAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbAccount.setOpaque(true);
        jLbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbAccountMouseClicked(evt);
            }
        });

        jLbBaoCaoThongKe.setBackground(new java.awt.Color(51, 51, 51));
        jLbBaoCaoThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbBaoCaoThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/pie-chart-white-02.png"))); // NOI18N
        jLbBaoCaoThongKe.setToolTipText("");
        jLbBaoCaoThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbBaoCaoThongKe.setOpaque(true);
        jLbBaoCaoThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbBaoCaoThongKeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLbHeo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLbCaiDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLbKho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLbBaoCaoThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLbHeo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbKho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbBaoCaoThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        panelContain.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelTrungChuLayout = new javax.swing.GroupLayout(panelTrungChu);
        panelTrungChu.setLayout(panelTrungChuLayout);
        panelTrungChuLayout.setHorizontalGroup(
            panelTrungChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1053, Short.MAX_VALUE)
        );
        panelTrungChuLayout.setVerticalGroup(
            panelTrungChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        panelContain.add(panelTrungChu, java.awt.BorderLayout.CENTER);

        panelTitle.setBackground(new java.awt.Color(102, 102, 102));
        panelTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelTitleMouseDragged(evt);
            }
        });

        lbExit.setFont(new java.awt.Font("IrisUPC", 0, 11)); // NOI18N
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Multiply_26px.png"))); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/accountwhite-02.png"))); // NOI18N

        lbUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("User");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addGap(0, 838, Short.MAX_VALUE)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbHeoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbHeoMouseClicked
        // TODO add your handling code here:
      setLbColor(jLbHeo);
      resetLbColor(jLbKho);
      resetLbColor(jLbBaoCaoThongKe);
      resetLbColor(jLbAccount);
      resetLbColor(jLbCaiDat);
      ShowPanel(new HeoGUI());
    }//GEN-LAST:event_jLbHeoMouseClicked

    private void jLbKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbKhoMouseClicked
        // TODO add your handling code here:
      setLbColor(jLbKho);
      resetLbColor(jLbHeo);
      resetLbColor(jLbBaoCaoThongKe);
      resetLbColor(jLbAccount);
      resetLbColor(jLbCaiDat);
        
    }//GEN-LAST:event_jLbKhoMouseClicked

    private void jLbBaoCaoThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBaoCaoThongKeMouseClicked
        // TODO add your handling code here:
         setLbColor(jLbBaoCaoThongKe);
      resetLbColor(jLbKho);
      resetLbColor(jLbHeo);
      resetLbColor(jLbAccount);
      resetLbColor(jLbCaiDat);
      ShowPanel(new BaoCaoThongKe());
    }//GEN-LAST:event_jLbBaoCaoThongKeMouseClicked

    private void jLbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAccountMouseClicked
        // TODO add your handling code here:
       setLbColor(jLbAccount);
      resetLbColor(jLbKho);
      resetLbColor(jLbBaoCaoThongKe);
      resetLbColor(jLbHeo);
      resetLbColor(jLbCaiDat);
      ShowPanel(new TaiKhoanGUI());
    }//GEN-LAST:event_jLbAccountMouseClicked

    private void jLbCaiDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbCaiDatMouseClicked
        // TODO add your handling code here:
      setLbColor(jLbCaiDat);
      resetLbColor(jLbKho);
      resetLbColor(jLbBaoCaoThongKe);
      resetLbColor(jLbAccount);
      resetLbColor(jLbHeo);
    }//GEN-LAST:event_jLbCaiDatMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    int xx;
    int yy;
    private void panelTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTitleMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-yy);
    }//GEN-LAST:event_panelTitleMouseDragged

    private void PanelMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMenuMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-yy);
    }//GEN-LAST:event_PanelMenuMouseDragged
    private void setLbColor(JLabel jb)
    {
        jb.setBackground(new Color(0,204,153));
    }
    private void resetLbColor(JLabel lb)
    {
        lb.setBackground(new Color(51,51,51));
    }
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CapitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapitalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbAccount;
    private javax.swing.JLabel jLbBaoCaoThongKe;
    private javax.swing.JLabel jLbCaiDat;
    private javax.swing.JLabel jLbHeo;
    private javax.swing.JLabel jLbKho;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel panelContain;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panelTrungChu;
    // End of variables declaration//GEN-END:variables
}
