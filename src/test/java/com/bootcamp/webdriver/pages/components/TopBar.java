package com.bootcamp.webdriver.pages.components;

import com.bootcamp.webdriver.pages.BasePage;
import com.bootcamp.webdriver.pages.results.Results;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class TopBar extends BasePage {

  @FindBy(name = "as_word")
  private WebElement searchInput;

  @FindBy(css = "button.nav-search-btn")
  private WebElement searchButton;

  public TopBar(WebDriver driver) {
    super(driver);
  }

  public Results search(String criteria){
    searchInput.sendKeys(criteria);
    searchButton.click();
    return new Results(driver);
  }

}
