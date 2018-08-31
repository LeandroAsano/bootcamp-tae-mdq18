package com.bootcamp.mdq.page;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import static com.bootcamp.mdq.driver.DriverManager.getDriver;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

  protected void setDate(WebElement element, Date date) {
    DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
    String checkinDate = dateFormat.format(date);
    type(element, checkinDate);
  }
  protected void selectDropdown(WebElement element, String itemText) {
    waiting().until(visibilityOf(element)).isDisplayed();
    Select dropdown = new Select(element);
    dropdown.selectByVisibleText(itemText);
  }

  private WebDriverWait waiting() {
    WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 30);
    webDriverWait.ignoring(NotFoundException.class)
        .ignoring(StaleElementReferenceException.class)
        .pollingEvery(1, SECONDS);
    return webDriverWait;
  }

}
