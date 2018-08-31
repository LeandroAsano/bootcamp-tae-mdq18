package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.flights.Flight;
import com.bootcamp.mdq.page.hotels.Hotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BaseComponent{

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelLink;

    @FindBy(id = "primary-header-flight")
    private WebElement flightLink;

    public Header(WebElement container) {
        super(container);
    }

    public Hotel clickHotel(){
        click(hotelLink);
        return new Hotel();
    }

    public Flight clickFlight(){
        click(flightLink);
        return new Flight();
    }


}
