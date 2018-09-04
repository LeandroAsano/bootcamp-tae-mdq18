package com.bootcamp.mdq.page.web;

import com.bootcamp.mdq.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static com.bootcamp.mdq.waits.Waits.*;

public abstract class WebOperations {

  /**
   * Navigates to the URL.
   *
   * @param url the URL
   */
  protected void goTo(String url) {
    getDriver().getWebDriver().get(url);
  }

  /**
   * Refresh the page.
   */
  protected void refresh() {
    getDriver().getWebDriver().navigate().refresh();
  }

  /**
   * Clicks on the element.
   *
   * @param webElement the {@link WebElement}
   */
  protected void click(WebElement webElement) {
    isClickable(webElement).click();
  }

  /**
   * Types on the element.
   *
   * @param webElement the {@link WebElement}
   * @param text       the text
   */
  protected boolean type(WebElement webElement, String text) {
    isClickable(webElement).sendKeys(text);
    return isTextPresent(webElement, text);
  }

  /**
   * Switchs to new popup tab after a click on the page
   *
   * @param element the {@link WebElement}
   */
  protected void switchNewTabHandle(WebElement element) {

    isVisible(element).click();
    ArrayList<String> tabs = new ArrayList<String> (getDriver().getWebDriver().getWindowHandles());
    getDriver().getWebDriver().switchTo().window(tabs.get(1));

  }

  /**
   * Select an option from a dropdown menu
   *
   * @param element the {@link WebElement}
   * @param itemText the text of the option to be selected
   */
  protected void selectDropdown(WebElement element, String itemText) {
    Select dropdown = new Select(isVisible(element));
    dropdown.selectByVisibleText(itemText);
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

  /**
   * Selects an option by text from an HTML Select.
   *
   * @param webElement the {@link WebElement}
   * @param text       the text to select
   */
  protected void selectByText(WebElement webElement, String text) {
    select(isClickable(webElement)).selectByVisibleText(text);
  }

  /**
   * Check if the element is displayed
   *
   * @param webElement the {@link WebElement}
   * @return true if the element is displayed, otherwise false
   */
  protected boolean isDisplayed(WebElement webElement) {
    return isVisible(webElement).isDisplayed();
  }

  private Select select(WebElement webElement) {
    return new Select(webElement);
  }

}
