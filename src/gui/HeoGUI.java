/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
<<<<<<< HEAD

=======
import javax.swing.table.TableModel;
>>>>>>> heofrom-xuatchuong
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
    public HeoGUI() {
        initComponents();
        showInfo();
        
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

        setBackground(new java.awt.Color(235, 233, 233));

        panelChuongMangThai.setBackground(new java.awt.Color(255, 255, 255));
        panelChuongMangThai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelChuongMangThai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChuongMangThaiMouseClicked(evt);
            }
        });

        jLbSoLuongHeo1.setText("Số Lượng Chuồng:");

        jLbSucChua1.setText("Sức chứa:");

        lbChuongMangThai.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongMangThai.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongMangThai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongMangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongMangThai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongMangThai.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongMangThai.setIconTextGap(3);
        lbChuongMangThai.setOpaque(true);
        lbChuongMangThai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 114, 63));
        jLabel6.setText("CHUỒNG HEO NÁI MANG THAI");

        javax.swing.GroupLayout panelChuongMangThaiLayout = new javax.swing.GroupLayout(panelChuongMangThai);
        panelChuongMangThai.setLayout(panelChuongMangThaiLayout);
        panelChuongMangThaiLayout.setHorizontalGroup(
            panelChuongMangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuongMangThaiLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbChuongMangThai)
                .addGap(6, 6, 6)
                .addGroup(panelChuongMangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelChuongMangThaiLayout.createSequentialGroup()
                        .addComponent(jLbSoLuongHeo1)
                        .addGap(24, 24, 24)
                        .addComponent(JtxtSoLuongChuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelChuongMangThaiLayout.createSequentialGroup()
                        .addComponent(jLbSucChua1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jTxtSucChua1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelChuongMangThaiLayout.setVerticalGroup(
            panelChuongMangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbChuongMangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelChuongMangThaiLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(panelChuongMangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChuongMangThaiLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLbSoLuongHeo1))
                    .addComponent(JtxtSoLuongChuong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelChuongMangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSucChua1)
                    .addComponent(jTxtSucChua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelMenuChuongHeoDe.setBackground(new java.awt.Color(255, 255, 255));
        panelMenuChuongHeoDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenuChuongHeoDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuChuongHeoDeMouseClicked(evt);
            }
        });

        jLbSoLuongHeo.setText("Số Lượng Chuồng:");

        jLbSucChua.setText("Sức chứa:");

        lbChuongDeCon.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongDeCon.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongDeCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongDeCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongDeCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongDeCon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongDeCon.setIconTextGap(3);
        lbChuongDeCon.setOpaque(true);
        lbChuongDeCon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lbChuongHeoNaiDeCon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbChuongHeoNaiDeCon.setForeground(new java.awt.Color(0, 114, 63));
        lbChuongHeoNaiDeCon.setText("CHUỒNG HEO NÁI ĐẺ CON");

        javax.swing.GroupLayout panelMenuChuongHeoDeLayout = new javax.swing.GroupLayout(panelMenuChuongHeoDe);
        panelMenuChuongHeoDe.setLayout(panelMenuChuongHeoDeLayout);
        panelMenuChuongHeoDeLayout.setHorizontalGroup(
            panelMenuChuongHeoDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuChuongHeoDeLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbChuongDeCon)
                .addGap(6, 6, 6)
                .addGroup(panelMenuChuongHeoDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChuongHeoNaiDeCon)
                    .addGroup(panelMenuChuongHeoDeLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panelMenuChuongHeoDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuChuongHeoDeLayout.createSequentialGroup()
                                .addComponent(jLbSoLuongHeo)
                                .addGap(23, 23, 23)
                                .addComponent(JtxtSoLuongChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuChuongHeoDeLayout.createSequentialGroup()
                                .addComponent(jLbSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jTxtSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelMenuChuongHeoDeLayout.setVerticalGroup(
            panelMenuChuongHeoDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbChuongDeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelMenuChuongHeoDeLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbChuongHeoNaiDeCon)
                .addGap(5, 5, 5)
                .addGroup(panelMenuChuongHeoDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuChuongHeoDeLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLbSoLuongHeo))
                    .addComponent(JtxtSoLuongChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelMenuChuongHeoDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSucChua)
                    .addComponent(jTxtSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelHeoGiong.setBackground(new java.awt.Color(255, 255, 255));
        panelHeoGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelHeoGiong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHeoGiongMouseClicked(evt);
            }
        });

        jLbSoLuongHeo2.setText("Số Lượng Chuồng:");

        jLbSucChua2.setText("Sức chứa:");

        lbChuongDucGiong.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongDucGiong.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongDucGiong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongDucGiong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongDucGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongDucGiong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongDucGiong.setIconTextGap(3);
        lbChuongDucGiong.setOpaque(true);
        lbChuongDucGiong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 114, 63));
        jLabel11.setText("CHUỒNG HEO ĐỰC GIỐNG");

        javax.swing.GroupLayout panelHeoGiongLayout = new javax.swing.GroupLayout(panelHeoGiong);
        panelHeoGiong.setLayout(panelHeoGiongLayout);
        panelHeoGiongLayout.setHorizontalGroup(
            panelHeoGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeoGiongLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbChuongDucGiong)
                .addGap(6, 6, 6)
                .addGroup(panelHeoGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(panelHeoGiongLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelHeoGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHeoGiongLayout.createSequentialGroup()
                                .addComponent(jLbSoLuongHeo2)
                                .addGap(21, 21, 21)
                                .addComponent(JtxtSoLuongChuong2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelHeoGiongLayout.createSequentialGroup()
                                .addComponent(jLbSucChua2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTxtSucChua2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelHeoGiongLayout.setVerticalGroup(
            panelHeoGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbChuongDucGiong, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelHeoGiongLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addGroup(panelHeoGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSoLuongHeo2)
                    .addComponent(JtxtSoLuongChuong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelHeoGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSucChua2)
                    .addComponent(jTxtSucChua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelChoPhoiGiong.setBackground(new java.awt.Color(255, 255, 255));
        panelChoPhoiGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelChoPhoiGiong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChoPhoiGiongMouseClicked(evt);
            }
        });

        jLbSucChua3.setText("Sức chứa:");

        jLbSoLuongHeo3.setText("Số Lượng Chuồng:");

        JtxtSoLuongChuong3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtSoLuongChuong3ActionPerformed(evt);
            }
        });

        lbChuongPhoiGiong.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongPhoiGiong.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongPhoiGiong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongPhoiGiong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongPhoiGiong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongPhoiGiong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongPhoiGiong.setIconTextGap(3);
        lbChuongPhoiGiong.setOpaque(true);
        lbChuongPhoiGiong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 114, 63));
        jLabel12.setText("CHUỒNG HEO CHỜ PHỐI GIỐNG");

        javax.swing.GroupLayout panelChoPhoiGiongLayout = new javax.swing.GroupLayout(panelChoPhoiGiong);
        panelChoPhoiGiong.setLayout(panelChoPhoiGiongLayout);
        panelChoPhoiGiongLayout.setHorizontalGroup(
            panelChoPhoiGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChoPhoiGiongLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbChuongPhoiGiong)
                .addGap(6, 6, 6)
                .addGroup(panelChoPhoiGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(panelChoPhoiGiongLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelChoPhoiGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelChoPhoiGiongLayout.createSequentialGroup()
                                .addComponent(jLbSoLuongHeo3)
                                .addGap(21, 21, 21)
                                .addComponent(JtxtSoLuongChuong3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelChoPhoiGiongLayout.createSequentialGroup()
                                .addComponent(jLbSucChua3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTxtSucChua3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelChoPhoiGiongLayout.setVerticalGroup(
            panelChoPhoiGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbChuongPhoiGiong, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelChoPhoiGiongLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addGroup(panelChoPhoiGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSoLuongHeo3)
                    .addComponent(JtxtSoLuongChuong3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelChoPhoiGiongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbSucChua3)
                    .addComponent(jTxtSucChua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelChuongHeoThit.setBackground(new java.awt.Color(255, 255, 255));
        panelChuongHeoThit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelChuongHeoThit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChuongHeoThitMouseClicked(evt);
            }
        });

        jLbSoLuongHeo4.setText("Số Lượng Chuồng:");

        jLbSucChua4.setText("Sức chứa:");

        lbChuongHeoThit.setBackground(new java.awt.Color(0, 182, 121));
        lbChuongHeoThit.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbChuongHeoThit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuongHeoThit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Wind Speed Less 1_100px.png"))); // NOI18N
        lbChuongHeoThit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuongHeoThit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbChuongHeoThit.setIconTextGap(3);
        lbChuongHeoThit.setOpaque(true);
        lbChuongHeoThit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 114, 63));
        jLabel4.setText("CHUỒNG HEO THỊT");

        javax.swing.GroupLayout panelChuongHeoThitLayout = new javax.swing.GroupLayout(panelChuongHeoThit);
        panelChuongHeoThit.setLayout(panelChuongHeoThitLayout);
        panelChuongHeoThitLayout.setHorizontalGroup(
            panelChuongHeoThitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuongHeoThitLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbChuongHeoThit)
                .addGap(6, 6, 6)
                .addGroup(panelChuongHeoThitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelChuongHeoThitLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelChuongHeoThitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbSoLuongHeo4)
                            .addComponent(jLbSucChua4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(panelChuongHeoThitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtxtSoLuongChuong4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSucChua4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelChuongHeoThitLayout.setVerticalGroup(
            panelChuongHeoThitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbChuongHeoThit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelChuongHeoThitLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jLbSoLuongHeo4)
                .addGap(16, 16, 16)
                .addComponent(jLbSucChua4))
            .addGroup(panelChuongHeoThitLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JtxtSoLuongChuong4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTxtSucChua4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelMenuLCLayout = new javax.swing.GroupLayout(panelMenuLC);
        panelMenuLC.setLayout(panelMenuLCLayout);
        panelMenuLCLayout.setHorizontalGroup(
            panelMenuLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLCLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelMenuLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelChuongMangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMenuChuongHeoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelHeoGiong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelChoPhoiGiong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelChuongHeoThit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelMenuLCLayout.setVerticalGroup(
            panelMenuLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLCLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panelChuongMangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(panelMenuChuongHeoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(panelHeoGiong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panelChoPhoiGiong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panelChuongHeoThit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelThongBao.setBackground(new java.awt.Color(255, 255, 255));

        lbThongBao.setText("jLabel3");

        javax.swing.GroupLayout panelThongBaoLayout = new javax.swing.GroupLayout(panelThongBao);
        panelThongBao.setLayout(panelThongBaoLayout);
        panelThongBaoLayout.setHorizontalGroup(
            panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongBaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThongBao)
                .addContainerGap(686, Short.MAX_VALUE))
        );
        panelThongBaoLayout.setVerticalGroup(
            panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongBaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbThongBao)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelMenuLoaiChuong.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/loupe.png"))); // NOI18N

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
<<<<<<< HEAD
        jScrollPane3.setViewportView(tableChuong);
        if (tableChuong.getColumnModel().getColumnCount() > 0) {
            tableChuong.getColumnModel().getColumn(2).setCellRenderer(new Notification());
        }
=======
        jScrollPane3.setViewportView(tbChuong);
>>>>>>> heofrom-xuatchuong

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH CHUỒNG");
        jLabel1.setOpaque(true);

        lblAddPig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/plus (1).png"))); // NOI18N
        lblAddPig.setText("Thêm heo");
        lblAddPig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddPig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddPigMouseClicked(evt);
            }
        });

        lblEat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/restaurant.png"))); // NOI18N
        lblEat.setText("Cho Ăn");
        lblEat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEatMouseClicked(evt);
            }
        });

        lbChuyenChuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Shekel_24px.png"))); // NOI18N
        lbChuyenChuong.setText("Chuyển chuồng");
        lbChuyenChuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChuyenChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChuyenChuongMouseClicked(evt);
            }
        });

        lbXuatChuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Sign Out_24px.png"))); // NOI18N
        lbXuatChuong.setText("Xuất chuồng");
        lbXuatChuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbXuatChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXuatChuongMouseClicked(evt);
            }
        });

        lbThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Medical Bag_24px.png"))); // NOI18N
        lbThuoc.setText("Bệnh");
        lbThuoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThuocMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLoaiChuongLayout = new javax.swing.GroupLayout(panelMenuLoaiChuong);
        panelMenuLoaiChuong.setLayout(panelMenuLoaiChuongLayout);
        panelMenuLoaiChuongLayout.setHorizontalGroup(
            panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))
                            .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbChuyenChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbXuatChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
            .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblAddPig)
                .addGap(18, 18, 18)
                .addComponent(lblEat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLoaiChuongLayout.setVerticalGroup(
            panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLoaiChuongLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAddPig, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEat))
                    .addGroup(panelMenuLoaiChuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbXuatChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbThuoc)
                        .addComponent(lbChuyenChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenuLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenuLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenuLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
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
                 Object []oChuong = {tempCH.getMaChuong(),tempCH.getSoLuongHeoDangChua(),""};   
                 model.addRow(oChuong);

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
            
<<<<<<< HEAD
            String valueTableChuong = tableChuong.getModel().getValueAt(row, 0).toString();
            if(tableChuong.getModel().getValueAt(row, 2) != "")
            {
               lbThongBao.setText("ĐÃ ĐẾN GIỜ CHO ĂN");
            }
            else
                lbThongBao.setText(null);
=======
            String valueTableChuong = tbChuong.getModel().getValueAt(row, 0).toString();
            
>>>>>>> heofrom-xuatchuong
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
         setLbColor(lbChuongDeCon);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongMangThai);
        
    }//GEN-LAST:event_panelMenuChuongHeoDeMouseClicked


    private void lblAddPigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPigMouseClicked
        // TODO add your handling code here:
       String sMaChuong=(String) tbChuong.getModel().getValueAt(tbChuong.getSelectedRow(), 0);
        ThemHeoConGUI.getObj(sMaChuong).setVisible(true);
