package com.bootcamp.mdq.page.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class WebComponent extends WebOperations {

  public WebComponent(WebElement container) {
    initElements(new DefaultElementLocatorFactory(container), this);
  }

}
