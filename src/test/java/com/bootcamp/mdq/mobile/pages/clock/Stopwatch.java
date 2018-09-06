package com.bootcamp.mdq.mobile.pages.clock;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Matias on 06/09/2018.
 */
public class Stopwatch extends MobilePage {

    @AndroidFindBy(accessibility = "Start")
    public MobileElement startButton;

    @AndroidFindBy(accessibility = "Stop")
    public MobileElement stopButton;

    @AndroidFindBy(id = "stopwatch_time_text")
    public MobileElement timeText;

    public Stopwatch start(){
        startButton.click();
        return this;
    }

    public Stopwatch stop(){
        stopButton.click();
        return this;
    }

    public String getTimeText(){
        return timeText.getText();
    }

    public Stopwatch stopAfterMiliseconds(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return stop();
    }

}
