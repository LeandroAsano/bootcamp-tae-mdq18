package com.bootcamp.mdq.mobile.pages.components;

import com.bootcamp.mdq.mobile.pages.calculator.Calculator;
import com.bootcamp.mdq.page.mobile.MobileComponent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class CalculatorPadOperators extends MobileComponent {

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
        return new Calculator();
    }

    public Calculator plus(){
        click(plus);
        return new Calculator();
    }

    public Calculator times(){
        click(times);
        return new Calculator();
    }

    public Calculator minus(){
        click(minus);
        return new Calculator();
    }

    public CalculatorPadOperators(MobileElement container) {
        super(container);
    }
}
