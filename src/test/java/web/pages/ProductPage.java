package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends WebPage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;

    public ProductPage(){
    }

    public CartPage clickAddToCart(){
        click(addToCart);
        return new CartPage();
    }
}
