package by.teachmeskills.calculator;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NotANumberTest extends BaseTest {
    @Test(invocationCount = 2, threadPoolSize = 2)
    public void testNan() {
        assertThat(calculator.divide(String.valueOf(Double.NaN), "1")).
                as("Result should be NAN")
                .isNaN();
    }

    @Test(groups = "Division")
    public void testNanDivideByZero() {
        assertThat(calculator.divide(String.valueOf(Double.NaN), "0")).
                as("Result should be NAN")
                .isNaN();
    }

    @Test
    public void testNanNan() {
        assertThat(calculator.add(String.valueOf(Double.NaN), String.valueOf(Double.NaN))).
                as("Result should be NAN")
                .isNaN();
    }
}
