import static org.junit.Assert.assertEquals;
import org.junit.Test;

 public class AssertionUnitExample {

    @Test
    public void testSum() {
        int a = 5;
        int b = 10;
        int result = a + b;

        assertEquals(15, result); // this is an assertion
        System.out.println("We just confirmed 5+10=15");
    }
}