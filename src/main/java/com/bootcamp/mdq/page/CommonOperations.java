package com.bootcamp.mdq.page;

import org.openqa.selenium.WebElement;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static com.bootcamp.mdq.waits.Waits.isClickable;
import static com.bootcamp.mdq.waits.Waits.isVisible;

public abstract class CommonOperations {

  /**
   * Navigates back.
   */
  protected void back() {
    getDriver().getWebDriver().navigate().back();
  }

  /**
   * Clicks on the element.
   *
   * @param webElement the {@link WebElement}
   */
  protected void click(WebElement webElement) {
    isClickable(webElement).click();
  }

  protected void clickSearch(WebElement webElement) {
    isVisible(webElement).click();
  }

  /**
   * Gets the text from the web element.
   *
   * @param webElement the {@link WebElement}
   * @return the text
   */
  protected String getText(WebElement webElement) {
    return isVisible(webElement).getText();
  }

}
