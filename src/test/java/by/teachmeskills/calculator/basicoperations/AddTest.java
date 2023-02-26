package by.teachmeskills.calculator.basicoperations;


import by.teachmeskills.calculator.BaseTest;
import org.assertj.core.data.Percentage;
import org.testng.annotations.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTest extends BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite annotation");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Tests for basic operations: start");
    }

    @DataProvider()
    public Object[][] valuesForAdd() {
        return new String[][]{
                {"0", "13.7", "13.7"},
                {"1527.9", "1", "1528.9"},
                {"-14.13", "374.13", "360"},
                {"11111.111111111111111111111111111111111111111111111111111111111111111111111111", "1",
                        "11111.111111111111111111111111111111111111111111111111111111111111111111111112"}};
    }

    @Test(dataProvider = "valuesForAdd")
    public void testAddPositive(String add1, String add2, String result) {
        assertThat(calculator.add(add1, add2)).
                as("Sum is wrong").
                isEqualTo(Double.valueOf(result));
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Tests for basic operations: end");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite annotation");
    }
}
