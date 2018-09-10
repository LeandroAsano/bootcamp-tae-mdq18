package com.bootcamp.mdq.tests.amz.pages.results;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.tests.amz.pages.detail.ProductDetails;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Result extends WebComponent {

  @FindBy(css = "a.s-access-detail-page h2")
  private WebElement productSummaryLabel;

  Result(WebElement container) {
    super(container);
  }

  public ProductDetails select() {
    click(productSummaryLabel);
    return new ProductDetails();
  }

  boolean matchCriteria(String... criteria) {
    return match(productSummaryLabel, criteria);
  }


}
