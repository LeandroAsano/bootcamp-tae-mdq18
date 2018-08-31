package com.bootcamp.mdq.page;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bootcamp.mdq.driver.DriverManager.getDriver;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class CommonOperations {

  protected void navigate(String url) {
    getDriver().get(url);
  }

  public void click(WebElement element) {
    waiting().until(elementToBeClickable(element)).click();
  }

  public void type(WebElement element, String text) {
    waiting().until(elementToBeClickable(element)).sendKeys(text);
  }

  protected boolean isVisible(WebElement element) {
    return waiting().until(visibilityOf(element)).isDisplayed();
  }

  protected void submit(WebElement element){element.submit();}

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

}
