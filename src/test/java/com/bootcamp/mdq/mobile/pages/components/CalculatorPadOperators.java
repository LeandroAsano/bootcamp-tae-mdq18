package com.bootcamp.mdq.mobile.pages.components;

import com.bootcamp.mdq.page.mobile.MobileComponent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorPadOperators extends MobileComponent {

    @AndroidFindBy(id = "display")
    private MobileElement calculatorDisplay;

    @AndroidFindBy(id = "op_div")
    private MobileElement divide;

    @AndroidFindBy(id = "op_sub")
    private MobileElement minus;

    @AndroidFindBy(id = "op_add")
    private MobileElement plus;

    @AndroidFindBy(id = "op_mul")
    private MobileElement times;

    public CalculatorPadOperators(MobileElement container) {
        super(container);
    }
}
