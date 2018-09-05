package com.bootcamp.mdq.mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.Arrays;

public class Calculator extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id = "digit_0")
    private MobileElement digit0Button;

    @CacheLookup
    @AndroidFindBy(id = "digit_1")
    private MobileElement digit1Button;

    @CacheLookup
    @AndroidFindBy(id = "digit_5")
    private MobileElement digit5Button;

    @CacheLookup
    @AndroidFindBy(id = "op_add")
    private MobileElement addButton;

    @CacheLookup
    @AndroidFindBy(accessibility = "equals")
    private MobileElement equalsButton;

    @CacheLookup
    @AndroidFindBy(id = "formula")
    private MobileElement formulaLayout;

    @CacheLookup
    @AndroidFindBy(id = "result")
    private MobileElement resultLayout;

    private Calculator tapDigit(String digit) {
        switch (digit) {
            case "0":
                tap(digit0Button);
            case "1":
                tap(digit0Button);
            case "5":
                tap(digit5Button);
        }
        return this;
    }

    public Calculator enterNumber(double number) {
        Arrays.stream(String.valueOf(number).split("(?!^)")).forEach(this::tapDigit);
        return this;
    }

    public Calculator selectOperation(String operation) {
        switch (operation) {
            case "+": tap(addButton);
        }
        return this;
    }

    public String getResult() {
        return getText(resultLayout);
    }

}
