package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.chronometer.DesktopClock;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class DesktopChronometer extends BaseTestSuite {

    private DesktopClock clock;


    @Before
    public void setupDesktopChronometer() {
        this.clock = new DesktopClock();
    }

    /**
     * Starts the chronometer and stops it between a range of time. Then verifies if the time in the chronometer
     * is less than the max of the defined range.
     */
    @Test
    public void startStopChronometer() {

        int expectedTimeSeconds = 25;

        // Create a random time in seconds to stop the chronometer given min and max bounds
        int randomTime = ThreadLocalRandom.current().nextInt(20, expectedTimeSeconds + 1);

        long actualTimeSeconds = clock.switchToStopWatch()
                .startStopWatch()
                .waitAndStopWatch(randomTime)
                .getTimeInSeconds();

        Assert.assertTrue(expectedTimeSeconds > actualTimeSeconds);
    }

}
