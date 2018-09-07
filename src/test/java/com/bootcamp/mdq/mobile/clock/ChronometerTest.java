package com.bootcamp.mdq.mobile.clock;

import com.bootcamp.mdq.mobile.clock.pages.Chronometer;
import com.bootcamp.mdq.mobile.clock.pages.Clock;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

public class ChronometerTest extends BaseTestSuite {

    Clock clock;

    @Test
    public void checkStopChonometerTest() {
        clock = new Clock();

        Chronometer chronometer = clock.clickOnChonometer()
                .start()
                .waitUntil(10);


    }
}
