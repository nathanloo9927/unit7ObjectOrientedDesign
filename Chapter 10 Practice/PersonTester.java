import java.util.*;
public class PersonTester
{
    public static void main(String[] args)
    {
        int num = 10;
        ArrayList<Person> people = new ArrayList<Person>();
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= num; i++)
        {
            System.out.print("What is the person's name: ");
            people.add(new Person(s.next()));
        }
        String first = "", last = "";
        for (Person person: people)
        {
            int peopleBefore = 0;
            int peopleAfter = 0;
            for (Person p: people)
            {
                if (person.compareTo(p) == -1)
                {
                    peopleBefore++;
                } else if (person.compareTo(p) == 1)
                {
                    peopleAfter++;
                }
            }
            if (peopleBefore == num - 1)
            {
                first = person.getName();
            }
            if (peopleAfter == num - 1)
            {
                last = person.getName();
            }
        }
        System.out.println("First person: " + first + " Last person: " + last);
    }
}
