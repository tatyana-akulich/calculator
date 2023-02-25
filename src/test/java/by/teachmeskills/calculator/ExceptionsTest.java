package by.teachmeskills.calculator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExceptionsTest extends BaseTest {
    @Parameters({"arg1", "arg2"})
    @Test(expectedExceptions = NullPointerException.class, description = "test for null argument")
    public void testNullArgument(String arg1, String arg2) {
        calculator.add(arg1, arg2);
    }

    @Test(expectedExceptions = NumberFormatException.class, description = "test for non-digit arguments")
    public void testNumberFormatNotDigits() {
        calculator.add("abcd", "111");
    }

    @Test(expectedExceptions = NumberFormatException.class, description = "test for doubles entered with coma")
    public void testNumberFormatDigitWithComa() {
        calculator.add("15,1", "111");
    }
}
