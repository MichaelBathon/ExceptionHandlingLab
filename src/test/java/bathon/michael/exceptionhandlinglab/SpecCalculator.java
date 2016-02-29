package bathon.michael.exceptionhandlinglab;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/16/16.
 */
public class SpecCalculator {


    @Test
    public void testAdd(){
        int x = 4;
        int y = 5;

        int expected = 9;
        int actual = Calculator.add(x,y);

        assertEquals("Fails if it doesn't add the two integers together", expected, actual);
    }

    @Test
    public void testSubtract(){
        int x = 5;
        int y = 4;

        int expected = 1;
        int actual = Calculator.subtract(x,y);

        assertEquals("Fails if it doesn't subtract one integer from the other", expected, actual);
    }

    @Test
    public void testMultiply(){
        int x = 4;
        int y = 5;

        int expected = 20;
        int actual = Calculator.multiply(x,y);

        assertEquals("Fails if it doesn't multiply the two integers together", expected, actual);
    }

    @Test(expected = DivisionByZeroException.class)
    public void testDivide(){
        int x = 20;
        int y = 0;


        //DivisionByZeroException expected = new DivisionByZeroException("Can't divide by zero");
        try{
            Calculator.divide(x,y);
        } catch(DivisionByZeroException e){}

        //assertEquals("Fails if it doesn't divide one number by another or catch an exception if divided by zero", expected,);
    }



}
