package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends WebPage {

    @FindBy(css = "#activeCartViewForm > div.sc-list-body.sc-java-remote-feature > div > div.sc-list-item-content > div > div.a-column.a-span8 > div > div > div.a-fixed-left-grid-col.a-col-right > div > span.a-size-small.sc-action-delete > span > input[type=\"submit\"]")
    private WebElement deleteLink;

    @FindBy(className = "a-row sc-cart-header")
    private static WebElement deleteConfirmation;

    public static String getDeleteConfirmation(){
        return deleteConfirmation.getText();
    }

    public ShoppingCart deleteItem(){
        click(deleteLink);
        return this;
    }
}
