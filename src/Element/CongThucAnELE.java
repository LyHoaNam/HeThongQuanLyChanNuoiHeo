/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;


public class CongThucAnELE 
{
    private String MaCongThuc;
    private String TenCongThuc;
    public CongThucAnELE()
    {
        
    }
    public CongThucAnELE(String idCT,String nameCT)
    {
        this.MaCongThuc=idCT;
        this.TenCongThuc=nameCT;
    }
    public CongThucAnELE(String idCT)
    {
        this.MaCongThuc=idCT;
    }
    public String getMaCongThuc()
    {
        return this.MaCongThuc;
    }
    public String getTenCongThuc()
    {
        return this.TenCongThuc; 
    }
    
}
