package com.bootcamp.mdq.pages.components;



import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.PayBookingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.isVisible;

public class ItemRoomList extends WebComponent {

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

