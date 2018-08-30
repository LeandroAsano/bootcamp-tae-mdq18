package com.bootcamp.mdq.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavegationBar extends BasePage{

    @FindBy (id ="primary-header-hotel")
    private WebElement hotelLink;

    @FindBy (id= "primary-header-flight")
    private  WebElement flightLink;

    public NavegationBar() {
    }
}
