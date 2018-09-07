package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class Chronometer extends MobilePage {

    @CacheLookup
    @AndroidFindBy (accessibility = "Start")
    private MobileElement startBtn;

    @CacheLookup
    @AndroidFindBy(accessibility = "Stop")
    public MobileElement stopBtn;

    @CacheLookup
    @AndroidFindBy(id="stopwatch_time_text")
    private MobileElement chronometerText;

    public Chronometer() {
    }

    public Chronometer start(){
        click(startBtn);
        return this;
    }

    public Chronometer stop(){
        click(stopBtn);
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
        return chronometerText.getAttribute("contentDescription").replaceAll("[a-zA-Z]","").replaceAll(" ", "");
    }
}