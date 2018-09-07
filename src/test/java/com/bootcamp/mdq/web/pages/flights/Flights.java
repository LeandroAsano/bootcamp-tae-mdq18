package com.bootcamp.mdq.web.pages.flights;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.DatePicker;
import com.bootcamp.mdq.web.pages.hotel.Hotels;
import org.openqa.selenium.By;
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

    @FindBy(css = "btn-primary.btn-action.gcw-submit")
    private WebElement searchButton;

    @FindBy (id="flight-tabs")
    private WebElement flightContainer;

    public Flights()
    {
        super();
    }

    public Flights typeOrigin(String origin){
        type(fromInput, origin);
        return this;
    }

    public Flights typeDestination(String destination){
       type(toInput, destination);
        return this;
    }

    public Flights chooseAdepertureDate(int year, int month, int day){
        DatePicker calendar=clickOnDepeture();
        calendar.pickADayOnTheCalendar(year, month, day, true);
        return this;
    }

    public Flights chooseAreturningDate(int year, int month, int day){
        DatePicker calendar= clickOnReturning();
        calendar.pickADayOnTheCalendar(year, month, day, false);
        return this;
    }

    public Flights setNumberOfAdults(String amount){
        setNumerOf(numberOfAdults, amount);
        return this;
    }

    private DatePicker clickOnDepeture(){
        click(deperturingDate);
        deperturingDate.clear();
        return new DatePicker(15);
    }

    private DatePicker clickOnReturning(){
        click(returingDate);
        returingDate.clear();
        return new DatePicker(15);
    }

    public FlightsResults clickOnSearch(){
        click( flightContainer.findElement(By.className("gcw-submit")));
        return new FlightsResults();
    }
    
}