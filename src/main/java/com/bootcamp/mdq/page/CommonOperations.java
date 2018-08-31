package com.bootcamp.mdq.page;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bootcamp.mdq.driver.DriverManager.getDriver;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class CommonOperations {

  protected void navigate(String url) {
    getDriver().get(url);
  }

  protected void click(WebElement element) {
    waiting().until(elementToBeClickable(element)).click();
  }

  protected void type(WebElement element, String text) {
    waiting().until(elementToBeClickable(element)).sendKeys(text);
  }

  protected boolean isVisible(WebElement element) {
    return waiting().until(visibilityOf(element)).isDisplayed();
  }

  protected boolean isEnabled(WebElement element) {
    return waiting().until(elementToBeClickable(element)).isEnabled();
  }

  private WebDriverWait waiting() {
    WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 30);
    webDriverWait.ignoring(NotFoundException.class)
        .ignoring(StaleElementReferenceException.class)
        .pollingEvery(1, SECONDS);
    return webDriverWait;
  }

  protected Select obtainSelector(WebElement element){
      return new Select(element);
  }

  public void setNumerOf(WebElement x, String amount){
    Select selector=obtainSelector(x);
    selector.selectByValue(amount);
  }



}
