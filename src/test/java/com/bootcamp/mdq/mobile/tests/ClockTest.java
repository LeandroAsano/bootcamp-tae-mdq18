package com.bootcamp.mdq.mobile.tests;

import com.bootcamp.mdq.mobile.pages.clock.Clock;
import com.bootcamp.mdq.mobile.pages.clock.Stopwatch;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Matias on 06/09/2018.
 */
public class ClockTest extends BaseTestSuite {

    private Clock clock;

    @Before
    public void start(){
        clock = new Clock();
    }

    @Test
    public void chronometerElapsedTimeTest(){
        String time = clock.openStopwatch()
                .start()
                .stopAfterMiliseconds(5000)
                .getTimeText();
        System.out.println(time);
    }

}
