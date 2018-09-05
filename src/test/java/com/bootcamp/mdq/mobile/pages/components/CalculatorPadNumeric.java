package com.bootcamp.mdq.mobile.pages.components;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
import com.bootcamp.mdq.page.mobile.MobileComponent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class CalculatorPadNumeric extends MobileComponent {

    @AndroidBy(id = "com.android.calculator2:id/digit_1")
    private MobileElement digit1;

    @AndroidBy(id = "com.android.calculator2:id/digit_2")
    private MobileElement digit2;

    @AndroidBy(id = "com.android.calculator2:id/digit_3")
    private MobileElement digit3;

    @AndroidBy(id = "com.android.calculator2:id/digit_4")
    private MobileElement digit4;

    @AndroidBy(id = "com.android.calculator2:id/digit_5")
    private MobileElement digit5;

    @AndroidBy(id = "com.android.calculator2:id/digit_6")
    private MobileElement digit6;

    @AndroidBy(id = "com.android.calculator2:id/digit_7")
    private MobileElement digit7;

    @AndroidBy(id = "com.android.calculator2:id/digit_8")
    private MobileElement digit8;

    @AndroidBy(id = "com.android.calculator2:id/digit_9")
    private MobileElement digit9;

    @AndroidBy(id = "com.android.calculator2:id/digit_0")
    private MobileElement digit0;

    @AndroidBy(id = "com.android.calculator2:id/dec_point")
    private MobileElement point;

    @AndroidBy(id = "com.android.calculator2:id/eq")
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
            case '0': tap(digit0);
            case '1': tap(digit1);
            case '2': tap(digit2);
            case '3': tap(digit3);
            case '4': tap(digit4);
            case '5': tap(digit5);
            case '6': tap(digit6);
            case '7': tap(digit7);
            case '8': tap(digit8);
            case '9': tap(digit9);
            case '.': tap(point);
        }
    }

    public Calculator equals(){
        tap(equals);
        return new Calculator();
    }

}
