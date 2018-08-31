package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.Reservation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends BaseComponent {

    @FindBy(css = "[hotel-name = Faena Hotel Miami Beach]")
    private WebElement hotelResult;

    public HotelCard(WebElement container) {
        super(container);
    }

    public Reservation selectHotel() {
        switchNewTabHandle(hotelResult);
        return new Reservation();
    }

}
