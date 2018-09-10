package com.bootcamp.mdq.tests.amz.pages.results;

import com.bootcamp.mdq.tests.amz.exceptions.NotMatchingProductForCriteria;
import com.bootcamp.mdq.tests.amz.pages.common.AmzBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchResults extends AmzBasePage {

  @FindBy(css = "div#atfResults li.s-result-item")
  private List<WebElement> searchResults;

  private List<Result> results;

  public SearchResults() {
    super();
    results = searchResults.stream()
        .map(result -> new Result(result))
        .collect(toList());
  }

  public Result selectProduct(String... criteria) {
    return results.stream()
        .filter(result -> result.matchCriteria(criteria))
        .findFirst()
        .orElseThrow(() -> new NotMatchingProductForCriteria(criteria));
  }

}
