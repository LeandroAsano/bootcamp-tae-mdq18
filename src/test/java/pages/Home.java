package pages;

import com.bootcamp.mdq.page.web.WebPage;
import components.HeaderBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private HeaderBar header;

    public Home (){
        header = new HeaderBar(headerContainer);
        goTo("https://cheaptickets.com");
    }
    public HeaderBar header(){
        return header;
    }

}
