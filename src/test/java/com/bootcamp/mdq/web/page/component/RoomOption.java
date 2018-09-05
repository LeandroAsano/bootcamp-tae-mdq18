package com.bootcamp.mdq.web.page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.page.ValidationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomOption extends WebComponent {

    @FindBy(css = ".btn-primary.book-button.btn-pwa.btn-action")
    private WebElement reserveButton;

    public RoomOption(WebElement container) {
        super(container);
    }

    public ValidationPage reserveRoom() {
        click(reserveButton);
        return new ValidationPage();
    }
}
