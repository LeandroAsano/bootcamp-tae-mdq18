package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Chronometer extends MobilePage {

    @AndroidFindBy (accessibility = "Start")
    private MobileElement startBtn;

    @AndroidFindBy(accessibility = "Stop")
    public MobileElement stopBtn;

    @AndroidFindBy(id="stopwatch_time_text")
    private MobileElement chronometerText;


    public Chronometer() {
    }

    public Chronometer start(){
        startBtn.click();
        return this;
    }

    public Chronometer stop(){
        stopBtn.click();
        return this;
    }

    public Chronometer stopTime(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        }
        catch (InterruptedException e) {
            e.toString();
        }
        return stop();
    }

    public String getChronometerText(){
        return chronometerText.getText();
    }
}
