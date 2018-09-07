package test.web.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends WebPage {
    @FindBy(className = "a-size-medium.sc-product-title")
    private WebElement title;
    @FindBy(className = "a-size-small sc-action-delete")
    private WebElement delete;
    @FindBy(className = "a-row sc-cart-header")
    private WebElement header;

    public String title(){
        return title.getText();
    }
    public Cart delete(){
        click(delete);
        return this;
    }
    public String header(){
        return header.getText();
    }
}
