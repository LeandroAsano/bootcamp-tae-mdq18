package com.bootcamp.mdq.tests.mobile.elements.calculator;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Yo on 5/9/2018.
 */
public class Calculator extends MobilePage {

    @AndroidFindBy(id = "pad_pager")
    private MobileElement Keyboard;

    @AndroidFindBy(id = "result")
    private MobileElement resultLabel;

    public String getResult(){
        return getText(resultLabel);
    }

    public KeyList getKeyboard(){
        return new KeyList();
    }
}
