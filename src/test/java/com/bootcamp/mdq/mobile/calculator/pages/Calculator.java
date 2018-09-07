package com.bootcamp.mdq.mobile.calculator.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class Calculator extends MobilePage {

    //@AndroidFindBy(id="pad_numeric")

    //@AndroidFindBy(id="pad_operator")

    // *********** NUMERIC PAD ELEMENTS ***********
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
    private MobileElement decpoint;

    // *********** RESULT ***********

    @AndroidFindBy(id = "result")
    private MobileElement result;


    @AndroidFindBy(id = "formula")
    private MobileElement formula;

    // *********** OPERATION PAD ELEMENTS  ***********

    @CacheLookup
    @AndroidFindBy(accessibility = "delete")
    private MobileElement delete;

    @CacheLookup
    @AndroidFindBy(accessibility = "divide")
    private MobileElement divide;

    @CacheLookup
    @AndroidFindBy(accessibility = "times")
    private MobileElement multiplication;

    @CacheLookup
    @AndroidFindBy(accessibility = "minus")
    private MobileElement minus;

    @CacheLookup
    @AndroidFindBy(accessibility = "plus")
    private MobileElement add;

    // *********** EQUALS ***********

    @CacheLookup
    @AndroidFindBy(accessibility = "equals")
    private MobileElement equals;


    public Calculator add() {
        click(add);
        return this;
    }

    public Calculator minus() {
        click(minus);
        return this;
    }

    public Calculator divide() {
        click(divide);
        return this;
    }

    public Calculator multiplication() {
        click(multiplication);
        return this;
    }

    public Calculator equals() {
        click(equals);
        return this;
    }

    private Calculator tapA_Digit(char digit) {
        switch (digit) {
            case '0':
                click(digit0);
                break;
            case '1':
                click(digit1);
                break;
            case '2':
                click(digit2);
                break;
            case '3':
                click(digit3);
                break;
            case '4':
                click(digit4);
                break;
            case '5':
                click(digit5);
                break;
            case '6':
                click(digit6);
                break;
            case '7':
                click(digit7);
                break;
            case '8':
                click(digit8);
                break;
            case '9':
                click(digit9);
                break;
            default:
                click(decpoint);
                break;
        }
        return this;
    }

    public Calculator entryAnumber(String number) {
        for (int x = 0; x < number.length(); x++) {
            tapA_Digit(number.charAt(x));
        }
        return this;
    }

    public String getResult() {
        return getText(formula);
    }


}