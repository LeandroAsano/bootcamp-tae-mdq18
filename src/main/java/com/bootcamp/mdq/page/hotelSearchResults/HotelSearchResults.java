package com.bootcamp.mdq.page.hotelSearchResults;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelSearchResults {
    @FindBy(xpath ="hotelResultTitle > h1")
    private WebElement hotelResultTitle;//hotelResultTitle.getText();?
    private String text;
    public HotelSearchResults(){
        text = hotelResultTitle.getText();
    }

}
