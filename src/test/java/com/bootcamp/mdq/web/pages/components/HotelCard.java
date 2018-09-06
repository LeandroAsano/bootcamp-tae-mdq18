package com.bootcamp.mdq.web.pages.components;


import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.pages.hotel.HotelPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HotelCard extends WebComponent {

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
