package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavegationBar extends BasePage {

    @FindBy (id ="primary-header-hotel")
    private WebElement hotelLink;

    @FindBy (id= "primary-header-flight")
    private  WebElement flightLink;

    public NavegationBar() {
    }

    public Hotels clickOnHotel(){
        click(hotelLink);
        return new Hotels();
    }

    public Object clickOnFligths(){
        flightLink.click();
        return new Object();
    }
}
