package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.component.BaseComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 04/09/2018.
 */
public class HotelSellModal extends BaseComponent {

    @FindBy(id = "forcedChoiceNoThanks")
    private WebElement noThanksLink;

    public HotelSellModal(WebElement container) {
        super(container);
    }

    public boolean visibleNoThanksLink(){
        return isVisible(noThanksLink);
    }
}