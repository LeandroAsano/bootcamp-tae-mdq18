package com.bootcamp.mdq.amazon.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddedItem extends WebPage {

    @FindBy(id = "hlb-view-cart-announce")
    private WebElement openCartButton;

    public Cart openCartButton(){
        click(openCartButton);
        return new Cart();
    }

}
