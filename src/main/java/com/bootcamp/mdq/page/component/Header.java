package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.Hotels.Hotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BaseComponent {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelHeaderButton;

    public Header(WebElement container) {
        super(container);
    }

    public Hotels findHotels() {
        click(hotelHeaderButton);
        return new Hotels();
    }


}
