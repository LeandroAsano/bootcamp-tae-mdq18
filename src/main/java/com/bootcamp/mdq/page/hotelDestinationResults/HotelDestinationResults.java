package com.bootcamp.mdq.page.hotelDestinationResults;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDestinationResults extends BasePage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement searchInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement goButton;


    public WebElement searchInput() {
        return searchInput;
    }

    public WebElement goButton() {
        return goButton;
    }
}
