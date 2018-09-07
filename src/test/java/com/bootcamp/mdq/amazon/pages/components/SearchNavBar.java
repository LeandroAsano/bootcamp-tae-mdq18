package com.bootcamp.mdq.amazon.pages.components;

import com.bootcamp.mdq.amazon.pages.amazon.Results;
import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchNavBar extends WebComponent {

    @FindBy(id = "searchDropdownBox")
    private WebElement searchDropDown;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(css = "[value=\"Go\"]")
    private WebElement searchGoButton;

    public SearchNavBar(WebElement container) {
        super(container);
    }

    public SearchNavBar selectFilter(String filter){

        selectByText(searchDropDown,filter);
        return this;
    }

    public SearchNavBar searchText(String text){
        type(searchTextBox,text);
        return this;
    }

    public Results searchGo(){
        click(searchGoButton);
        return new Results();
    }


}
