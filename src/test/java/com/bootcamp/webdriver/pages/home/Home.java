package com.bootcamp.webdriver.pages.home;

import com.bootcamp.webdriver.pages.BasePage;
import com.bootcamp.webdriver.pages.components.TopBar;
import org.openqa.selenium.WebDriver;

public class Home extends BasePage {

  private TopBar topBar;

  public Home(WebDriver driver) {
    super(driver);
    topBar = new TopBar(driver);
  }

  public TopBar topBar() {
    return topBar;
  }
}
