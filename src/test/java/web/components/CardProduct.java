package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.ProductPage;

public class CardProduct extends WebComponent {

    @FindBy(className = "a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal")
    private WebElement searchLink;

    public CardProduct(WebElement container) {
        super(container);
    }

    public ProductPage clickProduct(){
        click(searchLink);
        return new ProductPage();
    }


}
