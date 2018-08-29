package com.bootcamp.webdriver.pages.results;

import com.bootcamp.webdriver.pages.BasePage;
import com.bootcamp.webdriver.pages.components.TopBar;
import org.openqa.selenium.WebDriver;

public class Results extends BasePage {

  private TopBar topBar;

  public Results(WebDriver driver) {
    super(driver);
    topBar = new TopBar(driver);
  }

  public TopBar topBar() {
    return topBar;
  }
}
