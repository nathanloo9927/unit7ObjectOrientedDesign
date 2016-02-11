import java.util.*;
public class SchmitPersonTester
{
    public static Person firstPerson(Person[] people)
    {
        Person first = people[0];
        for (int i = 1; i < people.length; i++)
        {
            if (people[i].compareTo(first) < 0)
            {
                first = people[i];
            }
        }
        return first;
    }
    public static Person lastPerson(Person[] people)
    {
        Person last = people[0];
        for (int i = 1; i < people.length; i++)
        {
            if (people[i].compareTo(last) > 0)
            {
                last = people[i];
            }
        }
        return last;
    }
    public static void main(String[] args)
    {
        Person[] a = new Person[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 names: ");
        for (int i = 0; i < 10 && scan.hasNext(); i++)
        {
            a[i] = new Person(scan.next());
        }
        System.out.println("First: " + firstPerson(a).getName());
        System.out.println("Last: " + lastPerson(a).getName());
    }
}