//        JFrame AddPigFr=new ThemHeoConGUI();
//        AddPigFr.setVisible(true);
        
        
    }//GEN-LAST:event_lblAddPigMouseClicked

    private void lblEatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEatMouseClicked
        // TODO add your handling code here:
        String sMaChuong=(String) tbChuong.getModel().getValueAt(tbChuong.getSelectedRow(), 0);
        ChoAnGUI.getObj(sMaChuong,"LC01","").setVisible(true);
    }//GEN-LAST:event_lblEatMouseClicked

    private void JtxtSoLuongChuong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtSoLuongChuong3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtSoLuongChuong3ActionPerformed

    private void panelChuongMangThaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChuongMangThaiMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC02");
        setLbColor(lbChuongMangThai);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongDucGiong);
        
    }//GEN-LAST:event_panelChuongMangThaiMouseClicked

    private void panelHeoGiongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeoGiongMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC04");
        setLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongMangThai);
    }//GEN-LAST:event_panelHeoGiongMouseClicked

    private void panelChoPhoiGiongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChoPhoiGiongMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC03");
        setLbColor(lbChuongPhoiGiong);
        resetLbColor(lbChuongHeoThit);
        resetLbColor(lbChuongDucGiong);
        resetLbColor(lbChuongDeCon);
        resetLbColor(lbChuongMangThai);
    }//GEN-LAST:event_panelChoPhoiGiongMouseClicked

    private void panelChuongHeoThitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChuongHeoThitMouseClicked
        // TODO add your handling code here:
        showDanhSachChuong("LC05");
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

