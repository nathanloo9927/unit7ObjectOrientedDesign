import java.util.*;
public class Person implements Comparable<Person>
{
    private String n;
    public Person(String name)
    {
        n = name;
    }
    public String getName()
    {
        return n;
    }
    public int compareTo(Person person)
    {
//         if (n.compareTo(((Person) person).getName()) < 0)
//         {
//             return -1;
//         } else if (n.compareTo(((Person) person).getName()) == 0)
//         {
//             return 0;
//         } else
//         {
//             return 1;
//         }
        
            return this.n.compareTo(person.n);
         
    }
}
