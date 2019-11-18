import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void add(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void subtract(){
        assertEquals(5, calculator.subtract(7,2));
    }

    @Test
    public void multiply(){
        assertEquals(15, calculator.multiply(3,5));
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(15,3), 0.01);
    }
}
