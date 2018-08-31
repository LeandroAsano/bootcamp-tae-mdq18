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


    public WebElement searchInput() {
        return searchInput;
    }

    public WebElement checkInInput() {
        return checkInInput;
    }

    public WebElement checkOutInput() {
        return checkOutInput;
    }

    public WebElement adultsNumberInput() {
        return adultsNumberInput;
    }

    public WebElement childrenNumberInput() {
        return childrenNumberInput;
    }

    public WebElement childOneAge() {
        return childOneAge;
    }
}


