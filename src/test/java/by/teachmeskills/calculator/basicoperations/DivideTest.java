package by.teachmeskills.calculator.basicoperations;

import by.teachmeskills.calculator.BaseTest;
import org.assertj.core.data.Percentage;
import org.testng.annotations.*;

import static org.assertj.core.api.Assertions.assertThat;

public class DivideTest extends BaseTest {
    @BeforeGroups(groups = "Division")
    public void beforeGroup() {
        System.out.println("Group tests: start");
    }

    @DataProvider()
    public Object[][] valuesForDivide() {
        return new String[][]{
                {"0", "13.7", "0"},
                {"1527.9", "1527.9", "1"},
                {"1527.9", "-1527.9", "-1"}};
    }

    @BeforeMethod(groups = "Division")
    public void beforeDivision() {
        System.out.println("Check division results: start");
    }

    @Test(dataProvider = "valuesForDivide", groups = {"Division"})
    public void testDividePositive(String divd, String divr, String result) {
        assertThat(calculator.divide(divd, divr)).
                as("Result is wrong").
                isEqualTo(Double.valueOf(result));
    }

    @AfterMethod(groups = "Division")
    public void afterDivision() {
        System.out.println("Check division results: end");
    }

    @AfterGroups(groups = "Division")
    public void afterGroup() {
        System.out.println("Group tests: end");
    }
}
