package com.bootcamp.mdq.web.pages.hotel;


import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotels extends WebPage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement searchInput;

    @FindBy(css = "footer a.close")
    private WebElement closeDestination;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkInDate;

    @FindBy(id = "hotel-checkout-hlp")
    private WebElement checkOutDate;

    @FindBy(id = "package-rooms-hp-package")
    private WebElement amountOfRooms;

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement amountOfAdults;

    @FindBy(id = "hotel-1-children-hlp")
    private WebElement amountOfChilden;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private WebElement child1Age;

    @FindBy(css = "[data-gcw-change-submit-text='Search']")
    private WebElement searchButton;

    @FindBy(id = "hero-banner")
    private WebElement banner;

    @FindBy(css = "[aria-label= \"Close\"]")
    private WebElement closeSuggestionButton;



    public Hotels() {
        super();
    }


    public Hotels typeHotelName(String name) {
        type(searchInput, name);
        return this;
    }

    public Hotels closeSuggestion() {
        click(closeSuggestionButton);
        return this;
    }


    public Hotels setCheckInDate(String date) {
        click(checkInDate);
        type(checkInDate, date);
        return this;
    }

    public Hotels setCheckOutDate(String date) {
        click(checkOutDate);
        type(checkOutDate, date);
        return  this;
    }



    public DatePicker clickOnCheckIn(){
        click(checkInDate);
        checkInDate.clear();
        return new DatePicker(15);
    }

    public DatePicker clickondateout(){
        click(checkOutDate);
        checkOutDate.clear();
        return new DatePicker(0);
    }

    public Hotels checkInDate(int year, int month, int day){
        DatePicker calendar=clickOnCheckIn();
        calendar.pickADayOnTheCalendar(year, month, day, true);
        return this;
    }

    public Hotels checkOutDate(int year, int month, int day){
        DatePicker calendar=clickondateout();
        calendar.pickADayOnTheCalendar(year, month, day, false);
        return this;
    }

    public SearchResults clickOnSearch() {
        click(searchButton);
        return new SearchResults();
    }

    public Hotels setAmountOfChilden(String childen) {
        setNumerOf(amountOfChilden, childen);
        return this;
    }

    public Hotels setAmountOfRooms(String rooms) {
        setNumerOf(amountOfRooms, rooms);
        return this;
    }

    public Hotels setAmountOfAdults(String adults) {
        setNumerOf(amountOfAdults, adults);
        return this;
    }

    public Hotels setChildrenAge(String age) {
        setNumerOf(child1Age, age);
        return this;
    }


}