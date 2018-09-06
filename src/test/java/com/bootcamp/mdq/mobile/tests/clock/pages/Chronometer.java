package com.bootcamp.mdq.mobile.tests.clock.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chronometer extends MobilePage {

    @CacheLookup
    @AndroidFindBy (accessibility = "Start")
    private MobileElement startButton;

    @AndroidFindBy (id = "stopwatch_time")
    private MobileElement chronometer;

    @AndroidFindBy(id="stopwatch_time_text")
    private MobileElement chronometerText;

    @CacheLookup
    @AndroidFindBy (accessibility="Lap")
    private MobileElement lapButton;

    @CacheLookup
    @AndroidFindBy (accessibility = "Reset")
    private MobileElement resetButton;

    public Chronometer() {
    }

    public Chronometer Start_stop(){
        click(startButton);
        return this;
    }

    public Chronometer reset(){
        click(resetButton);
        return this;
    }

    public Chronometer wait(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.toString();
        }
        Start_stop();
        return this;
    }

    public String getTimeOverChronometer(){
        return getText(chronometerText);
    }






}
