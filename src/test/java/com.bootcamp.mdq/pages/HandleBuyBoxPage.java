package com.bootcamp.mdq.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandleBuyBoxPage extends WebPage {

    @FindBy(id = "hlb-view-cart-announce")
    private WebElement viewCartButton;

    public Cart viewCart() {
        click(viewCartButton);
        return new Cart();
    }
}
