package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class Clock extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Stopwatch")
    public MobileElement stopwatch;


    public Chronometer openChonometer(){
        click(stopwatch);
        return new Chronometer();
    }
}