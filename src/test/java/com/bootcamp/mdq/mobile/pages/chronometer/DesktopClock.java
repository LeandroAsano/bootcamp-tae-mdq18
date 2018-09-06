package com.bootcamp.mdq.mobile.pages.chronometer;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class DesktopClock extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Stopwatch")
    private MobileElement stopWatch;

    public StopWatch switchToStopWatch() {
        click(stopWatch);
        return new StopWatch();
    }
}
