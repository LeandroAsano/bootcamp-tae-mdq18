package com.bootcamp.mdq.web.page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.page.ValidationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentOptions extends WebComponent {

    @FindBy(id = "deposit-pay-now-button")
    private WebElement payNowButton;

    public PaymentOptions(WebElement container) {
        super(container);
    }

    public ValidationPage payNow() {
        click(payNowButton);
        return new ValidationPage();
    }

}
