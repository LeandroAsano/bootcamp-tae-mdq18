package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.flights.FlightResult;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by Matias on 30/08/2018.
 */
public class FlightSearchForm extends WebComponent {

    @FindBy(id = "flight-origin-flp")
    private WebElement flightOriginInput;

    @FindBy(id = "flight-destination-flp")
    private WebElement flighDestinationInput;

    @FindBy(id = "flight-departing-flp")
    private WebElement flightDepartingInput;

    @FindBy(id = "flight-returning-flp")
    private WebElement flightReturningInput;

    @FindBy(id = "flight-adults-flp")
    private WebElement flightAdultsInput;

    @FindBy(css = "button.btn-primary.btn-action.gcw-submit")
     private WebElement searchBtn;

    public FlightSearchForm(WebElement container) {
        super(container);
    }

    public FlightSearchForm enterOrigin(String origin){
        type(flightOriginInput,origin);
        return this;
    }

    public FlightSearchForm enterDestination(String destination){
        type(flighDestinationInput,destination);
        return this;
    }

    public FlightSearchForm enterCheckIn(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(flightDepartingInput,(LocalDate.now().plusDays(daysAhead).format(format)));
        return this;
    }

    public FlightSearchForm enterCheckOut(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(flightReturningInput,(LocalDate.now().plusDays(daysAhead).format(format)));
        return this;
    }

    public FlightSearchForm selectAdults(int adults){
        selectByText(flightAdultsInput, String.valueOf(adults));
        return this;
    }

    public FlightResult search(){
        click(searchBtn);
        return new FlightResult();
    }



}
