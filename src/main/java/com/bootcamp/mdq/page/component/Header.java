package com.bootcamp.mdq.page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BaseComponent{

    @FindBy(css = "site-header-secondary")

    public Header(WebElement container) {
        super(container);
    }
}
