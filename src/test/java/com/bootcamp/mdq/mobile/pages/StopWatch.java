package com.bootcamp.mdq.mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.CacheLookup;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StopWatch extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Start")
    private MobileElement startStopWatchButton;

    @CacheLookup
    @AndroidFindBy(id = "stopwatch_time_text")
    private MobileElement stopWatchTimeText;

    public StopWatch startStopWatch() {
        click(startStopWatchButton);
        return this;
    }

    public StopWatch waitAndStopWatch(int seconds) {

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(startStopWatchButton);
        return this;
    }

    public long getTimeInSeconds() {
        long time = 0;
        String stopWatchText = getText(stopWatchTimeText);
        Stream<String> textSplit = Arrays.stream(stopWatchText.split("\\s+"));
    }

}
