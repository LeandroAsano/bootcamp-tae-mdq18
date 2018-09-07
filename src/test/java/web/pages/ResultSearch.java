package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.components.ListProduct;

public class ResultSearch extends WebPage {

    @FindBy(id = "atfResults")
    private WebElement listProduct;

    public ListProduct getResultList(){

        return new ListProduct(listProduct);
    }
}
