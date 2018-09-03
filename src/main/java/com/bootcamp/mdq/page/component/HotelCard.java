package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.Reservation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends BaseComponent {

    @FindBy(className = "hotelTitle")
    private WebElement hotelName;

    public HotelCard(WebElement container) {
        super(container);
    }

    public Reservation selectHotel() {
        switchNewTabHandle(hotelName);
        return new Reservation();
    }

}
