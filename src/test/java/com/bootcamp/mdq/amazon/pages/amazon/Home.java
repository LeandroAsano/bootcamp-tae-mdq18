package com.bootcamp.mdq.amazon.pages.amazon;

import com.bootcamp.mdq.amazon.pages.components.SearchNavBar;
import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(id = "navbar")
    private WebElement searchNavBar;

    public SearchNavBar searchNavBar(){
        return new SearchNavBar(searchNavBar);
    }

}
