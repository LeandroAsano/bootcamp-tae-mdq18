package com.bootcamp.mdq.page.Hotels;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelsResults extends BasePage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement filterHotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement applyFilterButton;

    public SearchHotelsResults filterHotelByName(String hotelName) {
        type(filterHotelNameInput, hotelName);
        return this;
    }

    public SearchHotelsResults applyNameFilter() {
        click(applyFilterButton);
        return this;
    }

}
