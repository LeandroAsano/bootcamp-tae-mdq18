package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.hotels.HotelDetail;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends BaseComponent {

    @FindBy(css = "a.flex-link")
    private WebElement hotelNameLink;

    @FindBy(tagName = "h3")
    private WebElement hotelNameText;

    public HotelCard(WebElement container) {
        super(container);
    }

    public HotelDetail clickHotelName(){
        click(hotelNameLink);
        return new HotelDetail();
    }

    public String getHotelNameText(){
        return getText(hotelNameText);
    }
}
