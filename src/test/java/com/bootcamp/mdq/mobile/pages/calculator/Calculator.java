package com.bootcamp.mdq.mobile.pages.calculator;

import com.bootcamp.mdq.mobile.pages.components.CalculatorDisplay;
import com.bootcamp.mdq.mobile.pages.components.CalculatorPadNumeric;
import com.bootcamp.mdq.mobile.pages.components.CalculatorPadOperators;
import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class Calculator extends MobilePage {

    @AndroidBy(id = "com.android.calculator2:id/pad_numeric")
    private MobileElement calculatorPadNumeric;

    @AndroidBy(id = "com.android.calculator2:id/pad_operator")
    private MobileElement calculatorPadOperators;

    @AndroidBy(id = "com.android.calculator2:id/display")
    private MobileElement calculatorDisplay;

    public CalculatorPadNumeric enterNumber(){
        return new CalculatorPadNumeric(calculatorPadNumeric);
    }

    public CalculatorPadOperators enterOperator(){
        return new CalculatorPadOperators(calculatorPadOperators);
    }

    public CalculatorDisplay readDisplay(){
        return new CalculatorDisplay(calculatorDisplay);
    }

}
