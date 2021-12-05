import org.junit.Test;
import ExceptionDemo;
public class ExceptionDemoTest {

    @Test(expected = ArithmeticException.class)
    public void testInteger_zero() {
        ExceptionDemo object = new ExceptionDemo();
        object.integer_zero();
    }

    @Test
    public void testDouble_zero() {
        ExceptionDemo object = new ExceptionDemo();
        object.double_zero();
    }
}