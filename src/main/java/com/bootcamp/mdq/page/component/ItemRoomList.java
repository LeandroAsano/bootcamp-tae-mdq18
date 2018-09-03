package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.PayBookingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemRoomList extends BaseComponent{

    @FindBy(className = "book-button-wrapper")
    WebElement reserveButton;

    public ItemRoomList(WebElement container) {
        super(container);
    }

    public PayBookingPage clickOnReserve(){
        click(reserveButton);
        return new PayBookingPage();
    }
}

