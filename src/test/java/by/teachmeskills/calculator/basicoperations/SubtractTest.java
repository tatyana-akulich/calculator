package by.teachmeskills.calculator.basicoperations;

import by.teachmeskills.calculator.BaseTest;
import org.assertj.core.data.Percentage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtractTest extends BaseTest {
    @DataProvider()
    public Object[][] valuesForSubtract() {
        return new String[][]{
                {"0", "13.7", "-13.7"},
                {"1527.9", "0", "1527.9"},
                {"-14.13", "-374.13", "360"}};
    }

    @Test(dataProvider = "valuesForSubtract")
    public void testAddPositive(String min, String sub, String result) {
        assertThat(calculator.subtract(min, sub)).
                as("Sum is wrong").
                isEqualTo(Double.valueOf(result));
    }
}
