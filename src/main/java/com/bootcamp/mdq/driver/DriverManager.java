package com.bootcamp.mdq.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class DriverManager {

  private static WebDriver driver;

  public static WebDriver populateDriver(String browserName) {
    if (driver == null) {
      if ("chrome".equals(browserName)) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      } else if ("firefox".equals(browserName)) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
      } else if ("iexplorer".equals(browserName)) {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
      } else {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      }

      driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      driver.manage().window().maximize();
    }
    return driver;
  }

  public static WebDriver getDriver() {
    return driver;
  }

  public static void dispose() {
    driver.quit();
  }




}
