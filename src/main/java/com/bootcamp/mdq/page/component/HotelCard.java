package com.bootcamp.mdq.page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends BaseComponent {

    @FindBy(className = "hotel-info")
    private WebElement hotelName;
    
}
