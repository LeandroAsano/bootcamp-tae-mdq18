package com.bootcamp.mdq.tests.mobile.elements.deskclock;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yo on 6/9/2018.
 */
public class ChronometerScreen  extends MobilePage{
    @CacheLookup
    @AndroidFindBy(id = "Start")
    private MobileElement startChronometerButton;
    @CacheLookup
    @AndroidFindBy(id = "Stop")
    private MobileElement stopChronometerButton;

    public ChronometerScreen start(){
        click(startChronometerButton);
        return this;
    }

    public ResultTime stop(int waits) {
        try {
            TimeUnit.SECONDS.sleep(waits);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(stopChronometerButton);

        return new ResultTime();
    }

}
