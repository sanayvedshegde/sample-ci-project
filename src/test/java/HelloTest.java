import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testAdd() {
        HelloWorld hw = new HelloWorld();
        assertEquals(5, hw.add(2,3));
    }
}