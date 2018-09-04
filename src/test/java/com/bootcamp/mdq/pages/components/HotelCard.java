package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.component.BaseComponent;
import com.bootcamp.mdq.pages.hotels.HotelDetail;
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
