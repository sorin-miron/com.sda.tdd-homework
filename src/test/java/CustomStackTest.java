import com.sda.tdd.homework.CustomStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {

    private CustomStack myCustomStack;

    @Before
    public void createCustomStack(){
        this.myCustomStack = new CustomStack();
    }

    @Test
    public void testWhenStackIsEmptyThenEmptyMethodReturnsTrue(){
        assertEquals(true, myCustomStack.empty());
    }


    @Test
    public void testWhenStackIsNonEmptyThenEmptyMethodReturnsFalse(){
        myCustomStack.push(1);
        assertEquals(false, myCustomStack.empty());
    }

    @Test
    public void testWhenStackIsNonEmptyThenPeekMethodReturnsTheElementFromTheTop(){
        myCustomStack.push(1511);
        assertEquals(1511, myCustomStack.peek().intValue());
        assertEquals(1, myCustomStack.getSize()); // verifica daca s-a schimbat marimea stivei / nu a fost scos ultimul element
    }

    @Test
    public void testWhenStackHasOneElementThenPopMethodReturnsThatElementAndTheStackGetEmpty(){
        myCustomStack.push(156);
        assertEquals(156, myCustomStack.pop().intValue());
        assertEquals(0, myCustomStack.getSize());
    }

    @Test
    public void testWhenStackHasMoreElementsThenPopMethodReturnsTheElementFromTheTopAndRemoveItFromTheStack(){
        myCustomStack.push(1);
        myCustomStack.push(2);
        int size = myCustomStack.getSize();
        Integer elementFromTheTop = myCustomStack.pop();
        assertEquals(2, elementFromTheTop.intValue());
        assertEquals(size-1, myCustomStack.getSize());
    }

    @Test
    public void testWhenPushingAnElementInTheStackPeekMethodShouldReturnThatElement(){
        myCustomStack.push(10);
        Integer elementFromTheTop = myCustomStack.peek();
        assertEquals(10, elementFromTheTop.intValue());
    }

    @Test
    public void testWhenSearchingAnElementInAStackWithOneElementTheSearchMethodShouldReturnZero(){
        myCustomStack.push(10);
        int elementPosition = myCustomStack.search(10);
        assertEquals(1, elementPosition);
    }

    @Test
    public void testWhenSearchingAnElementInTheStackTheSearchMethodShouldReturnHisPosition(){
        myCustomStack.push(10);
        myCustomStack.push(151);
        myCustomStack.push(33);
        int elementPosition = myCustomStack.search(33);
        assertEquals(1, elementPosition);
        int elementPosition2 = myCustomStack.search(151);
        assertEquals(2, elementPosition2);
    }

    @Test
    public void testWhenSearchingAnElementInTheStackTheSearchMethodShouldReturnHisPositionOrMinusOneIfItIsNotFound(){
        myCustomStack.push(10);
        myCustomStack.push(151);
        myCustomStack.push(33);
        int elementPosition = myCustomStack.search(11);  // element not found in the list
        assertEquals(-1, elementPosition);
    }

}
