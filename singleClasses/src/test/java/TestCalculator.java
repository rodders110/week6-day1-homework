import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void calculatorCanAdd(){
        Calculator calculator = new Calculator(2, 3);
        assertEquals(5, calculator.add());
    }
}
