package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.DesktopClock;
import com.bootcamp.mdq.mobile.pages.StopWatch;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Stopwatch;

public class DesktopCronometer extends BaseTestSuite {

    private DesktopClock deskCronometer;

    @Before
    public void setupDesktopCronometer() {
        this.deskCronometer = new DesktopClock();
    }

    @Test
    public void startStopCronometer() {
        StopWatch sWatch = deskCronometer.clickStopWatchTab();

    }

}
