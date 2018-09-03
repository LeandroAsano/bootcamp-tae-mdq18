package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.pages.HotelPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelCard extends BaseComponent {

    @FindBy (css = "article h3")
    private WebElement hotelName;

    @FindBy (css = "a.flex-link")
    private WebElement hotelLink;

    public HotelCard(WebElement container) {
        super(container);
    }

    public HotelPage clickOnHotelName(){
        return new HotelPage();
    }

    public String getHotelName(){
        return hotelName.getText();
    }

    public HotelPage clickOn(){
        return new HotelPage();
    }


}
