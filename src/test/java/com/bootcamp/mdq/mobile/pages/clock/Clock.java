package com.bootcamp.mdq.mobile.pages.clock;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Matias on 06/09/2018.
 */
public class Clock extends MobilePage {

    @AndroidFindBy(accessibility = "Alarm")
    public MobileElement alarm;

    @AndroidFindBy(accessibility = "Timer")
    public MobileElement timer;

    @AndroidFindBy(accessibility = "Clock")
    public MobileElement clock;

    @AndroidFindBy(accessibility = "Stopwatch")
    public MobileElement stopwatch;

    public Stopwatch openStopwatch(){
        stopwatch.click();
        return new Stopwatch();
    }

}
