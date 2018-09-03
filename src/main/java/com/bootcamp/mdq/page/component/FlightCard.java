package com.bootcamp.mdq.page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 03/09/2018.
 */
public class FlightCard extends BaseComponent{

    @FindBy(css = "button.btn-secondary.btn-action.t-select-btn")
    private WebElement selectBtn;

    @FindBy(css = "[data-test-id=\"select-button\"]")
    private WebElement selectThisBtn;

    public FlightCard(WebElement container) {
        super(container);
    }




}
