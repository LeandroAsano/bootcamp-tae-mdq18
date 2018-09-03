package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.hotelDetails.HotelDetails;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardHotel extends BaseComponent{

    @FindBy(css = "a.flex-link")
    private WebElement hotelName;

    public CardHotel(WebElement container) {
        super(container);
    }

    public HotelDetails clickHotelName(){
        click(hotelName);

        return new HotelDetails();
    }
}
