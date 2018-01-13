
package gui;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Business.HeoBUS;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Element.LoaiChuongELE;
import Element.ChuongELE;
import Element.HeoELE;
import Element.NhanVienELE;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author cuhoa_000
 */
public class HeoGUI extends javax.swing.JPanel {

    /**
     * Creates new form HeoGUI
     */
    
    ArrayList<LoaiChuongELE> lsLC=new ArrayList();
    ArrayList<ChuongELE> lsC=new ArrayList();
    ArrayList<HeoELE> lsHeo=new ArrayList();
    private String sMaLoaiChuong;
    private String sMaChuong;
    private NhanVienELE objNV;
    public HeoGUI() {
        initComponents();
        showInfo();
        
    }
    public HeoGUI(NhanVienELE nv)
    {
        initComponents();
        showInfo();
        this.objNV=nv;
    }
    private  void showInfo()
    {
        showMenuLoaiChuong();
        JtxtSoLuongChuong.setText(lsLC.get(0).getSoLuongChuong());
        JtxtSoLuongChuong1.setText(lsLC.get(1).getSoLuongChuong());
        JtxtSoLuongChuong2.setText(lsLC.get(2).getSoLuongChuong());
        JtxtSoLuongChuong3.setText(lsLC.get(3).getSoLuongChuong());
        JtxtSoLuongChuong4.setText(lsLC.get(4).getSoLuongChuong());
        
        jTxtSucChua.setText(lsLC.get(0).getQuiDinh());
        jTxtSucChua1.setText(lsLC.get(1).getQuiDinh());
        jTxtSucChua2.setText(lsLC.get(2).getQuiDinh());
        jTxtSucChua3.setText(lsLC.get(3).getQuiDinh());
        jTxtSucChua4.setText(lsLC.get(4).getQuiDinh());
        
    }
  
