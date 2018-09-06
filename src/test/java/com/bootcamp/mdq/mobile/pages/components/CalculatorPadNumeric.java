package com.bootcamp.mdq.mobile.pages.components;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
import com.bootcamp.mdq.page.mobile.MobileComponent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorPadNumeric extends MobileComponent {

    @AndroidFindBy(id = "digit_1")
    private MobileElement digit1;

    @AndroidFindBy(id = "digit_2")
    private MobileElement digit2;

    @AndroidFindBy(id = "digit_3")
    private MobileElement digit3;

    @AndroidFindBy(id = "digit_4")
    private MobileElement digit4;

    @AndroidFindBy(id = "digit_5")
    private MobileElement digit5;

    @AndroidFindBy(id = "digit_6")
    private MobileElement digit6;

    @AndroidFindBy(id = "digit_7")
    private MobileElement digit7;

    @AndroidFindBy(id = "digit_8")
    private MobileElement digit8;

    @AndroidFindBy(id = "digit_9")
    private MobileElement digit9;

    @AndroidFindBy(id = "digit_0")
    private MobileElement digit0;

    @AndroidFindBy(id = "dec_point")
    private MobileElement point;

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
            case '0': digit0.click();
                break;
            case '1': digit1.click();
                break;
            case '2': digit2.click();
                break;
            case '3': digit3.click();
                break;
            case '4': digit4.click();
                break;
            case '5': digit5.click();
                break;
            case '6': digit6.click();
                break;
            case '7': digit7.click();
                break;
            case '8': digit8.click();
                break;
            case '9': digit9.click();
                break;
            case '.': point.click();
        }
    }

    public Calculator equals(){
        tap(equals);
        return new Calculator();
    }

}
