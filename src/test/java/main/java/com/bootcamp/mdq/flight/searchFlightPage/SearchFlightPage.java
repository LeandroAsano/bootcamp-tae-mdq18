package com.bootcamp.mdq.flight.searchFlightPage;

import com.bootcamp.mdq.flight.flightResultPage.FlightResultPage;
import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFlightPage extends BasePage {

    @FindBy(id = "flight-origin-flp")
    private WebElement flyingFromInput;

    @FindBy(id = "flight-destination-flp")
    private WebElement flyngToInput;

    @FindBy(id = "flight-adults-flp")
    private WebElement adultsToFly;

    @FindBy(css = "[type='submit']")
    private WebElement searchFlyButton;

    public FlightResultPage clickSearchFlyButton(){
        click(searchFlyButton);
        return new FlightResultPage();
    }

    public SearchFlightPage typeLocationFromFlight(String location,int index) {
        type(flyingFromInput,location);
        select(flyingFromInput,index);
        return this;
    }

    public SearchFlightPage typeDestinationFlight(String location) {
        type(flyingFromInput,location);
        return this;
    }

    public SearchFlightPage adultsNumberToFlyInput(int index) {
        select(adultsToFly,index-1);
        return this;
    }


}
