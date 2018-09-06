package com.bootcamp.mdq.mobile.pages.cronometer;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class StopWatch extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Start")
    private MobileElement startStopWatchButton;

    @CacheLookup
    @AndroidFindBy(accessibility = "Stop")
    private MobileElement stopStopWatchButton;

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

        click(stopStopWatchButton);
        return this;
    }

    public long getTimeInSeconds() {
        String stopWatchText = getContentDesc(stopWatchTimeText);
        List<String> textSplit = Arrays.stream(stopWatchText.split("\\s+")).collect(Collectors.toList());
        long minutes = Long.valueOf(textSplit.get(0));
        long seconds = Long.valueOf(textSplit.get(2));
        return (minutes * 60) + seconds;
    }

}
