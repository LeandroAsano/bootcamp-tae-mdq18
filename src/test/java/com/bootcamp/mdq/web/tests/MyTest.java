package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.bootcamp.mdq.driver.Drivers.getDriver;

public class MyTest extends BaseTestSuite {

  @Test
  public void myTest() {

    WebDriver webDriver = getDriver().getWebDriver();
  }
}
