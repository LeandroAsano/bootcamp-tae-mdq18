package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.Cart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartItemCard extends WebComponent {

    @FindBy(css = ".a-size-medium.sc-product-title.a-text-bold")
    private WebElement cartItemDescription;

    @FindBy(xpath = "//input[contains(@value, \"Delete\")]")
    private WebElement deleteOptionButton;

    public CartItemCard(WebElement container) {
        super(container);
    }

    public String getCartItemDescription() {
        return getText(cartItemDescription);
    }

    public Cart deleteItem() {
        click(deleteOptionButton);
        return new Cart();
    }
}
