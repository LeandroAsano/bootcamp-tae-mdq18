package com.bootcamp.mdq.pages.components;


import com.bootcamp.mdq.page.component.BaseComponent;
import com.bootcamp.mdq.pages.PayBookingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemRoomList extends BaseComponent {

    @FindBy(className = "book-button-wrapper")
    WebElement reserveButton;

    public ItemRoomList(WebElement container) {
        super(container);
    }

    public PayBookingPage clickOnReserve(){
        isVisible(reserveButton);
        click(reserveButton);
        return new PayBookingPage();
    }
}

