import com.sda.tdd.homework.Fibonacci;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/*  Fibonaci numbers:
    numbers 0 1 1 2 3 5 8 13 21
    index   0 1 2 3 4 5 6  7  8 */

public class FibonacciTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Fibonacci myFibonacciNumber;

    @Before
    public void createFibonacciInstance(){
        this.myFibonacciNumber = new Fibonacci();
    }

    @Test
    public void testMethodShouldThrowExceptionWhenIndexIsSmallerThanZero() throws Exception{
        // given
        expectedException.expect(Exception.class);
        expectedException.expectMessage("The index must be greater than or equal with zero");
        // when
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(-1);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(-1);
        // then
        // should throw expected exception
    }

    @Test
    public void testMethodToTestFibonacciNumberWithIndex3() throws Exception {
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(3);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(3);
        assertEquals(2, fibonacciElement);
    }

    @Test
    public void testMethodToTestFibonacciNumberWithIndex5() throws Exception {
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(5);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(5);
        assertEquals(5, fibonacciElement);
    }

    @Test
    public void testMethodToTestFibonacciNumberWithIndex8() throws Exception {
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(8);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(8);
        assertEquals(21, fibonacciElement);
    }

}
