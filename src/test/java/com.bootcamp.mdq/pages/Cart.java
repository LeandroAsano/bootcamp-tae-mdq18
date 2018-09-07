package com.bootcamp.mdq.pages;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.pages.components.CartItemCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class Cart extends WebPage {

    @FindBy(css = ".a-size-medium.sc-product-title.a-text-bold")
    private List<WebElement> cartItemsDescription;

    @FindBy(css = "a-row sc-list-item sc-list-item-border sc-java-remote-feature")
    private List<WebElement> cartItems;

    public CartItemCard getItemCardByDescription(String descriptionText) {
        for (WebElement cartItem : cartItemsDescription) {
            if (getText(cartItem).equals(descriptionText)) {
                return new CartItemCard(cartItem);
            }
        }
        return null;
    }

}
