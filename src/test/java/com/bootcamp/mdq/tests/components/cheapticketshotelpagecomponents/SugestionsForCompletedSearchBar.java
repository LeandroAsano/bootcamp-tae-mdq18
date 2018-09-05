package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.js.Javascript.click;

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
