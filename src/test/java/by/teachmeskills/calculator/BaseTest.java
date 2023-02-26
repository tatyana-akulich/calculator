package by.teachmeskills.calculator;

import by.teachmeskills.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(groups = "Division")
    public void createCalculator() {
        calculator = new Calculator();
    }
}
