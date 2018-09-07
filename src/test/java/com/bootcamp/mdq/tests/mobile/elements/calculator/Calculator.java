package com.bootcamp.mdq.tests.mobile.elements.calculator;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

/**
 * Created by Yo on 5/9/2018.
 */
public class Calculator extends MobilePage {
    @CacheLookup
    @AndroidFindBy(id = "pad_pager")
    private MobileElement keyboard;
    @CacheLookup
    @AndroidFindBy(id = "result")
    private MobileElement resultLabel;

    public String getResult(){
        return getText(resultLabel);
    }

    public KeyList getKeyboard(){
        return new KeyList();
    }
}
