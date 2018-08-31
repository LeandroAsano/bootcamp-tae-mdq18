package com.bootcamp.mdq.page.searchHotels;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotels extends BasePage {
    @FindBy(id = "hotel-destination-hlp")
    private WebElement searchInput;

    @FindBy(id = "hotel-checkin-hp-hotel")
    private WebElement checkInInput;

    @FindBy(id = "hotel-checkout-hp-hotel")
    private WebElement checkOutInput;

    @FindBy(id = "hotel-1-adults-hp-hotel")
    private WebElement adultsNumberInput;

    @FindBy(id = "hotel-1-children-hp-hotel")
    private WebElement childrenNumberInput;

    @FindBy(id = "hotel-1-age-select-1-hp-hotel")
    private WebElement childOneAge;


    public SearchHotels checkInInput(String date) {
        type(checkInInput,date);
        return this;
    }

    public SearchHotels checkOutInput(String date) {
        type(checkOutInput,date);
        return this;
    }

    public SearchHotels adultsNumberInput(int position) {
        // select position
        return this;
    }

    public SearchHotels childrenNumberInput(int position) {
        // select position
        return this;
    }

    public SearchHotels childOneAge() {
        // select position
        return this;
    }


    public SearchHotels typeLocation(String location) {
        type(searchInput,location);
        return this;
    }

    public SearchHotels typeCheckIn(String date) {
        //clear(checkInInput);
        type(checkInInput,date);
        return this;
    }


}


