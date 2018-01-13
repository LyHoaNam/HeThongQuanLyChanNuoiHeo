/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.BaoCaoThongKeBUS;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author cuhoa_000
 */
public class BaoCaoThongKe extends javax.swing.JPanel {

    /**
     * Creates new form BaoCaoThongKe
     */
    public BaoCaoThongKe() {
        initComponents();
        JPanel panel=createChartPanel();
        panelChart.add(panel, BorderLayout.CENTER);
        ShowTable();
        showDoanhSoNgay();
        showDoanhSoThang();
        showDoanhSoNam();
    }
    private void ShowTable()
    {
        BaoCaoThongKeBUS objBK=new BaoCaoThongKeBUS();
        ResultSet rs=objBK.getHoaDon100();
        DefaultTableModel model=(DefaultTableModel)tableHoaDon100.getModel();
         model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            try
            {
                while(rs.next())
                {
                Vector vector=new Vector();
                vector.add(rs.getString("SoHD"));
                vector.add(rs.getString("MaNhanVien"));
                vector.add(rs.getString("SoLuong"));
                vector.add(rs.getString("NgayLapHD"));
                model.addRow(vector);
                }
            }
            catch(SQLException exc)
            {
                System.out.println("Loi o BKTK "+exc);
            }
    }
    
    private XYDataset createDataset() {
    XYSeriesCollection dataset = new XYSeriesCollection();
    XYSeries series1 = new XYSeries("DDo");
    XYSeries series2 = new XYSeries("Doanh thu mỗi tháng");
    XYSeries series3 = new XYSeries("Object 3");
    BaoCaoThongKeBUS objBK=new BaoCaoThongKeBUS();
        ResultSet rs=objBK.getDonGia();
        try
        {
            while(rs.next())
            {
                double y= Double.parseDouble(rs.getString("sumd"));
                double x= Double.parseDouble(rs.getString("monthd"));
                series2.add(x, y);
            }
        }
        catch(SQLException exc)
        {
            System.out.println(exc);
        }
    
 
//    series2.add(2.0, 1.0);
//    series2.add(2.5, 2.4);
//    series2.add(3.2, 1.2);
//    series2.add(3.9, 2.8);
//    series2.add(4.6, 3.0);
// 
//    series3.add(1.2, 4.0);
//    series3.add(2.5, 4.4);
//    series3.add(3.8, 4.2);
//    series3.add(4.3, 3.8);
//    series3.add(4.5, 4.0);
 
    //dataset.addSeries(series1);
    dataset.addSeries(series2);
    //dataset.addSeries(series3);
 
    return dataset;
}
    private JPanel createChartPanel() {
    String chartTitle = "Biểu đồ doanh thu theo tháng năm 2017";
    String xAxisLabel = "Tháng";
    String yAxisLabel = "Tiền (triệu VND)";
 
    XYDataset dataset = createDataset();
 
    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
            xAxisLabel, yAxisLabel, dataset);
    
    //Setting custom renderer for the series lines
    XYPlot plot = chart.getXYPlot();
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    // sets paint color for each series
    renderer.setSeriesPaint(0, Color.GREEN);
    renderer.setSeriesPaint(1, Color.RED);
    renderer.setSeriesPaint(2, Color.YELLOW);

    // sets thickness for series (using strokes)
    renderer.setSeriesStroke(0, new BasicStroke(4.0f));
    renderer.setSeriesStroke(1, new BasicStroke(3.0f));
    renderer.setSeriesStroke(2, new BasicStroke(2.0f));
    plot.setRenderer(renderer);
 
    return new ChartPanel(chart);
}
    private void showDoanhSoNgay()
    {
        BaoCaoThongKeBUS objBK=new BaoCaoThongKeBUS();
        ResultSet rs=objBK.getDonGiaNgay();
        try {
            while(rs.next())
            lbNgay.setText(rs.getString("sumd"));
        } catch (SQLException ex) {
            Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void showDoanhSoThang()
    {
        BaoCaoThongKeBUS objBK=new BaoCaoThongKeBUS();
        ResultSet rs=objBK.getDonGiaThang();
        try {
            while(rs.next())
            lbThang.setText(rs.getString("sumd"));
        } catch (SQLException ex) {
            Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         private void showDoanhSoNam()
    {
        BaoCaoThongKeBUS objBK=new BaoCaoThongKeBUS();
        ResultSet rs=objBK.getDonGiaNam();
        try {
            while(rs.next())
            lbNam.setText(rs.getString("sumd"));
        } catch (SQLException ex) {
            Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lbThang = new javax.swing.JLabel();
        lbNgay = new javax.swing.JLabel();
        lbNam = new javax.swing.JLabel();
        lbNgayht = new javax.swing.JLabel();
        lbThanght = new javax.swing.JLabel();
        lbNamht = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon100 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelChart = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 153, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOANH THU");
        jLabel2.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 114, 63));
        jLabel8.setText("NGÀY ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 114, 63));
        jLabel10.setText("THÁNG");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 114, 63));
        jLabel11.setText("NĂM");

        jCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar1.setDate(new java.util.Date(1514671446000L));

        lbThang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbThang.setForeground(new java.awt.Color(51, 51, 51));
        lbThang.setText("NGÀY ");

        lbNgay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNgay.setForeground(new java.awt.Color(51, 51, 51));
        lbNgay.setText("NGÀY ");

        lbNam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNam.setForeground(new java.awt.Color(51, 51, 51));
        lbNam.setText("NGÀY ");

        lbNgayht.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNgayht.setForeground(new java.awt.Color(51, 51, 51));
        lbNgayht.setText("31");

        lbThanght.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbThanght.setForeground(new java.awt.Color(51, 51, 51));
        lbThanght.setText("12");

        lbNamht.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNamht.setForeground(new java.awt.Color(51, 51, 51));
        lbNamht.setText("2017");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(404, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNgayht, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbThanght, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lbNgay)
                                .addGap(209, 209, 209)
                                .addComponent(lbThang)))
                        .addGap(236, 236, 236)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNam)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNamht, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(lbNgayht)
                    .addComponent(lbThanght)
                    .addComponent(lbNamht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbThang)
                    .addComponent(lbNam)
                    .addComponent(lbNgay))
                .addGap(28, 28, 28))
            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 1200, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH HÓA ĐƠN TRONG THÁNG");
        jLabel1.setOpaque(true);

        tableHoaDon100.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableHoaDon100);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 180, -1, -1));

        panelChart.setBackground(new java.awt.Color(255, 255, 255));
        panelChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(706, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 180, -1, 564));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNam;
    private javax.swing.JLabel lbNamht;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbNgayht;
    private javax.swing.JLabel lbThang;
    private javax.swing.JLabel lbThanght;
    private javax.swing.JPanel panelChart;
    private javax.swing.JTable tableHoaDon100;
    // End of variables declaration//GEN-END:variables
}
