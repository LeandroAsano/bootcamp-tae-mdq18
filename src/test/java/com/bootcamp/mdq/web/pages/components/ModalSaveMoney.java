package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.isVisible;

public class ModalSaveMoney extends WebPage {

    @FindBy (id="xsellAddHotelNow")
    private WebElement addAhotel;

    @FindBy (id="forcedChoiceNoThanks")
    private WebElement noThanksLink;


    public ModalSaveMoney() {
        super();
    }

    public boolean isVisibleChooseNoButton(){
        isVisible(noThanksLink);
        return noThanksLink.isDisplayed();
    }

}
