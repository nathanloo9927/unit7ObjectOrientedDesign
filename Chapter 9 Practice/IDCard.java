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
    // override the equals method defined in Card as well as Object
    public boolean equals(Object huh)
    {
        // check if this object and the other object are both of the same class
        if (this.getClass() == huh.getClass())
        {
            // first check if this object and the other object are equal from the perspective of the superclass (ex: card)
            boolean nameEqual = super.equals(huh);
            // second cast the other object to an IDCard and check if idNumbers are equal
            IDCard other = (IDCard) huh;
            return nameEqual && (this.idNumber.equals(other.idNumber));
        }
        return false;
    }
}
