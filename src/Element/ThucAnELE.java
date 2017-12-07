
package Element;

/**
 *
 * @author cuhoa_000
 */
public class ThucAnELE 
{
    private String MaThucAn;
    private int TonKho;
    public ThucAnELE()
    {
    }
    public ThucAnELE(String idThucAn,int iTK)
    {
        this.MaThucAn=idThucAn;
        this.TonKho=iTK;
    }
    public int getTonKho()
    {
        return this.TonKho;
    }
    
}
