package com.bootcamp.mdq.tests.mobile.tests;

import com.bootcamp.mdq.tests.mobile.elements.calculator.Calculator;
import com.bootcamp.mdq.tests.mobile.elements.deskclock.DeskClock;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;


public class Tests extends BaseTestSuite {

    private Calculator app;

    private DeskClock deskClock;

    @Test
    public void calculatorTest() {
        String expectedResult = "15000";
        String operationChars = "10000+5000";
        app = new Calculator();
        String result = app.getKeyboard()
                .opearation(operationChars)
                .getResult();
        Assert.assertEquals(expectedResult,result);
    }


    @Test
    public void clockTest(){
        int max = 25;
        deskClock = new DeskClock();
        int result = deskClock.goToChronometer().start().stop(20).getTime();
        Assert.assertTrue(max > result);

    }
}
