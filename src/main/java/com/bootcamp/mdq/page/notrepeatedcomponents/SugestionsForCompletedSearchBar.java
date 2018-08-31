package com.bootcamp.mdq.page.notrepeatedcomponents;

import com.bootcamp.mdq.page.BasePage;
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
        System.out.printf("");
    }

}
