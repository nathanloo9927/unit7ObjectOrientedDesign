import java.util.*;
public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }
    public String format()
    {
        String str = super.format();
        str += "\nID: " + idNumber;
        return str;
    }
}
