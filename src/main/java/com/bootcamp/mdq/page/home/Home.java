package com.bootcamp.mdq.page.home;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

    @FindBy (id = "hotel-destination-hlp")
    private WebElement goinTofield;

    @FindBy (id= "hotel-checkin-hlp")
    private WebElement checkInDate;

    @FindBy (id="hotel-checkout-hlp")
    private WebElement checkOutDate;

    @FindBy (id="hotel-1-adults-hlp")
    private WebElement amountOfAdults;

    @FindBy (id= "hotel-1-children-hlp")
    private WebElement amountOfChilden;

    @FindBy (css = "[data-gcw-change-submit-text='Search']")
    private WebElement searchButton;




}
