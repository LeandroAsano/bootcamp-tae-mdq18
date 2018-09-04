package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 04/09/2018.
 */
public class HotelSellModal extends WebComponent {

    @FindBy(id = "forcedChoiceNoThanks")
    private WebElement noThanksLink;

    public HotelSellModal(WebElement container) {
        super(container);
    }

    public boolean visibleNoThanksLink(){
        return false;
    }
}
