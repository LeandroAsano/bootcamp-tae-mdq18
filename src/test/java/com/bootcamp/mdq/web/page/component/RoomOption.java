package com.bootcamp.mdq.web.page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.page.ValidationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomOption extends WebComponent {

    @FindBy(css = ".btn-primary.book-button.btn-pwa.btn-action")
    private WebElement reserveButton;

    @FindBy(id = "deposit-pay-now-button")
    private WebElement payNowButton;

    public RoomOption(WebElement container) {
        super(container);
    }

    public RoomOption reserveRoom() {
        click(reserveButton);
        return this;
    }

    public ValidationPage payNow() {
        click(payNowButton);
        return new ValidationPage();
    }
}