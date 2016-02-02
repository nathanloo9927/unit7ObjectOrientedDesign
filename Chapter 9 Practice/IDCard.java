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
    public String toString()
    {
        return "ID[name = " + super.getName() + "][ID = " + idNumber + "]";
    }
    public boolean equals(IDCard card)
    {
        return false;
    }
}
