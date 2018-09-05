package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.isVisible;

/**
 * Created by Matias on 04/09/2018.
 */
public class HotelSellModal extends WebComponent {

    @FindBy(id = "forcedChoiceNoThanks")
    private WebElement noThanksLink;

    public HotelSellModal(WebElement container) {
        super(container);
    }

    public boolean isNoThanksLinkVisible(){
        return isVisible(noThanksLink).isDisplayed();
    }
}
