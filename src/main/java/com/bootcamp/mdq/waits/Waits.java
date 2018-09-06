package com.bootcamp.mdq.waits;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Waits supports the explicit waiting operation, using {@link WebDriverWait} and {@link ExpectedConditions}.
 */
public final class Waits {

  /**
   * Verifies if an element is clickable before clicking on it.
   *
   * @param webElement the {@link WebElement}
   * @return the {@link WebElement}
   */
  public static WebElement isClickable(WebElement webElement) {
    return waiting().until(elementToBeClickable(webElement));
  }

  /**
   * Verifies if an element is visible before interacting with it.
   *
   * @param webElement the {@link WebElement}
   * @return the {@link WebElement}
   */
  public static WebElement isVisible(WebElement webElement) {
    return waiting().until(visibilityOf(webElement));
  }

  public static List<WebElement> areVisible(List<WebElement> elements) {
    return waiting().until(visibilityOfAllElements(elements));
  }

  public static void isNotVisible(WebElement webElement) {
    waiting().until(invisibilityOf(webElement));
  }

  /**
   * Verifies if the expected text is present in the element.
   *
   * @param webElement the {@link WebElement}
   * @param text       the expected text
   * @return {@code TRUE} if the text is present
   */
  public static boolean isTextPresent(WebElement webElement, String text) {
    return waiting().until(or(textToBePresentInElement(webElement, text), textToBePresentInElementValue(webElement, text)));
  }

  public static void pageReady(){
    getDriver().getWebDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
  }

  private static WebDriverWait waiting() {
    return getDriver().getWebDriverWait();
  }

  public static void jsWait() {
    new WebDriverWait(getDriver().getWebDriver(), 30).until((ExpectedCondition<Boolean>) wd ->
            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
  }

}
