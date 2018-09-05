package com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents.SearchButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class SearchBar extends WebPage {

    @FindBy(id="inpHotelNameMirror")
    private WebElement searchBar;


    public SearchBar(){
        click(searchBar);
    }

    public SearchButton search(String criteria){
        type(searchBar,criteria);
        return new SearchButton();
    }

}
