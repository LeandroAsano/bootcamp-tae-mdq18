package com.bootcamp.mdq.mobile.tests.clock;

import com.bootcamp.mdq.mobile.tests.clock.pages.Chronometer;
import com.bootcamp.mdq.mobile.tests.clock.pages.Clock;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

public class ChronometerTest extends BaseTestSuite {

    Clock clock;

    @Test
    public void checkStopChonometerTest(){
        clock=new Clock();

        Chronometer chronometer=clock.clickOnChonometer().Start_stop().wait(1500);

        System.out.println(chronometer.getTimeOverChronometer());



    }
}
