package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphoneCard extends WebPage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    public CartPage clickAddToCartButton(){
        click(addToCartButton);
        return new CartPage();
    }
}
