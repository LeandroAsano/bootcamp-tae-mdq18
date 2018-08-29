package com.bootcamp.webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyWebDriverTest {

  private WebDriver driver;

  /**
   * Sets the path to the Chrome binary and create a new session of {@link ChromeDriver}
   */
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  /**
   * Closes the browser by closing the Selenium server's session.
   */
  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void myTest() {
    WebElement logo = driver.findElement(By.id("hplogo"));
    Assert.assertTrue(logo.isDisplayed());

    WebElement searchInput = driver.findElement(By.id("lst-ib"));
    Assert.assertTrue(searchInput.isEnabled());
  }

}
