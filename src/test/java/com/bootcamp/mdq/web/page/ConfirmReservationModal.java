package com.bootcamp.mdq.web.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmReservationModal extends WebPage {

    @FindBy(id = "deposit-pay-now-button")
    private WebElement payNowButton;

    public ValidationPage payNow() {
        click(payNowButton);
        return new ValidationPage();
    }
}
