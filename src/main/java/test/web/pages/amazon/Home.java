package test.web.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {
    @FindBy(css = ".nav-search-dropdown .searchSelect")
    private WebElement filterButton;
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;
    @FindBy(id = "nav-search-submit-text")
    private WebElement submitButton;

    public Home selectOption(int index){
        click(filterButton);
        selectOption(index);
       // select(filterButton,"Cell Phones & Accessories");
       
        return this;
    }
    public Home typeSearch(String search){
        type(searchInput,search);
        return this;
    }
    public Results submit(){
        click(submitButton);
        return new Results();
    }

}
