package com.bootcamp.mdq.page.Home;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.component.Header;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

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
