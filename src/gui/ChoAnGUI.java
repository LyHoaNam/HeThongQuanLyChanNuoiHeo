/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.ChoAnBUS;
import Element.NhanVienELE;
import java.util.ArrayList;
import Element.ThucAnELE;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class ChoAnGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChoAnGUI
     */
    ArrayList <ThucAnELE> lstThucAn=new ArrayList();
    ArrayList <String> lsCongThucAn=new ArrayList();
    ArrayList <Integer> lstTonKho=new ArrayList();
    NhanVienELE objNV;
    private boolean bCheckTA=true;
    
    private static ChoAnGUI obj=null;
    public static ChoAnGUI getObj(String idMaChuong,String idLoaiChuong,NhanVienELE nv)
    {
        if(obj==null)
        {
            obj=new ChoAnGUI(idMaChuong,idLoaiChuong,nv);
        }
        return obj;
    }
    public ChoAnGUI() {
        initComponents();
        ShowThucAn();
    }
      public ChoAnGUI(String idMaChuong,String idLoaiChuong,NhanVienELE nv) {
        initComponents();
        this.objNV=nv;
        txtMaChuong.setText(idMaChuong);
        txtLoaiChuong.setText(idLoaiChuong);
        txtNhanVien.setText(objNV.getTenNhanVien());
        ShowThucAn();
    }
    
    
    private void ShowThucAn()
    {
        
        cbTenCongThucAn.removeAllItems();
        lsCongThucAn.clear();
        ChoAnBUS objCA=new ChoAnBUS();
        ResultSet rs=objCA.GetCongThucAn("LC01");
        try
        {
            while(rs.next())
            {
                cbTenCongThucAn.addItem(rs.getString("TenCongThuc"));
                lsCongThucAn.add(rs.getString("MaCongThuc"));
                
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi o showCbCongThucAn ChoAnGUi "+exc);
        }
        ResultSet rsTA= objCA.getThucAn();
        DefaultTableModel model;
        model = (DefaultTableModel) tableThucAnTrongKho.getModel();
        model.getDataVector().removeAllElements();
        int iStt=1;
        try
        {
            while(rsTA.next())
            {
               
                Vector vector =new Vector();
                vector.add (iStt);
                iStt++;
                vector.add(rsTA.getString("MaThucAn"));
                vector.add(rsTA.getString("TenThucAn"));
                vector.add(rsTA.getString("TonKho"));
                vector.add(rsTA.getString("DonViTinh"));
                vector.add(rsTA.getString("MaLoaiHang"));
                model.addRow(vector);
                
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi o showCbCongThucAn ChoAn GUi" +exc);
        }
        
    }
    private void ShowTableCongThucAn()
    {
       
        String sIdCongThuc=lsCongThucAn.get(cbTenCongThucAn.getSelectedIndex());
        lstTonKho.clear();
        //System.out.println(sIdCongThuc);
        ChoAnBUS objCA=new ChoAnBUS();
        ResultSet rs=objCA.getThanhPhanTA(sIdCongThuc);
         DefaultTableModel model;
            model = (DefaultTableModel) tableCongThucAn.getModel();
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
           int iStt=1;
           int iSoLuong=0,iTonKho=0;
         try
         {
             while(rs.next())
             {
                 Vector vector=new Vector();
                 vector.add(iStt);
                 iStt++;
                 vector.add(rs.getString("MaThucAn"));
                 vector.add(rs.getString("TenThucAn"));
                 vector.add(rs.getString("SoLuong"));
                 iSoLuong=Integer.parseInt(rs.getString("SoLuong"));
                 iTonKho=Integer.parseInt(rs.getString("TonKho"));
                 lstTonKho.add(iTonKho);
                 if(iTonKho-iSoLuong<0)
                     bCheckTA=false;
                 model.addRow(vector);
             }
         }
         catch(SQLException exc)
         {
             System.out.println("Loi o ShowTableCongThucAn ChoAnGUI "+exc);
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
        dateChoAn = new com.toedter.calendar.JDateChooser();
        lbLoaiChuong = new javax.swing.JLabel();
        txtLoaiChuong = new javax.swing.JTextField();
        lbMaChuong = new javax.swing.JLabel();
        txtMaChuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCongThucAn = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableThucAnTrongKho = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDanhSachThucAn = new javax.swing.JTable();
        lbNhanVien = new javax.swing.JLabel();
        txtNhanVien = new javax.swing.JTextField();
        cbTenCongThucAn = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNhanVien1 = new javax.swing.JLabel();
        lbXacNhan = new javax.swing.JLabel();
        lbXoa = new javax.swing.JLabel();
        lbXoaHet = new javax.swing.JLabel();
        lbChuyenHet = new javax.swing.JLabel();
        lbChuyen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cho Ăn");
        setBackground(new java.awt.Color(255, 255, 255));

        panelContain.setBackground(new java.awt.Color(255, 255, 255));

        dateChoAn.setDateFormatString("yyyy-MM-dd\n");

        lbLoaiChuong.setBackground(new java.awt.Color(0, 153, 102));
        lbLoaiChuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLoaiChuong.setForeground(new java.awt.Color(0, 153, 102));
        lbLoaiChuong.setText("Loại Chuồng");

        txtLoaiChuong.setText("jTextField1");

        lbMaChuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMaChuong.setForeground(new java.awt.Color(0, 153, 102));
        lbMaChuong.setText("Mã Chuồng");

        txtMaChuong.setText("jTextField2");

        tableCongThucAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "stt", "Mã Thức Ăn", "Tên Thức Ăn", "Số Lượng"
            }
        ));
        jScrollPane1.setViewportView(tableCongThucAn);
        if (tableCongThucAn.getColumnModel().getColumnCount() > 0) {
            tableCongThucAn.getColumnModel().getColumn(0).setMinWidth(10);
            tableCongThucAn.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableCongThucAn.getColumnModel().getColumn(1).setPreferredWidth(30);
            tableCongThucAn.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        tableThucAnTrongKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Thức Ăn", "Tên Thức Ăn", "Số Lượng"
            }
        ));
        tableThucAnTrongKho.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tableThucAnTrongKho);
        if (tableThucAnTrongKho.getColumnModel().getColumnCount() > 0) {
            tableThucAnTrongKho.getColumnModel().getColumn(0).setMinWidth(10);
            tableThucAnTrongKho.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableThucAnTrongKho.getColumnModel().getColumn(1).setPreferredWidth(30);
            tableThucAnTrongKho.getColumnModel().getColumn(3).setMinWidth(20);
            tableThucAnTrongKho.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        tableDanhSachThucAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Thức Ăn", "Tên Thức Ăn", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableDanhSachThucAn);
        if (tableDanhSachThucAn.getColumnModel().getColumnCount() > 0) {
            tableDanhSachThucAn.getColumnModel().getColumn(0).setMinWidth(10);
            tableDanhSachThucAn.getColumnModel().getColumn(0).setPreferredWidth(40);
            tableDanhSachThucAn.getColumnModel().getColumn(0).setMaxWidth(100);
            tableDanhSachThucAn.getColumnModel().getColumn(1).setMinWidth(30);
            tableDanhSachThucAn.getColumnModel().getColumn(1).setPreferredWidth(30);
            tableDanhSachThucAn.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        lbNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNhanVien.setForeground(new java.awt.Color(0, 153, 102));
        lbNhanVien.setText("Nhân Viên:");

        txtNhanVien.setText("NV01");

        cbTenCongThucAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTenCongThucAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTenCongThucAnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbTenCongThucAnMousePressed(evt);
            }
        });
        cbTenCongThucAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenCongThucAnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH THỨC ĂN");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 153, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CÔNG THỨC ĂN CÓ SẴN");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 153, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THỨC ĂN CÓ TRONG KHO");
        jLabel3.setOpaque(true);

        lbNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNhanVien1.setForeground(new java.awt.Color(0, 153, 102));
        lbNhanVien1.setText("Ngày");

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

        lbXoa.setBackground(new java.awt.Color(0, 153, 102));
        lbXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbXoa.setForeground(new java.awt.Color(255, 255, 255));
        lbXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Eraser_25px.png"))); // NOI18N
        lbXoa.setText("XÓA");
        lbXoa.setOpaque(true);
        lbXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXoaMouseClicked(evt);
            }
        });

        lbXoaHet.setBackground(new java.awt.Color(0, 153, 102));
        lbXoaHet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbXoaHet.setForeground(new java.awt.Color(255, 255, 255));
        lbXoaHet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoaHet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/EraseX_25px.png"))); // NOI18N
        lbXoaHet.setText("XÓA HẾT");
        lbXoaHet.setOpaque(true);
        lbXoaHet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXoaHetMouseClicked(evt);
            }
        });

        lbChuyenHet.setBackground(new java.awt.Color(0, 153, 102));
        lbChuyenHet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbChuyenHet.setForeground(new java.awt.Color(255, 255, 255));
        lbChuyenHet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuyenHet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Left_30px.png"))); // NOI18N
        lbChuyenHet.setOpaque(true);
        lbChuyenHet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChuyenHetMouseClicked(evt);
            }
        });

        lbChuyen.setBackground(new java.awt.Color(0, 153, 102));
        lbChuyen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbChuyen.setForeground(new java.awt.Color(255, 255, 255));
        lbChuyen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Left_30px.png"))); // NOI18N
        lbChuyen.setOpaque(true);
        lbChuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChuyenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelContainLayout = new javax.swing.GroupLayout(panelContain);
        panelContain.setLayout(panelContainLayout);
        panelContainLayout.setHorizontalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(cbTenCongThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addComponent(lbXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbXoaHet, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addComponent(lbNhanVien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMaChuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelContainLayout.createSequentialGroup()
                                        .addComponent(lbChuyenHet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelContainLayout.createSequentialGroup()
                                        .addComponent(lbChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelContainLayout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lbLoaiChuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNhanVien1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChoAn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelContainLayout.setVerticalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbLoaiChuong)
                        .addComponent(txtMaChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMaChuong)
                        .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNhanVien)
                        .addComponent(lbNhanVien1))
                    .addComponent(dateChoAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTenCongThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbXoaHet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(panelContainLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(lbChuyenHet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbChuyen)
                .addGap(181, 181, 181))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTenCongThucAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenCongThucAnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbTenCongThucAnActionPerformed

    private void cbTenCongThucAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenCongThucAnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbTenCongThucAnMouseClicked

    private void cbTenCongThucAnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenCongThucAnMousePressed
        // TODO add your handling code here:
        ShowTableCongThucAn();
    }//GEN-LAST:event_cbTenCongThucAnMousePressed
    
    
    private void lbXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXacNhanMouseClicked
        ChoAnBUS objCA=new ChoAnBUS();
        int n=tableDanhSachThucAn.getRowCount();
        String sDate=((JTextField)dateChoAn.getDateEditor().getUiComponent()).getText();
        Calendar calendar = Calendar.getInstance();
       int iHourHT=calendar.get(Calendar.HOUR_OF_DAY);
        int iCheck=0;
        String iMaLoaiChuong=txtLoaiChuong.getText();
        String iMaChuong=txtMaChuong.getText();
        String iMaNhanVien=objNV.getMaNhanVien(); //
        try
        {
        if(objCA.InsertPhieuXuatTA(sDate, iMaNhanVien, iMaChuong)&&(objCA.InsertGioChoAn(iMaChuong, iHourHT)))
            for(int i=0;i<n;i++)
            {
                try
                {
                    String sMaThucAn=tableDanhSachThucAn.getModel()
                            .getValueAt(i, 1).toString();
                    int iSoLuong=Integer.parseInt(tableDanhSachThucAn.getModel()
                            .getValueAt(i, 3).toString());
                    int iConLai=lstTonKho.get(i)-iSoLuong;
                    String sIdPhieuXuat=objCA.getIDPhieuXuatTA();
                        if(objCA.InsertChiTietPhieuXuatTA(sMaThucAn, sIdPhieuXuat, iSoLuong))
                            if(objCA.UpdateThucAn(iConLai, sMaThucAn))
                                iCheck++;
                    
                }
                catch(SQLException exc)
                {
                    System.out.println(" loi o btnXacNhan ChoAnGUI "+exc);
                }

            }
              
        }
        catch(SQLException exc)
        {
            System.out.println(" loi o btnXacNhan ChoAnGUI "+exc);

        }
           if(iCheck==n)
           {
                 JOptionPane.showMessageDialog(null, "Cho ăn thành công",
                  "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
                 this.dispose();
           }
            else
             JOptionPane.showMessageDialog(null, "Có lỗi trong quá trình cho ăn",
                  "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
        
       
    }//GEN-LAST:event_lbXacNhanMouseClicked

    private void lbXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaMouseClicked
        int iTest=tableDanhSachThucAn.getSelectedRow();
        lstTonKho.remove(iTest);
        
        ((DefaultTableModel)tableDanhSachThucAn.getModel()).removeRow(tableDanhSachThucAn.getSelectedRow());
    }//GEN-LAST:event_lbXoaMouseClicked

    private void lbXoaHetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaHetMouseClicked
            DefaultTableModel model;
            model = (DefaultTableModel) tableDanhSachThucAn.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
    }//GEN-LAST:event_lbXoaHetMouseClicked

    private void lbChuyenHetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChuyenHetMouseClicked
         
        if(bCheckTA==false)
            JOptionPane.showMessageDialog(this, "Số Thức ăn trong kho không đủ!", "Không được!", JOptionPane.ERROR_MESSAGE);
        else
        {
            DefaultTableModel model;
            model = (DefaultTableModel) tableDanhSachThucAn.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            for(int i=0;i<tableCongThucAn.getColumnCount();i++)
            {
                Vector vector=new Vector();
                vector.add(tableCongThucAn.getValueAt(i, 0));
                vector.add(tableCongThucAn.getValueAt(i, 1));
                vector.add(tableCongThucAn.getValueAt(i, 2));
                vector.add(tableCongThucAn.getValueAt(i, 3));
                model.addRow(vector);
            }
           
        }
    }//GEN-LAST:event_lbChuyenHetMouseClicked

    private void lbChuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChuyenMouseClicked
         lstTonKho.clear();
        TableModel model1=    tableThucAnTrongKho.getModel();
        int [] indexs=tableThucAnTrongKho.getSelectedRows();
        
        DefaultTableModel model2=(DefaultTableModel) tableDanhSachThucAn.getModel();
        model2.getDataVector().removeAllElements();
        model2.fireTableDataChanged();
        for(int i=0;i<indexs.length;i++)
        {
            Object[] row=new Object[4];
            row[0]=i+1;
            row[1]=model1.getValueAt(indexs[i], 1);
            row[2]=model1.getValueAt(indexs[i], 2);
            row[3]=model1.getValueAt(indexs[i], 3);
            int iTonKho =Integer.parseInt(model1.getValueAt(indexs[i], 3).toString());
            lstTonKho.add(iTonKho);
            
            model2.addRow(row);
        }
    }//GEN-LAST:event_lbChuyenMouseClicked

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
            java.util.logging.Logger.getLogger(ChoAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoAnGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTenCongThucAn;
    private com.toedter.calendar.JDateChooser dateChoAn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbChuyen;
    private javax.swing.JLabel lbChuyenHet;
    private javax.swing.JLabel lbLoaiChuong;
    private javax.swing.JLabel lbMaChuong;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbNhanVien1;
    private javax.swing.JLabel lbXacNhan;
    private javax.swing.JLabel lbXoa;
    private javax.swing.JLabel lbXoaHet;
    private javax.swing.JPanel panelContain;
    private javax.swing.JTable tableCongThucAn;
    private javax.swing.JTable tableDanhSachThucAn;
    private javax.swing.JTable tableThucAnTrongKho;
    private javax.swing.JTextField txtLoaiChuong;
    private javax.swing.JTextField txtMaChuong;
    private javax.swing.JTextField txtNhanVien;
    // End of variables declaration//GEN-END:variables
}
