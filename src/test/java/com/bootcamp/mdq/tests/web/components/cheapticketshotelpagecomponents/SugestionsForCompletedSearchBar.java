package com.bootcamp.mdq.tests.web.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SugestionsForCompletedSearchBar extends WebPage {


    @FindBy(css = ".footer .close")
    private WebElement closeModalButton;

    public SugestionsForCompletedSearchBar() {
        super();
    }

    public void closeModal(){
        click(closeModalButton);
        System.out.println();
    }

}
