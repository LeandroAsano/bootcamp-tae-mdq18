package com.bootcamp.mdq.pages.components;



import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.hotel.PayBookingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemRoomList extends WebComponent {

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

