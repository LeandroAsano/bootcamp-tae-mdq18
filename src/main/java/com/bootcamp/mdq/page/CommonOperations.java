package com.bootcamp.mdq.page;

import com.bootcamp.mdq.driver.DriverManager;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static com.bootcamp.mdq.driver.DriverManager.getDriver;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public abstract class CommonOperations {

  protected void navigate(String url) {
    getDriver().get(url);
  }

  protected void click(WebElement element) {
    waiting().until(elementToBeClickable(element)).click();
  }

  protected void type(WebElement element, String text) {
    waiting().until(elementToBeClickable(element)).sendKeys(text);
    waiting().until(or(textToBePresentInElement(element, text), textToBePresentInElementValue(element, text)));
  }

  protected void switchNewTabHandle(WebElement element) {
    String windowHandle = getDriver().getWindowHandle();
    click(element);
    for(String winHandle : getDriver().getWindowHandles()){
      getDriver().switchTo().window(winHandle);
    }
  }

  protected boolean isVisible(WebElement element) {
    return waiting().until(visibilityOf(element)).isDisplayed();
  }

  protected boolean isEnabled(WebElement element) {
    return waiting().until(elementToBeClickable(element)).isEnabled();
  }

  protected void setDate(WebElement element, LocalDate date) {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    String dateString = dateFormat.format(date);
    type(element, dateString);
  }

  protected void selectDropdown(WebElement element, String itemText) {
    Select dropdown = new Select(waiting().until(visibilityOf(element)));
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
