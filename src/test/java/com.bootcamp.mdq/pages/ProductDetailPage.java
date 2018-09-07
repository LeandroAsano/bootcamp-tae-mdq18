package com.bootcamp.mdq.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends WebPage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    public HandleBuyBoxPage addToCart() {
        click(addToCartButton);
        return new HandleBuyBoxPage();
    }
}
