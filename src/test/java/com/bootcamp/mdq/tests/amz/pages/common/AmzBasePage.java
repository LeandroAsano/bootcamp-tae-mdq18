package com.bootcamp.mdq.tests.amz.pages.common;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmzBasePage extends WebPage {

  @FindBy(id = "navbar")
  private WebElement navBarContainer;

  private NavBar navBar;

  public AmzBasePage() {
    super();
    this.navBar = new NavBar(navBarContainer);
  }

  public NavBar navBar() {
    return navBar;
  }

}
