package com.bootcamp.mdq.page.hotel;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Hotel extends BasePage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement destinationInput;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkinDate;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkoutDate;

    @FindBy(id = "hotel-rooms-hlp")
    private Select roomsSelect;

    @FindBy(id = "hotel-1-adults-hlp")
    private Select adultsSelect;

    @FindBy(id = "hotel-1-children-hlp")
    private Select childrenSelect;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private Select childrenAgeSelect;

    @FindBy(css = "[data-gcw-submit-text='Search']")
    private WebElement searchBtn;
}
