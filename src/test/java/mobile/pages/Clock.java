package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Clock extends MobilePage {

    @AndroidFindBy(accessibility = "Stopwatch")
    public MobileElement stopwatch;

    @AndroidFindBy(accessibility = "Timer")
    public MobileElement timer;

    @AndroidFindBy(accessibility = "Clock")
    public MobileElement clock;

    public Chronometer openChonometer(){
        stopwatch.click();
        return new Chronometer();
    }
}
