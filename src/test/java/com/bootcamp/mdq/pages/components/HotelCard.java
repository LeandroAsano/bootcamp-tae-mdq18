package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.component.BaseComponent;
import com.bootcamp.mdq.pages.HotelPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HotelCard extends BaseComponent {

    @FindBy(css = "article h3")
    private WebElement hotelName;

    @FindBy(css = "a.flex-link")
    private WebElement hotelLink;

    public HotelCard(WebElement container) {
        super(container);
    }

    public HotelPage clickOnHotelName() {
        click(hotelLink);
        return new HotelPage();
    }

    public String getHotelName() {
        return getText(hotelName);
    }




}
