import java.util.*;
public class CallingCard extends Card
{
    private String cardNum;
    private String p;
    public CallingCard(String n, String cardNumber, String pin)
    {
        super(n);
        cardNum = cardNumber;
        p = pin;
    }
    public String format()
    {
        String str = super.format();
        str += "\nNumber: (" + cardNum.substring(0,3) + ") - " + cardNum.substring(3,6) + " - " + cardNum.substring(6,10);
        return str;
    }
}
