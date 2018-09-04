package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.component.BaseComponent;
import com.bootcamp.mdq.pages.flights.Flight;
import com.bootcamp.mdq.pages.hotels.Hotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BaseComponent {

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelLink;

    @FindBy(id = "primary-header-flight")
    private WebElement flightLink;

    public Header(WebElement container) {
        super(container);
    }

    public Hotel clickHotel() {
        click(hotelLink);
        return new Hotel();
    }

    public Flight clickFlight() {
        click(flightLink);
        return new Flight();
    }


}
