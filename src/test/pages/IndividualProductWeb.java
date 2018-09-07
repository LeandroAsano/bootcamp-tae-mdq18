package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 7/9/2018.
 */
public class IndividualProductWeb extends AmazonHomePage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;


    public void addToCartClick(){
        click(addToCartButton);
    }
}
