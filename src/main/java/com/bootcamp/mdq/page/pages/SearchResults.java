package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults extends BasePage {

    private NavegationBar navigationBar;

    @FindBy(className = "hotel.listing")
    private List<WebElement> hotelsList;

    public SearchResults(NavegationBar navigationBar) {
        navigationBar=new NavegationBar();
    }

}
