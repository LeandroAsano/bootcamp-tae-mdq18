package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SugestionsForCompletedSearchBar extends BasePage {


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
