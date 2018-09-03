package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.hotel.Hotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderBar extends BasePage {

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelLink;

   /* public Header(WebElement container) {
        super(container);
    }*/

    public Hotel clickHotel() {
        click(hotelLink);
        return new Hotel();
    }
}