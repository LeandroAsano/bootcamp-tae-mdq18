package com.bootcamp.mdq.mobile.pages.components;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
import com.bootcamp.mdq.page.mobile.MobileComponent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class CalculatorPadNumeric extends MobileComponent {

    @CacheLookup
    @AndroidFindBy(id = "digit_1")
    private MobileElement digit1;

    @CacheLookup
    @AndroidFindBy(id = "digit_2")
    private MobileElement digit2;

    @CacheLookup
    @AndroidFindBy(id = "digit_3")
    private MobileElement digit3;

    @CacheLookup
    @AndroidFindBy(id = "digit_4")
    private MobileElement digit4;

    @CacheLookup
    @AndroidFindBy(id = "digit_5")
    private MobileElement digit5;

    @CacheLookup
    @AndroidFindBy(id = "digit_6")
    private MobileElement digit6;

    @CacheLookup
    @AndroidFindBy(id = "digit_7")
    private MobileElement digit7;

    @CacheLookup
    @AndroidFindBy(id = "digit_8")
    private MobileElement digit8;

    @CacheLookup
    @AndroidFindBy(id = "digit_9")
    private MobileElement digit9;

    @CacheLookup
    @AndroidFindBy(id = "digit_0")
    private MobileElement digit0;

    @CacheLookup
    @AndroidFindBy(id = "dec_point")
    private MobileElement point;

    @CacheLookup
    @AndroidFindBy(id = "eq")
    private MobileElement equals;

    public CalculatorPadNumeric(MobileElement container) {
        super(container);
    }

    public Calculator tapIntNumber(Integer number){
        String num = number.toString();
        for(int i = 0; i < num.length() ; i++){
            tapDigit(num.charAt(i));
        }
        return new Calculator();
    }

    public Calculator tapDoubleNumber(Double number){
        String num = number.toString();
        for(int i = 0; i < num.length() ; i++){
            tapDigit(num.charAt(i));
        }
        return new Calculator();
    }


    public void tapDigit(char digit){
        switch (digit){
            case '0': click(digit0);
                break;
            case '1': click(digit1);
                break;
            case '2': click(digit2);
                break;
            case '3': click(digit3);
                break;
            case '4': click(digit4);
                break;
            case '5': click(digit5);
                break;
            case '6': click(digit6);
                break;
            case '7': click(digit7);
                break;
            case '8': click(digit8);
                break;
            case '9': click(digit9);
                break;
            case '.': click(point);
        }
    }

    public Calculator equals(){
        tap(equals);
        return new Calculator();
    }

}
