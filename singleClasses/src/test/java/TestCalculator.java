import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(4, 2);
    }

    @Test
    public void calculatorCanAdd(){
        assertEquals(6, calculator.add());
    }

    @Test
    public void calculatorCanSubtract(){
        assertEquals(2, calculator.subtract());
    }

    @Test
    public void calculatorCanDivide(){
        assertEquals(2, calculator.divide());
    }

    @Test
    public void calculatorCanMultiply(){
        assertEquals(8, calculator.multiply());
    }
}
