package com.bootcamp.mdq.mobile.tests.clock.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Clock extends MobilePage {

    @CacheLookup
    @AndroidFindBy (accessibility = "Stopwatch")
    private MobileElement stopwatch;


    @AndroidFindBy (id = "digital_clock")
    private MobileElement time;

    public Clock() {
    }

    public Chronometer clickOnChonometer(){
        click(stopwatch);
        return new Chronometer();
    }


}
