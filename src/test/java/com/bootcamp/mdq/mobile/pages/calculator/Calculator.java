package com.bootcamp.mdq.mobile.pages.calculator;

import com.bootcamp.mdq.mobile.pages.components.CalculatorDisplay;
import com.bootcamp.mdq.mobile.pages.components.CalculatorPadNumeric;
import com.bootcamp.mdq.mobile.pages.components.CalculatorPadOperators;
import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class Calculator extends MobilePage {

    @AndroidFindBy(id = "pad_numeric")
    private MobileElement calculatorPadNumeric;

    @AndroidFindBy(id = "pad_operator")
    private MobileElement calculatorPadOperators;

    @AndroidFindBy(id = "display")
    private MobileElement calculatorDisplay;

    @CacheLookup
    @AndroidFindBy(id = "op_div")
    private MobileElement divide;

    @CacheLookup
    @AndroidFindBy(id = "op_sub")
    private MobileElement minus;

    @CacheLookup
    @AndroidFindBy(id = "op_add")
    private MobileElement plus;

    @CacheLookup
    @AndroidFindBy(id = "op_mul")
    private MobileElement times;

    public Calculator divide(){
        click(divide);
        return this;
    }

    public Calculator plus(){
        click(plus);
        return this;
    }

    public Calculator times(){
        click(times);
        return this;
    }

    public Calculator minus(){
        click(minus);
        return this;
    }

    /*
    public CalculatorPadNumeric pad(){return new CalculatorPadNumeric(calculatorPadNumeric);}

    public CalculatorPadOperators operator(){
        return new CalculatorPadOperators(calculatorPadOperators);
    }

    public CalculatorDisplay read(){
        return new CalculatorDisplay(calculatorDisplay);
    }
    */

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

    public Calculator tapIntNumber(Integer number){
        String num = number.toString();
        for(int i = 0; i < num.length() ; i++){
            tapDigit(num.charAt(i));
        }
        return this;
    }

    public Calculator tapDoubleNumber(Double number){
        String num = number.toString();
        for(int i = 0; i < num.length() ; i++){
            tapDigit(num.charAt(i));
        }
        return this;
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
        click(equals);
        return this;
    }

    @AndroidFindBy(id = "formula")
    private MobileElement formula;

    @AndroidFindBy(id = "result")
    private MobileElement result;

    public String getFormula(){
        return getText(formula);
    }

}
