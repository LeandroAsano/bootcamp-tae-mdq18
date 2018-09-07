package com.bootcamp.mdq.amazon.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends WebPage {

    @FindBy(css = "[value=\"Delete\"]")
    private WebElement deleteFromCart;

    @FindBy(css = ".a-size-medium.sc-product-title.a-text-bold")
    private WebElement itemTitle;

    @FindBy(css = ".a-row.sc-cart-header")
    private WebElement cartRowEmpty;

    public String getItemText(){
        return getText(itemTitle.findElement(By.cssSelector(".a-size-medium.sc-product-title.a-text-bold")));
    }

    public Cart deleteItemFromCart(){
        click(deleteFromCart);
        return this;
    }

    public String getCartRowEmpty(){
        return getText(cartRowEmpty.findElement(By.tagName("h1")));
    }
}
