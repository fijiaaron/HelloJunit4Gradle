import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloJunit
{
    @Test
    public void testHello()
    {
        String message = "Hello";
        System.out.println(message);
        assertEquals(message, "Hello");
    }
}
