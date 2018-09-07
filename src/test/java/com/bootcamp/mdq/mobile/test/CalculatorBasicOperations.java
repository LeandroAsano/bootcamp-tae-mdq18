package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
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
        double result = calculator.enterNumber("10000")
                .selectOperation("+")
                .enterNumber("5000")
                .getResult();

        Assert.assertTrue(result == 15000);
    }

}