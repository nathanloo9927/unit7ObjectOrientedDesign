import java.util.*;
public class ComboLock
{
    private int num1;
    private int num2;
    private int num3;
    private int count;
    private int now;
    private static int n1;
    private static int n2;
    private static int n3;
    private boolean firstCombo = false;
    private boolean secondCombo = false;
    private boolean thirdCombo = false;
    public ComboLock( int secret1, int secret2, int secret3 )
    {
        num1 = secret1;
        num2 = secret2;
        num3 = secret3;
        now = 0;
        count = 0;
    }
    public void reset()
    {
        now = 0;
        count = 0;
    }
    public void turnLeft( int ticks )
    {
        if (now + ticks > 39)
        {
            int remainder = now + ticks;
            remainder -= 40;
            now = 0 + remainder;
        } else
        {
            now += ticks;
        }
        count++;
        if (count == 2)
        {
            n2 = now;
        }
    }
    public void turnRight( int ticks )
    {
        if (now - ticks < 0)
        {
            int remainder = ticks - now;
            now = 40 - remainder;
        } else
        {
            now -= ticks;
        }
        count++;
        if (count == 1)
        {
            n1 = now;
        } else if (count == 3)
        {
            n3 = now;
        }
    }
    public boolean open()
    {
        if (n1 == num1)
        {
            firstCombo = true;
        }
        if (n2 == num2)
        {
            secondCombo = true;
        }
        if (n3 == num3)
        {
            thirdCombo = true;
        }
        if (firstCombo == true && secondCombo == true && thirdCombo == true)
        {
            return true;
        } else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        ComboLock c = new ComboLock(10,20,30);
        c.turnRight(30);
        c.turnLeft(10);
        c.turnRight(30);
        System.out.println(n1 + " " + n2 + " " + n3);
        System.out.println(c.open());
        //Scanner s = new Scanner(System.in);
        //Random r = new Random();
        //int number1 = r.nextInt(40);
        //int number2 = r.nextInt(40);
        //int number3 = r.nextInt(40);
        //ComboLock l = new ComboLock(number1,number2,number3);
        //System.out.print("How many times do you want to turn right?: ");
    }
}