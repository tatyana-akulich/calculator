package by.teachmeskills.calculator;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InfinityTest extends BaseTest {
    @Test()
    public void testPositiveInfinityZero() {
        assertThat(calculator.divide("26374", "0"))
                .as("Expected result is positive infinity")
                .isEqualTo(Double.POSITIVE_INFINITY);
    }

    @Test(priority = 1)
    public void testNegativeInfinityZero() {
        assertThat(calculator.divide("-26374", "0"))
                .as("Expected result is negative infinity")
                .isEqualTo(Double.NEGATIVE_INFINITY);
    }

    @Test(priority = 3, groups = "Division")
    public void testDivideInfinityDigits() {
        assertThat(calculator.divide("26374", String.valueOf(Double.NEGATIVE_INFINITY)))
                .as("Expected result is negative infinity")
                .isEqualTo(-0);
    }

    @Test(priority = 2)
    public void testAddInfinity() {
        assertThat(calculator.add("26374", String.valueOf(Double.NEGATIVE_INFINITY)))
                .as("Expected result is negative infinity")
                .isEqualTo(Double.NEGATIVE_INFINITY);
    }
}
