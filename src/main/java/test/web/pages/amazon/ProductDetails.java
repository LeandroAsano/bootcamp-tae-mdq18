package test.web.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends WebPage {
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;
    @FindBy(id="productTitle")
    private WebElement productTitle;

    public AddedToCart addToCart(){
        click(addToCart);
        return new AddedToCart();
    }
    public String getTitle(){
        return productTitle.getText();
    }

}
