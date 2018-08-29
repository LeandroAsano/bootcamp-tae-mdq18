package com.bootcamp.webdriver.tests;

import com.bootcamp.webdriver.pages.ItemDetails;
import com.bootcamp.webdriver.pages.home.Home;
import com.bootcamp.webdriver.pages.results.Results;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyWebDriverTest {

  private WebDriver driver;

  private Home home;

  /**
   * Sets the path to the Chrome binary and create a new session of {@link ChromeDriver}
   */
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver();
    driver.get("https://www.mercadolibre.com.ar/");
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    home = new Home(driver);
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

    // Step 1: Search for a product <- search form
    Results results = home.topBar()
        .search("Muebles");

    // Step 2: Click the first product for the search result list <- reusable component
    ItemDetails itemDetails = results.selectItem(1).clickItemName();

    // Step 3: Buy the selected product
    WebElement buyButton = driver.findElement(By.id("BidButtonTop"));
    buyButton.click();

    // Step 4: Validate that the user must be registered to buy a product
    WebElement registrationContainer = driver.findElement(By.cssSelector("div.auth-box_container--notRegistered"));
    Assert.assertTrue(registrationContainer.isDisplayed());

  }

}
