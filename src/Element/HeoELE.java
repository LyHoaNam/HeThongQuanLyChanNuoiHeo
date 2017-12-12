/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;


public class HeoELE {
    private String sMaHeo;
    private String sTinhTrang;
    private String sGiaNhap;
    private String sXuatXu;
    private String sHeoMe;
    private String sHeoCha;
    public HeoELE()
    {}
    public HeoELE(String idHeo, String TT,String gia, String Xx, String Me, String Cha)
    {
        this.sMaHeo=idHeo;
        this.sTinhTrang=TT;
        this.sXuatXu=Xx;
        this.sHeoCha=Cha;
        this.sHeoMe=Me;
        this.sGiaNhap=gia;
    }
    public String getMaHeo()
    {
        return this.sMaHeo;
    }
    
    public String getTinhTrang()
    {
        return this.sTinhTrang;
    }
    
    public String getGiaNhap()
    {
        return this.sGiaNhap;
    }
    
    public String getXuatXu()
    {
        return this.sXuatXu;
    }
    
    public String getHeoMe()
    {
        return this.sHeoMe;
    }
    
    public String getHeoCha()
    {
        return this.sHeoCha;
    }
            
    
}
