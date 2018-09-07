package com.bootcamp.mdq.pages;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.pages.components.NavigationBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHome extends WebPage {

    @FindBy(id = "navbar")
    private WebElement navBarContainer;

    private NavigationBar navBar;

    public AmazonHome () {
        this.navBar = new NavigationBar(navBarContainer);
    }

    public NavigationBar getNavBar() {
        return this.navBar;
    }
}
