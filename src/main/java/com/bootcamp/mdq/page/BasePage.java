package com.bootcamp.mdq.page;

import com.bootcamp.mdq.driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends CommonOperations {

  public BasePage() {

    PageFactory.initElements(DriverManager.getDriver(), this);
  }

}
