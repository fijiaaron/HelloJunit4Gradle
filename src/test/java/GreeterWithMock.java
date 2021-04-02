import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GreeterWithMock
{
    Person person = new Person("Aaron Evans");

    @Mock
    Greeter mockGreeter;

    @Test
    public void testInformalGreeter()
    {
        Greeter greeter = new InformalGreeter();
        assertEquals(greeter.greet(person), "Hello, Aaron");
    }

    @Test
    public void testFormalGreeter()
    {
        String expectedFormalGreeting = "Hello, Mr. Evans";
        when(mockGreeter.greet(person)).thenReturn(expectedFormalGreeting);
        assertEquals(expectedFormalGreeting, mockGreeter.greet(person));
    }
}
