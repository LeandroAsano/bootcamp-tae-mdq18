package com.bootcamp.mdq.tests.mobile.elements.deskclock;

import com.bootcamp.mdq.page.mobile.MobileComponent;
import com.bootcamp.mdq.page.mobile.MobilePage;
import com.sun.xml.internal.fastinfoset.util.CharArray;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yo on 6/9/2018.
 */
public class ResultTime extends MobilePage {

    @AndroidFindBy(id = "stopwatch_time_text")
    private MobileElement chrometerResult;

    public ResultTime() {
    }


    public int getTime(){
        String s = chrometerResult.getAttribute("contentDescription");
        String mins = "";
        for (char a : s.toCharArray()) {
            if(Character.isDigit(a)){
                mins += String.valueOf(a);
            }
        }
        return Integer.valueOf(mins);
    }
}
