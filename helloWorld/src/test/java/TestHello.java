import meetup.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello {


    @Test
    public void testHello()
    {
        assertEquals("Hello Tibo!",  new HelloWorld("Tibo").hello());
    }
}
