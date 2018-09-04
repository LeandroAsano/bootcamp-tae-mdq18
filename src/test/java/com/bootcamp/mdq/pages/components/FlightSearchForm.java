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

    @FindBy(id = "flight-departing-wrapper-flp")
    private WebElement flightDepartingCalendar;

    @FindBy(id = "flight-returning-wrapper-flp")
    private WebElement flightReturningCalendar;

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

    public DatePicker enterCheckIn(){
        click(flightDepartingInput);
        return new DatePicker(flightDepartingCalendar);
    }

    public DatePicker enterCheckOut(){
        click(flightReturningInput);
        return new DatePicker(flightReturningCalendar);
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
