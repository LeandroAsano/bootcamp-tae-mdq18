package com.bootcamp.webdriver.pages.components;

import com.bootcamp.webdriver.pages.ItemDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Item extends BaseComponent {

  @FindBy(className = "item__info-title")
  private WebElement itemNameLink;

  public Item(WebDriver driver, WebElement container) {
    super(driver, container);
  }

  public ItemDetails clickItemName() {
    itemNameLink.click();
    return new ItemDetails(driver);
  }

}
