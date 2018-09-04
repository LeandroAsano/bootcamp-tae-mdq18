package com.bootcamp.mdq.pages.home;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.pages.components.Header;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private Header header;

    public Home (){
        header = new Header(headerContainer);
        navigate("https://cheaptickets.com");
    }

    public Header header(){
        return header;
    }

}
