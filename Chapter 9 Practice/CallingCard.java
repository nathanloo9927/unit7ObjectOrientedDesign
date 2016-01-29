import java.util.*;
public class CallingCard extends Card
{
    private int cardNum;
    private int p;
    public CallingCard(String n, int cardNumber, int pin)
    {
        super(n);
        cardNum = cardNumber;
        p = pin;
    }
}
