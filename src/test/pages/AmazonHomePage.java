package pages;

import com.bootcamp.mdq.page.web.WebPage;
import components.FilterElements;
import components.FilterElements2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 7/9/2018.
 */
public class AmazonHomePage extends WebPage {

    @FindBy(css = ".nav-search-scope.nav-sprite")
    public WebElement dropDownCategoriesButtonDisplay;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(className = "nav-input")
    public WebElement searchButton;


    public FilterElements clickDropDownCategories(){
        click(dropDownCategoriesButtonDisplay);
        return new FilterElements();
    }

    public AmazonHomePage typeOnSearchBar(String criteria){
        type(searchBar,criteria);
        return this;
    }

    public FilterElements2 search(){
        click(searchButton);
        return new FilterElements2();
    }
}
