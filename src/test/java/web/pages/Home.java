package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import web.components.HeaderBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private HeaderBar header;

    public Home (){
        goTo("https://cheaptickets.com");
        header = new HeaderBar(headerContainer);
    }

    public HeaderBar header(){
        return header;
    }

}
