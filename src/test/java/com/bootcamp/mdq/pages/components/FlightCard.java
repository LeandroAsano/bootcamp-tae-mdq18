package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.flights.FlightResult;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 03/09/2018.
 */
public class FlightCard extends WebComponent {

    @FindBy(css = "button.btn-secondary.btn-action.t-select-btn")
    private WebElement selectBtn;

    @FindBy(css = "[data-test-id=\"airline-name\"]")
    private WebElement airlineNameSpan;

    @FindBy(css = "[data-test-id=\"select-button\"]")
    private WebElement selectThisBtn;

    public FlightCard(WebElement container) {
        super(container);
    }

    public FlightResult selectFlight(){
        click(selectBtn);
        return new FlightResult();
    }

    public String getAirlineName(){
        return getText(airlineNameSpan);
    }
}
