package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public abstract class BaseComponent extends CommonOperations {

  public BaseComponent(WebElement container) {
    PageFactory.initElements(new DefaultElementLocatorFactory(container), this);
  }

}
