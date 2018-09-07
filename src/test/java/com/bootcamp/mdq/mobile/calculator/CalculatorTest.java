package com.bootcamp.mdq.mobile.calculator;

import com.bootcamp.mdq.mobile.calculator.pages.Calculator;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends BaseTestSuite {

    Calculator calculator;

    @Test
    public void basicOperationCalculatorTest() {

        calculator = new Calculator();

        String result = calculator.entryAnumber("10000")
                .add()
                .entryAnumber("5000")
                .equals()
                .getResult();

        Assert.assertEquals(result, "15000");


    }
}
