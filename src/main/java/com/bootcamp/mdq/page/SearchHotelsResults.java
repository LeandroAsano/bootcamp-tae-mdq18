package com.bootcamp.mdq.page;

import com.bootcamp.mdq.page.component.HotelCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchHotelsResults extends BasePage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement filterHotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement applyFilterButton;

    @FindBy(className = "section-header-main")
    private WebElement resultsNumber;

    @FindBy(css = ".hotel.listing.col")
    private List<WebElement> resultsContainer;

    public SearchHotelsResults filterHotelByName(String hotelName) {
        type(filterHotelNameInput, hotelName);
        return this;
    }

    public SearchHotelsResults applyNameFilter() {
        click(applyFilterButton);
        return this;
    }

    public List<WebElement> getResults() {
        return resultsContainer;
    }

}
