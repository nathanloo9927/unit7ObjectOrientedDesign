import java.util.*;
public class Billfold
{
    private Card card1;
    private Card card2;
    public Billfold(Card card1, Card card2)
    {
        this.card1 = card1;
        this.card2 = card2;
    }
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null)
        {
            card2 = card;
        }
    }
    public String formatCards()
    {
        String str = "[";
        if (card1 != null)
        {
            str += card1.format();
        }
        if (card2 != null)
        {
            str += "|" + card2.format();
        }
        str += "]";
        return str;
    }
    public int getExpiredCardCount()
    {
        int count = 0;
        if (card1.isExpired() == true)
        {
            count++;
        }
        if (card2.isExpired() == true)
        {
            count++;
        }
        return count;
    }
}
