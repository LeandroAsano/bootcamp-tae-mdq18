package com.bootcamp.mdq.mobile.clock.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.support.CacheLookup;

import java.time.LocalTime;

public class Chronometer extends MobilePage {

    @CacheLookup
    @AndroidFindBy (accessibility = "Start")
    private MobileElement startButton;

    @CacheLookup
    @AndroidFindBy (accessibility = "Stop")
    private MobileElement stopButton;

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

    public Chronometer start(){
        click(startButton);
        return this;
    }

    public Chronometer stop(){
        click(stopButton);
        return this;
    }

    public Chronometer reset(){
        click(resetButton);
        return this;
    }

    public Chronometer waitUntil(long seconds){
        LocalTime expected = LocalTime.now().plusSeconds(seconds);
        while (LocalTime.now().compareTo(expected) != 1) {}
        stop();
        return this;
    }








}
