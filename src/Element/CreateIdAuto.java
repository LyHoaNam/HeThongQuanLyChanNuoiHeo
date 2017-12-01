
package Element;
import Data.classData;
public class CreateIdAuto 
{
    public String CreateID(String prefixID,String tableName, String tableID,String tableIDName)
    {
        classData Db=new classData();
        String sql="select count ("+tableID+") from "+tableName+" where "+tableID +"= '"+tableIDName+"'";
        return "";
    }
}
