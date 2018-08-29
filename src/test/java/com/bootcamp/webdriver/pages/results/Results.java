package com.bootcamp.webdriver.pages.results;

import com.bootcamp.webdriver.pages.BasePage;
import com.bootcamp.webdriver.pages.components.Item;
import com.bootcamp.webdriver.pages.components.TopBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Results extends BasePage {

  private TopBar topBar;

  @FindBy(css = "div.item--stack")
  private List<WebElement> items;

  public Results(WebDriver driver) {
    super(driver);
    topBar = new TopBar(driver);
  }

  public TopBar topBar() {
    return topBar;
  }

  public Item selectItem(int item) {
    return new Item(driver, items.get(item - 1));
  }

}
