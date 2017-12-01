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
public class ChuongELE {
    private String MaChuong;
    private String MaLoaiChuong;
    private int SoLuongHeoDangChua;
    public ChuongELE()
    {}
    public ChuongELE(String idC, String idLC,int sl)
    {
        this.MaChuong=idC;
        this.MaLoaiChuong=idLC;
        this.SoLuongHeoDangChua=sl;
    }
    public String getMaChuong()
    {
        return this.MaChuong;
    }
    public String getMaLoaiChuong()
    { return this.MaLoaiChuong;}
    public int getSoLuongHeoDangChua()
    {   return this.SoLuongHeoDangChua;}
    
}
