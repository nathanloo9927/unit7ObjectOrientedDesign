import java.util.*;
public class BillfoldTester
{
    public static void main(String[] args)
    {
        DriverLicense card = new DriverLicense("John Smith","2017");
        IDCard id = new IDCard("John Smith", "74893");
        Billfold bill = new Billfold(card,id);
        System.out.println(bill.formatCards());
        System.out.println(bill.getExpiredCardCount());
        
    }
}
