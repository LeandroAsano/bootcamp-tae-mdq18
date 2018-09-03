package com.bootcamp.mdq.page.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class SearchBar extends BasePage {

    @FindBy(id="inpHotelNameMirror")
    private WebElement searchBar;


    public SearchBar(){
        click(searchBar);
    }

    public SearchHotelButton search(String criteria){
        type(searchBar,criteria);
        return new SearchHotelButton();
    }

}
