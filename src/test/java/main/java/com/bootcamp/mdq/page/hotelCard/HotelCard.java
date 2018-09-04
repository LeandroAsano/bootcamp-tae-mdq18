package com.bootcamp.mdq.page.hotelCard;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends BasePage {

    @FindBy(className = "btn-primary.book-button.btn-pwa.btn-action" )
    private WebElement reserveButton;

    public HotelCard reserveHotel(){
        click(reserveButton);
        return this;
    }
}
