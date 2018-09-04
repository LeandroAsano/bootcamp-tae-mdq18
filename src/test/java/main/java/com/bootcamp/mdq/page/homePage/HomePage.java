package com.bootcamp.mdq.page.homePage;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.flight.searchFlightPage.SearchFlightPage;
import com.bootcamp.mdq.page.searchPage.SearchHotelPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id ="all-in-hotel-header-link")
    private WebElement hotelHeaderLink;

    @FindBy(id = "primary-header-flight")
    private WebElement flightHeaderLink;

    public SearchHotelPage hotelHeaderLink(){
        click(hotelHeaderLink);
        return new SearchHotelPage();
    }

    public SearchFlightPage flightHeaderLink(){
        click(flightHeaderLink);
        return new SearchFlightPage();
    }




}
