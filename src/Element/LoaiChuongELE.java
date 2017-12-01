/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;

/**
 *
 * @author cuhoa_000
 */
public class LoaiChuongELE {
    private String MaLoaiChuong;
    
    private String TenLoaiChuong;
    private int QuyDinhSoLuong;
    private int SoLuongChuong;
    public LoaiChuongELE()
    {}
    public LoaiChuongELE( String idLC, String name,int SL,int SCL)
    {
    this.MaLoaiChuong=idLC;
   
    this.TenLoaiChuong=name;
    this.QuyDinhSoLuong=SL;
    this.SoLuongChuong=SCL;
    }
    public String getQuiDinh()
    {
        String sTempi=Integer.toString(this.QuyDinhSoLuong);
        return sTempi;
    }
    public String getTenLoaiChuong()
    {
        return this.TenLoaiChuong;
    }
    public String getSoLuongChuong()
    {
        String stempi= Integer.toString(this.SoLuongChuong);
        return stempi;
    }
}
