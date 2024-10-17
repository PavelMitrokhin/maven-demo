package byITacademyMPA.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum1() {
        // 1. Preparation / (Given - Java) / (Arrange - C#)
        Assertions.assertEquals(5, new Calculator().sum(2,3)); //short (middle+)
    }

    @Test
    public void testSum2() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = 4;


        // 2. Action / (When - Java) / (Act - C#)
        int actual = calculator.sum(a,b);

        // 3. Check / (Then - Java) / (Assertion - C#)
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSum3() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;


        // 2. Action / (When - Java) / (Act - C#)
        int actual = calculator.sum(a,b);

        // 3. Check / (Then - Java) / (Assertion - C#)
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSum4() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = -2;


        // 2. Action / (When - Java) / (Act - C#)
        int actual = calculator.sum(a,b);

        // 3. Check / (Then - Java) / (Assertion - C#)
        int expected = -4;
        Assertions.assertEquals(expected, actual);
    }
}
