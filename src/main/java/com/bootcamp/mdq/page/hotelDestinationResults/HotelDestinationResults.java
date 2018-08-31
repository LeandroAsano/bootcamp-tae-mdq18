package com.bootcamp.mdq.page.hotelDestinationResults;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.hotelSearchResults.HotelNameResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDestinationResults extends BasePage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement searchInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement goButton;


    public HotelDestinationResults searchInput(String hotel) {
        type(searchInput,hotel);
        return this;
    }

    public HotelNameResults goButton() {
        return new HotelNameResults();
    }
}
