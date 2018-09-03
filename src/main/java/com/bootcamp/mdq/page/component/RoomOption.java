package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.ValidationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomOption extends BaseComponent {

    @FindBy(className = "btn-sub-action.book-button.btn-pwa")
    private WebElement reserveButton;

    public RoomOption(WebElement container) {
        super(container);
    }

    public ValidationPage reserveRoom() {
        click(reserveButton);
        return new ValidationPage();
    }
}
