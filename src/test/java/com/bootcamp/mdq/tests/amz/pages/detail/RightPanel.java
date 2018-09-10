package com.bootcamp.mdq.tests.amz.pages.detail;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RightPanel extends WebComponent {

  @FindBy(id = "add-to-cart-button")
  private WebElement addToCartButton;

  protected RightPanel(WebElement container) {
    super(container);
  }

  public RightPanel addToCart(){
    click(addToCartButton);
    return this;
  }
}
