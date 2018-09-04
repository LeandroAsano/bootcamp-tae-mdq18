package com.bootcamp.mdq.page.web;

import com.bootcamp.mdq.driver.Driver;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class WebPage extends WebOperations {

  public WebPage() {
    Driver driver = getDriver();
    initElements(driver.getWebDriver(), this);
  }

}
