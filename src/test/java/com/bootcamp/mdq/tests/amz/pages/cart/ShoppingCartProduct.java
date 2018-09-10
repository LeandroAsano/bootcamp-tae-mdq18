package com.bootcamp.mdq.tests.amz.pages.cart;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartProduct extends WebComponent {

  @FindBy(css = "span.sc-product-title")
  private WebElement productTitle;

  @FindBy(css = "span.sc-action-delete input")
  private WebElement removeProductLink;

  @FindBy(css = "[data-action='delete'] a")
  private WebElement afterRemoveText;

  protected ShoppingCartProduct(WebElement container) {
    super(container);
  }

  public ShoppingCartProduct remove() {
    click(removeProductLink);
    return this;
  }

  public String getTitle(){
    return getText(productTitle);
  }

  public String getAfterRemoveText() {
    return getText(afterRemoveText);
  }

  boolean matchCriteria(String... criteria) {
    return match(productTitle, criteria);
  }

}
