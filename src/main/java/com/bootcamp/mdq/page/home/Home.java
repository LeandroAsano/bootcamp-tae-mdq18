package com.bootcamp.mdq.page.home;

import com.bootcamp.mdq.page.BasePage;

import com.bootcamp.mdq.page.component.HeaderBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private HeaderBar header;

    public Home (){
        header = new HeaderBar(headerContainer);
        navigate("https://cheaptickets.com");
    }
    public HeaderBar header(){
        return header;
    }

}