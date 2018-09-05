package com.bootcamp.mdq.mobile.tests;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

/**
 * Created by Matias on 05/09/2018.
 */
public class CalculatorTest extends BaseTestSuite{

    private Calculator calculator;

    @Test
    public void test(){
        calculator= new Calculator();
    }
}
