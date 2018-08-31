package com.bootcamp.mdq.page.home;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.searchHotels.SearchHotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {
    @FindBy(id ="all-in-hotel-header-link")
    private WebElement hotelHeaderLink;

    public SearchHotels hotelHeaderLink(){
        click(hotelHeaderLink);
        return new SearchHotels();
    }




}
