package test.web.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddedToCart extends WebPage {
    @FindBy(id = "hlb-view-cart-announce")
    private WebElement goToCartButton;

    public Cart goToCart(){
        click(goToCartButton);
        return new Cart();
    }
}
