package com.bootcamp.mdq.mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.Arrays;

import static java.lang.Double.valueOf;

public class Calculator extends MobilePage {

    private static final String DIGIT_LOCATOR = "digit_";

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
    @AndroidFindBy(id = "dec_point")
    private MobileElement decimalPoint;

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
                click(digit0Button);
                break;
            case "1":
                click(digit1Button);
                break;
            case "5":
                click(digit5Button);
                break;
            case ".":
                click(decimalPoint);
                break;
        }
        return this;
    }

    public Calculator enterIntegerNumber(double number) {

        // Remove floating point from double value
        String integerNumber = String.valueOf(number).replaceAll("\\.0*$", "");

        // Split into single numbers and for each one click corresponding button
        Arrays.stream(integerNumber.split("(?!^)")).forEach(this::tapDigit);

        return this;
    }

    public Calculator enterFloatingPointNumber(double number) {

        // Split into single numbers and for each one click corresponding button
        Arrays.stream(String.valueOf(number).split("")).forEach(this::tapDigit);

        return this;
    }

    public Calculator selectOperation(String operation) {
        switch (operation) {
            case "+":
                click(addButton);
                break;
        }
        return this;
    }

    public double getResult() {
        return valueOf(getText(resultLayout)).doubleValue();
    }

}
