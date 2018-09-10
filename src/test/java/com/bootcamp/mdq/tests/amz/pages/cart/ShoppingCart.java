package com.bootcamp.mdq.tests.amz.pages.cart;

import com.bootcamp.mdq.tests.amz.pages.common.AmzBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ShoppingCart extends AmzBasePage {

  @FindBy(css = "div.sc-cart-header h1")
  private WebElement header;

  @FindBy(className = "sc-list-item")
  private List<WebElement> entries;

  private List<ShoppingCartProduct> shoppingCartEntries;

  public ShoppingCart() {
    super();
    shoppingCartEntries = entries.stream()
        .map(entry -> new ShoppingCartProduct(entry))
        .collect(toList());
  }

  public String getHeaderTitle() {
    return getText(header);
  }

  public ShoppingCartProduct get(String... criteria) {
    return shoppingCartEntries.stream()
        .filter(p -> p.matchCriteria(criteria))
        .findFirst()
        .get();
  }

}
