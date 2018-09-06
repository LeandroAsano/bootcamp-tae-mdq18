package mobile.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import mobile.pages.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends BaseTestSuite {

    private Calculator calculator;

    @Test
    public void calculatorTest(){

        calculator = new Calculator();

        String formula = calculator
                .tapNumber("10000")
                .plus()
                .tapNumber("5000")
                .equals()
                .getFormula();

        Assert.assertEquals(formula,"15000");
    }
}
