package com.bootcamp.mdq.page.bookPage;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage {
    @FindBy(className ="section-header-main")
    private WebElement title;

    @FindBy(className = "flex-content")
    private static WebElement hoteles;

    public static int isEnabled(){
        if(hoteles.isDisplayed())
            return 1;
        else
            return 0;
    }


}
