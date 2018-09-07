package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RoomCard extends WebComponent {

    @FindBy(css = ".rate-plan")
    private List<WebElement> ratePlans;

    public RoomCard(WebElement container) {
        super(container);
    }


}
