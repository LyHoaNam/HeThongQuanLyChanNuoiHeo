/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;

public class NhanVienELE {
    private String sHoTen;
    private String sMaNhanVien;
    private String sMaTaiKhoan;
    private String sNgayVaoLm;
    private String sSoDienThoai;
    public NhanVienELE()
    {}
    public NhanVienELE(String Name, String idNV, String idTK,
            String ngay,String dt)
    {
        this.sHoTen=Name;
        this.sMaNhanVien=idNV;
        this.sNgayVaoLm=ngay;
        this.sSoDienThoai=dt;
        this.sMaTaiKhoan=idTK;
    }        
  public String getTenNhanVien()
  {
      return sHoTen;
  }
  public String getMaNhanVien()
  {
      return sMaNhanVien;
  }
}
