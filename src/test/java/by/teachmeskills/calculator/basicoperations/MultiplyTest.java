package by.teachmeskills.calculator.basicoperations;

import by.teachmeskills.calculator.BaseTest;
import by.teachmeskills.util.RetryAnalyzer;
import org.assertj.core.data.Percentage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplyTest extends BaseTest {
    @DataProvider()
    public Object[][] valuesForMultiply() {
        return new String[][]{
                {"0", "13.7", "0"},
                {"1527.9", "1", "1527.9"},
                {"1527.9", "-1", "-1527.9"}};
    }

    @Test(dataProvider = "valuesForMultiply")
    public void testDividePositive(String mult1, String mult2, String result) {
        assertThat(calculator.miltiply(mult1, mult2)).
                as("Result is wrong").
                isEqualTo(Double.valueOf(result));
    }
}