      private void showMenuLoaiChuong()
      {
          HeoBUS objHeo=new HeoBUS();
          ResultSet rs= objHeo.getLoaiChuong(); //loai Chuong
          
          int i=0;
          
          try
          {
              while(rs.next())
              {
                  int itemp=objHeo.getSoLuongChuong(rs.getString("MaLoaiChuong"));
                  LoaiChuongELE tempLC=new LoaiChuongELE(rs.getString("MaLoaiChuong"),rs.getString("TenLoaiChuong"),
                          rs.getInt("QuyDinhSoLuong"),itemp);              
                  lsLC.add(tempLC);
                  
                  
              }
          }
          catch(SQLException exc)
          {
              System.out.println(exc);
          }
       
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuLC = new javax.swing.JPanel();
        panelChuongMangThai = new javax.swing.JPanel();
        jLbSoLuongHeo1 = new javax.swing.JLabel();
        JtxtSoLuongChuong1 = new javax.swing.JTextField();
        jLbSucChua1 = new javax.swing.JLabel();
        jTxtSucChua1 = new javax.swing.JTextField();
        lbChuongMangThai = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelMenuChuongHeoDe = new javax.swing.JPanel();
        jLbSoLuongHeo = new javax.swing.JLabel();
        JtxtSoLuongChuong = new javax.swing.JTextField();
        jLbSucChua = new javax.swing.JLabel();
        jTxtSucChua = new javax.swing.JTextField();
        lbChuongDeCon = new javax.swing.JLabel();
        lbChuongHeoNaiDeCon = new javax.swing.JLabel();
        panelHeoGiong = new javax.swing.JPanel();
        jLbSoLuongHeo2 = new javax.swing.JLabel();
        jLbSucChua2 = new javax.swing.JLabel();
        jTxtSucChua2 = new javax.swing.JTextField();
        JtxtSoLuongChuong2 = new javax.swing.JTextField();
        lbChuongDucGiong = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelChoPhoiGiong = new javax.swing.JPanel();
        jLbSucChua3 = new javax.swing.JLabel();
        jLbSoLuongHeo3 = new javax.swing.JLabel();
        jTxtSucChua3 = new javax.swing.JTextField();
        JtxtSoLuongChuong3 = new javax.swing.JTextField();
        lbChuongPhoiGiong = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelChuongHeoThit = new javax.swing.JPanel();
        jLbSoLuongHeo4 = new javax.swing.JLabel();
        jLbSucChua4 = new javax.swing.JLabel();
        jTxtSucChua4 = new javax.swing.JTextField();
        JtxtSoLuongChuong4 = new javax.swing.JTextField();
        lbChuongHeoThit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelThongBao = new javax.swing.JPanel();
        lbThongBao = new javax.swing.JLabel();
        panelMenuLoaiChuong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHeo = new javax.swing.JTable();
        jTxt_TimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbChuong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblAddPig = new javax.swing.JLabel();
        lblEat = new javax.swing.JLabel();
        lbChuyenChuong = new javax.swing.JLabel();
        lbXuatChuong = new javax.swing.JLabel();
        lbThuoc = new javax.swing.JLabel();
        lbMaChuong = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbCanNang = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuLC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelChuongMangThai.setBackground(new java.awt.Color(255, 255, 255));
        panelChuongMangThai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelChuongMangThai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChuongMangThaiMouseClicked(evt);
            }
        });
        panelChuongMangThai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbSoLuongHeo1.setText("Số Lượng Chuồng:");
        panelChuongMangThai.add(jLbSoLuongHeo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 34, -1, -1));
        panelChuongMangThai.add(JtxtSoLuongChuong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 27, -1));

        jLbSucChua1.setText("Sức chứa:");
        panelChuongMangThai.add(jLbSucChua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 60, 90, -1));
        panelChuongMangThai.add(jTxtSucChua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 26, -1));

        lbChuongMangThai.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongMangThai.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongMangThai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongMangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongMangThai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongMangThai.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongMangThai.setIconTextGap(3);
        lbChuongMangThai.setOpaque(true);
        lbChuongMangThai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelChuongMangThai.add(lbChuongMangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 87));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 114, 63));
        jLabel6.setText("CHUỒNG HEO NÁI MANG THAI");
        panelChuongMangThai.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 11, -1, -1));

        panelMenuLC.add(panelChuongMangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, -1));

        panelMenuChuongHeoDe.setBackground(new java.awt.Color(255, 255, 255));
        panelMenuChuongHeoDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenuChuongHeoDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuChuongHeoDeMouseClicked(evt);
            }
        });
        panelMenuChuongHeoDe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbSoLuongHeo.setText("Số Lượng Chuồng:");
        panelMenuChuongHeoDe.add(jLbSoLuongHeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 34, -1, -1));
        panelMenuChuongHeoDe.add(JtxtSoLuongChuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 29, -1));

        jLbSucChua.setText("Sức chứa:");
        panelMenuChuongHeoDe.add(jLbSucChua, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 60, 89, -1));
        panelMenuChuongHeoDe.add(jTxtSucChua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 29, -1));

        lbChuongDeCon.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongDeCon.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongDeCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongDeCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongDeCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongDeCon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongDeCon.setIconTextGap(3);
        lbChuongDeCon.setOpaque(true);
        lbChuongDeCon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelMenuChuongHeoDe.add(lbChuongDeCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 87));

        lbChuongHeoNaiDeCon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbChuongHeoNaiDeCon.setForeground(new java.awt.Color(0, 114, 63));
        lbChuongHeoNaiDeCon.setText("CHUỒNG HEO NÁI ĐẺ CON");
        panelMenuChuongHeoDe.add(lbChuongHeoNaiDeCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 11, -1, -1));

        panelMenuLC.add(panelMenuChuongHeoDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, -1));

        panelHeoGiong.setBackground(new java.awt.Color(255, 255, 255));
        panelHeoGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelHeoGiong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHeoGiongMouseClicked(evt);
            }
        });
        panelHeoGiong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbSoLuongHeo2.setText("Số Lượng Chuồng:");
        panelHeoGiong.add(jLbSoLuongHeo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLbSucChua2.setText("Sức chứa:");
        panelHeoGiong.add(jLbSucChua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 83, -1));
        panelHeoGiong.add(jTxtSucChua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 32, -1));
        panelHeoGiong.add(JtxtSoLuongChuong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 32, -1));

        lbChuongDucGiong.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongDucGiong.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongDucGiong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongDucGiong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongDucGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongDucGiong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongDucGiong.setIconTextGap(3);
        lbChuongDucGiong.setOpaque(true);
        lbChuongDucGiong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelHeoGiong.add(lbChuongDucGiong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 87));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 114, 63));
        jLabel11.setText("CHUỒNG HEO ĐỰC GIỐNG");
        panelHeoGiong.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 11, -1, -1));

        panelMenuLC.add(panelHeoGiong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 323, 290, -1));

        panelChoPhoiGiong.setBackground(new java.awt.Color(255, 255, 255));
        panelChoPhoiGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelChoPhoiGiong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChoPhoiGiongMouseClicked(evt);
            }
        });
        panelChoPhoiGiong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbSucChua3.setText("Sức chứa:");
        panelChoPhoiGiong.add(jLbSucChua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 89, -1));

        jLbSoLuongHeo3.setText("Số Lượng Chuồng:");
        panelChoPhoiGiong.add(jLbSoLuongHeo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));
        panelChoPhoiGiong.add(jTxtSucChua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 34, -1));

        JtxtSoLuongChuong3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtSoLuongChuong3ActionPerformed(evt);
            }
        });
        panelChoPhoiGiong.add(JtxtSoLuongChuong3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 34, -1));

        lbChuongPhoiGiong.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongPhoiGiong.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongPhoiGiong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongPhoiGiong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongPhoiGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongPhoiGiong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongPhoiGiong.setIconTextGap(3);
        lbChuongPhoiGiong.setOpaque(true);
        lbChuongPhoiGiong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelChoPhoiGiong.add(lbChuongPhoiGiong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 87));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 114, 63));
        jLabel12.setText("CHUỒNG HEO CHỜ PHỐI GIỐNG");
        panelChoPhoiGiong.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 11, -1, -1));

        panelMenuLC.add(panelChoPhoiGiong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 290, -1));

        panelChuongHeoThit.setBackground(new java.awt.Color(255, 255, 255));
        panelChuongHeoThit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelChuongHeoThit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChuongHeoThitMouseClicked(evt);
            }
        });
        panelChuongHeoThit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbSoLuongHeo4.setText("Số Lượng Chuồng:");
        panelChuongHeoThit.add(jLbSoLuongHeo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLbSucChua4.setText("Sức chứa:");
        panelChuongHeoThit.add(jLbSucChua4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 89, -1));
        panelChuongHeoThit.add(jTxtSucChua4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 34, -1));
        panelChuongHeoThit.add(JtxtSoLuongChuong4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 34, -1));

        lbChuongHeoThit.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongHeoThit.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongHeoThit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongHeoThit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongHeoThit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongHeoThit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongHeoThit.setIconTextGap(3);
        lbChuongHeoThit.setOpaque(true);
        lbChuongHeoThit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelChuongHeoThit.add(lbChuongHeoThit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 87));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 114, 63));
        jLabel4.setText("CHUỒNG HEO THỊT");
        panelChuongHeoThit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 11, -1, -1));

        panelMenuLC.add(panelChuongHeoThit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 553, 290, 86));

        add(panelMenuLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        panelThongBao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelThongBaoLayout = new javax.swing.GroupLayout(panelThongBao);
        panelThongBao.setLayout(panelThongBaoLayout);
        panelThongBaoLayout.setHorizontalGroup(
            panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongBaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThongBao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThongBaoLayout.setVerticalGroup(
            panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongBaoLayout.createSequentialGroup()
                .addComponent(lbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        add(panelThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 725, 1204, -1));

        panelMenuLoaiChuong.setBackground(new java.awt.Color(255, 255, 255));
        panelMenuLoaiChuong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbHeo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Stt", "Mã Heo", "Tình Trạng", "Giá Nhập", "Xuất Xứ", "Heo Mẹ", "Heo Cha"
            }
        ));
        jScrollPane1.setViewportView(tbHeo);
        if (tbHeo.getColumnModel().getColumnCount() > 0) {
            tbHeo.getColumnModel().getColumn(0).setMinWidth(15);
            tbHeo.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        panelMenuLoaiChuong.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 86, 511, 520));
        panelMenuLoaiChuong.add(jTxt_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 33, 139, 27));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/loupe.png"))); // NOI18N
        panelMenuLoaiChuong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 33, 34, 27));

        tbChuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Chuồng", "Số Lượng Heo", "Thông báo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChuong.setToolTipText("");
        tbChuong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChuongMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbChuong);
        if (tbChuong.getColumnModel().getColumnCount() > 0) {
            tbChuong.getColumnModel().getColumn(2).setCellRenderer(new Notification());
        }

        panelMenuLoaiChuong.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 86, 250, 520));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH CHUỒNG");
        jLabel1.setOpaque(true);
        panelMenuLoaiChuong.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 33, 242, 27));

        lblAddPig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/plus (1).png"))); // NOI18N
        lblAddPig.setText("Thêm heo");
        lblAddPig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddPig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddPigMouseClicked(evt);
            }
        });
        panelMenuLoaiChuong.add(lblAddPig, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 624, -1, 32));

        lblEat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/restaurant.png"))); // NOI18N
        lblEat.setText("Cho Ăn");
        lblEat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEatMouseClicked(evt);
            }
        });
        panelMenuLoaiChuong.add(lblEat, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 628, -1, -1));

        lbChuyenChuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Shekel_24px.png"))); // NOI18N
        lbChuyenChuong.setText("Chuyển chuồng");
        lbChuyenChuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuyenChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChuyenChuongMouseClicked(evt);
            }
        });
        panelMenuLoaiChuong.add(lbChuyenChuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 624, 111, 32));

        lbXuatChuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Sign Out_24px.png"))); // NOI18N
        lbXuatChuong.setText("Xuất chuồng");
        lbXuatChuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbXuatChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXuatChuongMouseClicked(evt);
            }
        });
        panelMenuLoaiChuong.add(lbXuatChuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 626, 99, 28));

        lbThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Medical Bag_24px.png"))); // NOI18N
        lbThuoc.setText("Bệnh");
        lbThuoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThuocMouseClicked(evt);
            }
        });
        panelMenuLoaiChuong.add(lbThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 628, 65, -1));

        lbMaChuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMaChuong.setText("MÃ CHUỒNG:");
        panelMenuLoaiChuong.add(lbMaChuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 114, 63));
        jLabel8.setText("MÃ CHUỒNG:");
        panelMenuLoaiChuong.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        lbCanNang.setText("Can nang");
        lbCanNang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCanNangMouseClicked(evt);
            }
        });
        panelMenuLoaiChuong.add(lbCanNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, -1, -1));

        add(panelMenuLoaiChuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 830, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void showDanhSachChuong(String idMaChuong)
    {
        HeoBUS objHeoBUS=new HeoBUS();
          ResultSet rs=objHeoBUS.getChuong(idMaChuong);
          DefaultTableModel model;
            model = (DefaultTableModel) tbChuong.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
          try
          {
          while(rs.next())
          {
              ChuongELE tempCH = new ChuongELE(rs.getString("MaChuong"),rs.getString("MaLoaiChuong"),rs.getInt("SoLuongHeoDangChua"));
              lsC.add(tempCH);
               // Vector vector=new Vector();
               // vector.add(tempCH.getMaChuong());
                //vector.add(tempCH.getSoLuongHeoDangChua());
                 //Object []oChuong = {tempCH.getMaChuong(),tempCH.getSoLuongHeoDangChua(),""};   
                 model.addRow(new Object[]{tempCH.getMaChuong(),tempCH.getSoLuongHeoDangChua(),""});

          }
          }
          catch(SQLException exc)
          {
              System.out.println(exc);
          }
    }
    private void tbChuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChuongMouseClicked
        // TODO add your handling code here:
        int row = tbChuong.getSelectedRow();
        lsHeo.clear();//reset danh sach
        
            String valueTableChuong = tbChuong.getModel().getValueAt(row, 0).toString();
            this.sMaChuong=valueTableChuong;
            lbMaChuong.setText(valueTableChuong);
//            if(tbChuong.getModel().getValueAt(row, 2) != "")
//            {
//               lbThongBao.setText("ĐÃ ĐẾN GIỜ CHO ĂN");
//            }
//            else
//                lbThongBao.setText(null);

            HeoBUS hb=new HeoBUS();
            //chinh table
            DefaultTableModel model;
            model = (DefaultTableModel) tbHeo.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
            ResultSet rs=hb.getTableHeo(valueTableChuong);
            int iStt=0;
            try {
                while(rs.next())
                {
                   
                   Vector vector=new Vector();
                   vector.add(iStt);
                   iStt++;
                HeoELE objHeo=new HeoELE(rs.getString("MaHeo"),rs.getString("TinhTrang"),
                rs.getString("GiaNhap"),rs.getString("XuatXu"),rs.getString("HeoMe"),rs.getString("HeoCha"));
                vector.add(rs.getString("MaHeo"));
          
                vector.add(rs.getString("TinhTrang"));
                
                vector.add(rs.getString("GiaNhap"));
                vector.add(rs.getString("XuatXu"));
                vector.add(rs.getString("HeoMe"));
                vector.add(rs.getString("HeoCha"));
                lsHeo.add(objHeo);
                model.addRow(vector);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(HeoGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tbChuongMouseClicked

    private void panelMenuChuongHeoDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuChuongHeoDeMouseClicked
        // TODO add your handling code here:
         showDanhSachChuong("LC01");
         this.sMaLoaiChuong="LC01";
         setLbColor(lbChuongDeCon);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongMangThai);
        
    }//GEN-LAST:event_panelMenuChuongHeoDeMouseClicked


    private void lblAddPigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPigMouseClicked
        // TODO add your handling code here:
       String sMaChuong=(String) tbChuong.getModel().getValueAt(tbChuong.getSelectedRow(), 0);
        //ThemHeoConGUI.getObj(sMaChuong).setVisible(true);
        ThemHeoConGUI AddPigFr=new ThemHeoConGUI(sMaChuong);
        AddPigFr.setVisible(true);
        
        
    }//GEN-LAST:event_lblAddPigMouseClicked

    private void lblEatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEatMouseClicked
        // TODO add your handling code here:
        String sMaChuong=(String) tbChuong.getModel().getValueAt(tbChuong.getSelectedRow(), 0);
        //ChoAnGUI.getObj(sMaChuong,"LC01",this.objNV).setVisible(true);
        ChoAnGUI fr=new ChoAnGUI(sMaChuong,this.sMaLoaiChuong,this.objNV);
        fr.setVisible(true);
        showDanhSachChuong(this.sMaLoaiChuong);
        
    }//GEN-LAST:event_lblEatMouseClicked

    private void JtxtSoLuongChuong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtSoLuongChuong3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtSoLuongChuong3ActionPerformed

    private void panelChuongMangThaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChuongMangThaiMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC02");
        this.sMaLoaiChuong="LC02";
        setLbColor(lbChuongMangThai);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongDucGiong);
        
    }//GEN-LAST:event_panelChuongMangThaiMouseClicked

    private void panelHeoGiongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeoGiongMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC04");
        this.sMaLoaiChuong="LC04";
        setLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongMangThai);
    }//GEN-LAST:event_panelHeoGiongMouseClicked

    private void panelChoPhoiGiongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChoPhoiGiongMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC03");
        this.sMaLoaiChuong="LC03";
        setLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongMangThai);
    }//GEN-LAST:event_panelChoPhoiGiongMouseClicked

    private void panelChuongHeoThitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChuongHeoThitMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC05");
        this.sMaLoaiChuong="LC05";
        setLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongMangThai);
    }//GEN-LAST:event_panelChuongHeoThitMouseClicked

    private void lbChuyenChuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChuyenChuongMouseClicked
        // TODO add your handling code here:
         ArrayList<HeoELE> lstSelHeo= new ArrayList();
        int []index=tbHeo.getSelectedRows();
        for(int i=0;i<index.length;i++)
        {
            lstSelHeo.add(lsHeo.get(index[i]));
         
        }
        String sMaChuong=(String) tbChuong.getModel().getValueAt(tbChuong.getSelectedRow(), 0);
        String sTenLoaiChuong=lbChuongHeoNaiDeCon.getText();
        ChuyenChuongGUI fr=new ChuyenChuongGUI(sTenLoaiChuong, sMaChuong,lstSelHeo);
        fr.setVisible(true);
    }//GEN-LAST:event_lbChuyenChuongMouseClicked


    private void lbThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThuocMouseClicked
        // TODO add your handling code here:
        String sMaHeo=(String) tbHeo.getModel().getValueAt(tbHeo.getSelectedRow(), 1);
     
        //ThuocGUI.getObj(sMaHeo).setVisible(true);
        ThuocGUI fr=new ThuocGUI(sMaHeo);
        fr.setVisible(true);
    }//GEN-LAST:event_lbThuocMouseClicked

    private void lbXuatChuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXuatChuongMouseClicked
        // TODO add your handling code here:
         ArrayList<HeoELE> lsHeoXuat = new ArrayList();
        int []index=tbHeo.getSelectedRows();
        for(int i=0;i<index.length;i++)
        {
            lsHeoXuat.add(lsHeo.get(index[i]));
        }
        XuatChuongGUI fr = new XuatChuongGUI(lsHeoXuat,objNV,sMaChuong);
        fr.setVisible(true);
    }//GEN-LAST:event_lbXuatChuongMouseClicked

    private void lbCanNangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCanNangMouseClicked
        // TODO add your handling code here:
        String sMaHeo=(String) tbHeo.getModel().getValueAt(tbHeo.getSelectedRow(), 1);
        CanNangGUI fr=new CanNangGUI(sMaHeo);
        fr.setVisible(true);
    }//GEN-LAST:event_lbCanNangMouseClicked

       private void setLbColor(JLabel jlb) {
       
        jlb.setBackground(new Color(0,153,120));
    }

    private void resetLbColor(JLabel jlb) {
         jlb.setBackground(new Color(0,182,121)); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtSoLuongChuong;
    private javax.swing.JTextField JtxtSoLuongChuong1;
    private javax.swing.JTextField JtxtSoLuongChuong2;
    private javax.swing.JTextField JtxtSoLuongChuong3;
    private javax.swing.JTextField JtxtSoLuongChuong4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbSoLuongHeo;
    private javax.swing.JLabel jLbSoLuongHeo1;
    private javax.swing.JLabel jLbSoLuongHeo2;
    private javax.swing.JLabel jLbSoLuongHeo3;
    private javax.swing.JLabel jLbSoLuongHeo4;
    private javax.swing.JLabel jLbSucChua;
    private javax.swing.JLabel jLbSucChua1;
    private javax.swing.JLabel jLbSucChua2;
    private javax.swing.JLabel jLbSucChua3;
    private javax.swing.JLabel jLbSucChua4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTxtSucChua;
    private javax.swing.JTextField jTxtSucChua1;
    private javax.swing.JTextField jTxtSucChua2;
    private javax.swing.JTextField jTxtSucChua3;
    private javax.swing.JTextField jTxtSucChua4;
    private javax.swing.JTextField jTxt_TimKiem;
    private javax.swing.JLabel lbCanNang;
    private javax.swing.JLabel lbChuongDeCon;
    private javax.swing.JLabel lbChuongDucGiong;
    private javax.swing.JLabel lbChuongHeoNaiDeCon;
    private javax.swing.JLabel lbChuongHeoThit;
    private javax.swing.JLabel lbChuongMangThai;
    private javax.swing.JLabel lbChuongPhoiGiong;
    private javax.swing.JLabel lbChuyenChuong;
    private javax.swing.JLabel lbMaChuong;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JLabel lbThuoc;
    private javax.swing.JLabel lbXuatChuong;
    private javax.swing.JLabel lblAddPig;
    private javax.swing.JLabel lblEat;
    private javax.swing.JPanel panelChoPhoiGiong;
    private javax.swing.JPanel panelChuongHeoThit;
    private javax.swing.JPanel panelChuongMangThai;
    private javax.swing.JPanel panelHeoGiong;
    private javax.swing.JPanel panelMenuChuongHeoDe;
    private javax.swing.JPanel panelMenuLC;
    private javax.swing.JPanel panelMenuLoaiChuong;
    private javax.swing.JPanel panelThongBao;
    private javax.swing.JTable tbChuong;
    private javax.swing.JTable tbHeo;
    // End of variables declaration//GEN-END:variables
}
