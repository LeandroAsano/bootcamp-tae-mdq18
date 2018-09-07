package com.bootcamp.mdq.web.pages.hotels;


import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetail extends WebPage{

    @FindBy(id = "room-and-rates")
    private WebElement roomAndRatesResults;



}
