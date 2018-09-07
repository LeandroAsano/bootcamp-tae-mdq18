package com.bootcamp.mdq.tests.mobile.elements.calculator;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;


import java.util.List;

import static java.lang.String.valueOf;

/**
 * Created by Yo on 6/9/2018.
 */
public class KeyList extends MobilePage {


    @CacheLookup
    @AndroidFindBy(className = "android.widget.Button")
    private List<MobileElement> keys;


    public Calculator operation(String operationChars){
        for (char  c : operationChars.toCharArray()) {
            searchkey(c);
        }
        return new Calculator();
    }

    private void searchkey(char input){
        for (MobileElement e : keys){
            if(getText(e).equals(valueOf(input))){
                click(e);
            }
        }
    }


}
