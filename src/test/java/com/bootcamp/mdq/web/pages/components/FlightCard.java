package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.pages.flights.FlightResult;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.*;

/**
 * Created by Matias on 03/09/2018.
 */
public class FlightCard extends WebComponent {

    @FindBy(css = "button.btn-secondary.btn-action.t-select-btn")
    private WebElement selectButton;

    @FindBy(css = "[data-test-id=\"airline-name\"]")
    private WebElement airlineNameSpan;

    @FindBy(css = "[data-test-id=\"select-button\"]")
    private WebElement selectThisFareButton;

    @FindBy(id = "xSellHotelForcedChoice")
    private WebElement hotelSellModal;

    public FlightCard(WebElement container) {
        super(container);
    }

    public FlightResult selectFlight(){
        click(selectButton);
        /*if(isVisible(selectThisFareButton).isDisplayed()){
            click(selectThisFareButton);
        }*/
        return new FlightResult();
    }

    public HotelSellModal selectReturnFlight(){
        click(selectThisFareButton);
        if(isVisible(selectThisFareButton).isDisplayed()){
            click(selectThisFareButton);
        }
        return new HotelSellModal(hotelSellModal);
    }

    public String getAirlineName(){
        return getText(airlineNameSpan);
    }
}
