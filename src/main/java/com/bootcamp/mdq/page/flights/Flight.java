package com.bootcamp.mdq.page.flights;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by Matias on 30/08/2018.
 */
public class Flight extends BasePage {

    @FindBy(id = "flight-origin.flp")
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
    private List<WebElement> searchBtn;

    private Flight origin(String origin){
        type(flightOriginInput,origin);
        return this;
    }

    private Flight enterDestination(String destination){
        type(flighDestinationInput,destination);
        return this;
    }

    private Flight enterCheckIn(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(flightDepartingInput,(LocalDate.now().plusDays(daysAhead).format(format)));
        return this;
    }

    private Flight enterCheckOut(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        clear(flightReturningInput);
        type(flightReturningInput,(LocalDate.now().plusDays(daysAhead).format(format)));
        return this;
    }

    public Flight selectAdults(int adults){
        selectByText(flightAdultsInput, String.valueOf(adults));
        return this;
    }

    public FlightResult search(){
        return new FlightResult();
    }



}
