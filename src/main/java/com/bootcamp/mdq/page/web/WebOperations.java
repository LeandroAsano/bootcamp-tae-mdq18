package com.bootcamp.mdq.page.web;

import com.bootcamp.mdq.page.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static com.bootcamp.mdq.waits.Waits.isClickable;
import static com.bootcamp.mdq.waits.Waits.isTextPresent;

public abstract class WebOperations extends CommonOperations {

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
   * Selects an option by text from an HTML Select.
   *
   * @param webElement the {@link WebElement}
   * @param text       the text to select
   */
  protected void selectByText(WebElement webElement, String text) {
    select(isClickable(webElement)).selectByVisibleText(text);
  }

  private Select select(WebElement webElement) {
    return new Select(webElement);
  }

  public void changeToLastTab(){
    Set<String> tab_handles = getDriver().getWebDriver().getWindowHandles();
    int number_of_tabs = tab_handles.size();
    int new_tab_index = number_of_tabs- 1;
    getDriver().getWebDriver().switchTo().window(tab_handles.toArray()[new_tab_index].toString());
  }



}
