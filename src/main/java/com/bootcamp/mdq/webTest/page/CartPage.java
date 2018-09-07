package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends WebPage {

    @FindBy(id = "nav-cart")
    private WebElement cartButton ;

    @FindBy(className = "a-size-medium a-text-bold")
    private static WebElement confirmationText ;

    public ShoppingCart clickCartButton(){
        click(cartButton);
        return new ShoppingCart();
    }

    public static String getConfirmationText(){
        return confirmationText.getText();
    }
}
