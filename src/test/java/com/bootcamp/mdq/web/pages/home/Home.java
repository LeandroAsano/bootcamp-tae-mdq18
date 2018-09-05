package com.bootcamp.mdq.web.pages.home;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.Header;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private Header header;

    public Home (){
        header = new Header(headerContainer);
    }

    public Header header(){
        return header;
    }

}
