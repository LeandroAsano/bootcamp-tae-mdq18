package com.bootcamp.mdq.page.searchPage;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.hotelResultsPage.HotelResultsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage extends BasePage {
    @FindBy(id = "hotel-destination-hlp")
    private WebElement searchInput;

    @FindBy(id = "hotel-checkin-hp-hotel")
    private WebElement checkInInput;

    @FindBy(id = "hotel-checkout-hp-hotel")
    private WebElement checkOutInput;

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement adultsNumberInput;

    @FindBy(id = "hotel-1-children-hlp")
    private WebElement childrenNumberInput;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private WebElement childAge;

    @FindBy(css = "[data-gcw-change-submit-text='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@aria-label='Close']")
    private WebElement closeButton ;

    public SearchHotelPage(){}

    public SearchHotelPage closeSearchInput(){
        click(closeButton);
        return this ;
    }

    public SearchHotelPage checkInInput(String date) {
        type(checkInInput,date);
        return this;
    }

    public SearchHotelPage checkOutInput(String date) {
        type(checkOutInput,date);
        return this;
    }

    public SearchHotelPage adultsNumberInput(int index) {
        select(adultsNumberInput,index-1);
        return this;
    }

    public SearchHotelPage childrenNumberInput(int index) {
        select(childrenNumberInput,index);
        return this;
    }

    public SearchHotelPage childAge(int index) {
        select(childAge,index+1);
        return this;
    }
    public SearchHotelPage typeLocation(String location) {
        type(searchInput,location);
        return this;
    }

    public SearchHotelPage typeCheckIn(String date) {
        //clear(checkInInput);
        type(checkInInput,date);
        return this;
    }

    public HotelResultsPage clickSearchButton(){
        click(searchButton);
        return new HotelResultsPage();
    }



}


