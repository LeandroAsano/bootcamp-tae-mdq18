package com.bootcamp.mdq.pages.components;


import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.pages.flights.Flights;
import com.bootcamp.mdq.pages.hotel.Hotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavegationBar extends WebPage {

    @FindBy (id ="primary-header-hotel")
    private WebElement hotelLink;

    @FindBy (id= "primary-header-flight")
    private  WebElement flightLink;

    public NavegationBar() {
    }

    public Hotels clickOnHotel(){
        click(hotelLink);
        return new Hotels();
    }

    public Flights clickOnFligths(){
        flightLink.click();
        return new Flights();
    }
}
