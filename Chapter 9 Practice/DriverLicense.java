import java.util.*;
public class DriverLicense extends Card
{
    private String year;
    public DriverLicense(String n, String expYear)
    {
        super(n);
        year = expYear;
    }
    public String format()
    {
        String str = super.format();
        str += "\nExpires in: " + year;
        return str;
    }
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int nowYear = calendar.get(Calendar.YEAR);
        int y = Integer.parseInt(year);
        if (y < nowYear)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return "DriverLicense[name = " + super.getName() + "][expires in = " + year + "]";
    }
    /*
    public boolean equals(Object huh)
    {
        return false;
    }
    */
}
