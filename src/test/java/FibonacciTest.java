import com.sda.tdd.homework.Fibonacci;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci myFibonacciNumber;

    @Before
    public void createFibonacciInstance(){
        this.myFibonacciNumber = new Fibonacci();
    }

    @Test
    public void testMethodToTest3rdFibonacciNumber(){
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(3);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(3);
        assertEquals(1, fibonacciElement);
    }

    @Test
    public void testMethodToTest5thFibonacciNumber(){
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(5);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(5);
        assertEquals(3, fibonacciElement);
    }

    @Test
    public void testMethodToTest8thFibonacciNumber(){
        int fibonacciElement = myFibonacciNumber.computeNonRecursive(8);
//        int fibonacciElement = myFibonacciNumber.computeRecursive(8);
        assertEquals(13, fibonacciElement);
    }

}
