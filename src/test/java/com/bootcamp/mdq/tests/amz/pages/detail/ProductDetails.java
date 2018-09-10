package com.bootcamp.mdq.tests.amz.pages.detail;

import com.bootcamp.mdq.tests.amz.pages.common.AmzBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends AmzBasePage {

  @FindBy(css = "div.a-box.a-last")
  private WebElement rigthPanelContainer;

  @FindBy(id = "title")
  private WebElement productTitle;

  private RightPanel rightPanel;

  public ProductDetails() {
    super();
    this.rightPanel = new RightPanel(rigthPanelContainer);
  }

  public RightPanel rightPanel() {
    return rightPanel;
  }

  public String getProductTitle() {
    return getText(productTitle);
  }
}
