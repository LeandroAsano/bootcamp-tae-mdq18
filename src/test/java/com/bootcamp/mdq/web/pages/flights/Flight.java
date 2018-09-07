package com.bootcamp.mdq.web.pages.flights;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 04/09/2018.
 */
public class Flight extends WebPage {

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


    public Flight enterOrigin(String origin){
        type(flightOriginInput,origin);
        return this;
    }

    public Flight enterDestination(String destination){
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

    public Flight selectAdults(int adults){
        selectByText(flightAdultsInput, String.valueOf(adults));
        return this;
    }

    public FlightResult search(){
        click(searchBtn);
        return new FlightResult();
    }
}
