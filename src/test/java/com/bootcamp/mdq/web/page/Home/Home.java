package com.bootcamp.mdq.web.page.Home;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.page.component.Header;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(id = "header-container")
    private WebElement headerContainer;

    private Header header;

    public Home() {
        this.header = new Header(headerContainer);
    }

    public Header getHeader() {
        return this.header;
    }

}
