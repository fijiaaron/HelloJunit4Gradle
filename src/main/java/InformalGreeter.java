public class InformalGreeter implements Greeter
{
    @Override
    public String greet(Person person)
    {
        return "Hello, " + person.getFirstName();
    }
}
