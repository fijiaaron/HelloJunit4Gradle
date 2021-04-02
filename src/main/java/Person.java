import java.util.Arrays;
import java.util.List;

public class Person
{
    List<String> names;

    public Person(String name)
    {
        names = Arrays.asList(name.split(" "));
    }

    public String getFirstName()
    {
        return names.get(0);
    }

    public String getLastName()
    {
        return names.get(names.size() - 1);
    }
}
