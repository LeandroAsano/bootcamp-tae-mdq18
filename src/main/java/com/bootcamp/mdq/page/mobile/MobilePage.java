package com.bootcamp.mdq.page.mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class MobilePage extends MobileOperations {

  public MobilePage() {
    WebDriver webDriver = getDriver().getWebDriver();
    initElements(new AppiumFieldDecorator(webDriver), this);
  }

}
