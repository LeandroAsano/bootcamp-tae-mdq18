package com.bootcamp.mdq.mobile.pages.components;

import com.bootcamp.mdq.page.mobile.MobileComponent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorDisplay extends MobileComponent {

    @AndroidFindBy(id = "formula")
    private MobileElement formula;

    @AndroidFindBy(id = "result")
    private MobileElement result;

    public String getFormula(){
        return formula.getText();
    }

    public CalculatorDisplay(MobileElement container) {
        super(container);
    }
}
