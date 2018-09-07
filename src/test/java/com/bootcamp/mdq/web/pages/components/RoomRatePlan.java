package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.pages.hotels.Booking;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomRatePlan extends WebComponent {

    @FindBy(css = "[data-automation=\"bookButton\"]")
    private WebElement bookButton;

    public RoomRatePlan(WebElement container) {
        super(container);
    }

    public Booking book(){
        click(bookButton);
        return new Booking();
    }
}
