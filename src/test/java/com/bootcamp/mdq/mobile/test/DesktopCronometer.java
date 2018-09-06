package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.cronometer.DesktopClock;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class DesktopCronometer extends BaseTestSuite {

    private DesktopClock deskCronometer;


    @Before
    public void setupDesktopCronometer() {
        this.deskCronometer = new DesktopClock();
    }

    /**
     * Starts the cronometer and stops it between a range of time. Then verifies if the time in the cronometer
     * is less than the max of the defined range.
     */
    @Test
    public void startStopCronometer() {

        int expectedTimeSeconds = 25;

        // Create a random time in seconds to stop the cronometer given min and max bounds
        int randomTime = ThreadLocalRandom.current().nextInt(20, expectedTimeSeconds + 1);

        long actualTimeSeconds = deskCronometer.clickStopWatchTab()
                .startStopWatch()
                .waitAndStopWatch(randomTime)
                .getTimeInSeconds();

        Assert.assertTrue(expectedTimeSeconds > actualTimeSeconds);
    }

}
