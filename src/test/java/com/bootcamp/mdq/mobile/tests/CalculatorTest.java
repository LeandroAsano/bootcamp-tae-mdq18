package com.bootcamp.mdq.mobile.tests;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Matias on 05/09/2018.
 */
public class CalculatorTest extends BaseTestSuite{

    private Calculator calculator;

    @Before
    public void start(){
        calculator = new Calculator();
    }

    @Test
    public void test(){
      String formula = calculator.tapIntNumber(2)
              .plus()
              .tapIntNumber(3)
              .equals()
              .getFormula();

        Assert.assertEquals("5",formula);

    }
}
