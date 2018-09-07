package com.bootcamp.mdq.web.pages.flights;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.FlightCard;
import com.bootcamp.mdq.web.pages.components.ModalSaveMoney;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.waits.Waits.areVisible;

public class FlightsResults extends WebPage {

    @FindBy (className = "flight-module")
    private List<WebElement> flightsList;

    @FindBy (id= "xSellHotelForcedChoice")
    private WebElement containerSellHotel;

    public FlightsResults() {
    }

    public FlightsResults chooseADepertureFlight(int item){
        areVisible(flightsList);
        return new FlightCard((flightsList.get(item-1))).clickOnSelect();
    }

    public ModalSaveMoney chooseARetunigFlight(int item){
        flightsList=areVisible(flightsList);
        new FlightCard((flightsList.get(item))).clickOnSelect();
        return new ModalSaveMoney();
    }


}
