package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.pages.flights.FlightsResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.isClickable;

public class FlightCard extends WebComponent {

    @FindBy (className = "t-select-btn")
    private WebElement selectButton;


    public FlightCard(WebElement container) {
        super(container);
    }


    public FlightsResults clickOnSelect(){
        isClickable(selectButton);
        click(selectButton);
        return new FlightsResults();
    }


}
