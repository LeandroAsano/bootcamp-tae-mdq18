package com.bootcamp.webdriver.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class BaseComponent {

  protected WebDriver driver;

  public BaseComponent(WebDriver driver, WebElement container) {
    this.driver = driver;
    PageFactory.initElements(new DefaultElementLocatorFactory(container), this);
  }

}
