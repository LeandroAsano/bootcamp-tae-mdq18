package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellphonePage extends WebPage {

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(css = "#nav-search > form > div.nav-right > div > input")
    private WebElement searchButton;

    public CellphonePage searchInputType(String message){
        type(searchInput,message);
        return this;
    }

    public IphonePage clickSearchButton(){
        click(searchButton);
        return new IphonePage();
    }
}
