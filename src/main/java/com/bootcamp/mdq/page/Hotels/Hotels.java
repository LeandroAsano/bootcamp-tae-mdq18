package com.bootcamp.mdq.page.Hotels;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Hotels extends BasePage {

    @FindBys({
            @FindBy(className = "clear-btn-input.gcw-storeable.text gcw-destination.gcw-required"),
            @FindBy(css = "[data-lob = 'HOTELS']")
    })
    private WebElement destinationInput;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkInDate;

    @FindBy(id = "hotel-checkout-hlp")
    private WebElement checkOutDate;

}
