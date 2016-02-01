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
        str += "\nExpires in:" + year;
        return str;
    }
}
