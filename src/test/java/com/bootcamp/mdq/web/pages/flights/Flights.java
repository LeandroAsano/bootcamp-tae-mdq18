package com.bootcamp.mdq.web.pages.flights;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flights extends WebPage {
    @FindBy(id="flight-origin-flp")
    private WebElement fromInput;

    @FindBy (id="flight-destination-flp")
    private WebElement toInput;

    @FindBy (id="flight-departing-flp")
    private WebElement  deperturingDate;

    @FindBy (id="flight-returning-flp")
    private WebElement  returingDate;

    @FindBy (id="flight-adults-flp")
    private WebElement numberOfAdults;

    @FindBy(css = "btn-primary btn-action gcw-submit ")
    private WebElement searchButton;


    public Flights(){
        super();
    }

    public Flights typeOrigin(String origin){
        //type(fromInput, origin);
        return this;
    }

    public Flights typeDestination(String destination){
       // type(toInput, destination);
        return this;
    }
    //Days to add to today date
    public Flights chooseAdepertureDate(int days){
        DatePicker date=clickOnDepeture();
        date.clickOnAValidDateOnTheCalendar(days);
        return this;
    }

    public Flights chooseAreturningDate(int days){
        DatePicker date=clickOnReturning();
        date.clickOnAValidDateOnTheCalendar(days);
        return this;
    }

    public Flights setNumberOfAdults(String amount){
        setNumerOf(numberOfAdults, amount);
        return this;
    }

    private DatePicker clickOnDepeture(){
        click(deperturingDate);
        deperturingDate.clear();
        return new DatePicker();
    }

    private DatePicker clickOnReturning(){
        click(returingDate);
        returingDate.clear();
        return new DatePicker();
    }

    public FlightsResults clickOnSearch(){
        click(searchButton);
        return new FlightsResults();
    }
    
}