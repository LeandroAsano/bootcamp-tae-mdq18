package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.Calculator;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorBasicOperations extends BaseTestSuite {

    private Calculator calculator;

    @Before
    public void setupCalculator() {
        this.calculator = new Calculator();
    }

    @Test
    public void performBasicOperations() {
        String result = calculator.enterNumber(10000)
                .selectOperation("+")
                .enterNumber(5000)
                .getResult();

        Assert.assertEquals(150000, java.util.Optional.of(Double.valueOf(result)));
    }

}