<<<<<<< HEAD
    private void lbThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThuocMouseClicked
        // TODO add your handling code here:
        String sMaHeo=(String) TableHeo.getModel().getValueAt(TableHeo.getSelectedRow(), 1);
     
        ThuocGUI.getObj(sMaHeo).setVisible(true);
    }//GEN-LAST:event_lbThuocMouseClicked
=======
    private void lbXuatChuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXuatChuongMouseClicked
        // TODO add your handling code here:
         ArrayList<HeoELE> lsHeoXuat = new ArrayList();
        int []index=tbHeo.getSelectedRows();
        for(int i=0;i<index.length;i++)
        {
            lsHeoXuat.add(lsHeo.get(index[i]));
        }
        XuatChuongGUI fr = new XuatChuongGUI(lsHeoXuat);
        fr.setVisible(true);
    }//GEN-LAST:event_lbXuatChuongMouseClicked
>>>>>>> heofrom-xuatchuong
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
    private javax.swing.JLabel lbChuongDeCon;
    private javax.swing.JLabel lbChuongDucGiong;
    private javax.swing.JLabel lbChuongHeoNaiDeCon;
    private javax.swing.JLabel lbChuongHeoThit;
    private javax.swing.JLabel lbChuongMangThai;
    private javax.swing.JLabel lbChuongPhoiGiong;
    private javax.swing.JLabel lbChuyenChuong;
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
