package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.components.HeaderBar;

public class ProductAddedPage extends WebPage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private HeaderBar header;

}
