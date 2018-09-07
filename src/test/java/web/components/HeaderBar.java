package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.CartPage;
import web.pages.ResultSearch;


public class HeaderBar extends WebComponent {

    @FindBy(id = "searchDropdownBox")
    private WebElement searchDropdown;

    @FindBy(    = "search-alias=mobile")
    private WebElement dropdownOptionCell;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement inputBar;

    @FindBy(id = "nav-search-submit-text")
    private WebElement searchBtn;

    @FindBy(id = "nav-cart")
    private WebElement cartBtn;


    public HeaderBar(WebElement container) {
        super(container);
    }

    public HeaderBar clickDropdown(){
        click(searchDropdown);
        return this;
    }

    public HeaderBar selectDropdown(){
        click(dropdownOptionCell);
        return this;
    }

    public HeaderBar searchingProduct(String product){
        type(inputBar, product);
        return this;
    }

    public ResultSearch search(){
        click(searchBtn);
        return new ResultSearch;
    }

    public CartPage clickCart(){
        click(cartBtn);
        return new CartPage;
    }
}