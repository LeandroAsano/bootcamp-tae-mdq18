package com.bootcamp.mdq.amazon.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ItemDetails extends WebPage {

    @CacheLookup
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    public AddedItem addToCart(){
        click(addToCartButton);
        return new AddedItem();
    }
}
