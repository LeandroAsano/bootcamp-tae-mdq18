package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotels extends BasePage {

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

    // Deberia tener el selector directamente como atributo o seguir trabajando con el webElement?
    // Sino ttendria que llamar al DriverManage...
    // private  Select amountOfRooms;

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

    public Hotels() {
        super();
    }

    public void typeHotelName(String name) {
        type(searchInput, name);
    }

    public void clickOnBanner() {
        click(banner);
    }


    public void setCheckInDate(String date) {
        click(checkInDate);
        type(checkInDate, date);
    }

    public void setCheckOutDate(String date) {
        click(checkOutDate);
        type(checkOutDate, date);
    }

    public SearchResults clickOnSearch() {
        click(searchButton);
        return new SearchResults();
    }

    public void setAmountOfChilden(String childen) {
        setNumerOf(amountOfChilden, childen);
    }

    public void setAmountOfRooms(String rooms) {
        setNumerOf(amountOfRooms, rooms);
    }

    public void setAmountOfAdults(String adults) {
        setNumerOf(amountOfAdults, adults);
    }

    public void setChildrenAge(String age) {
        setNumerOf(child1Age, age);
    }


}
