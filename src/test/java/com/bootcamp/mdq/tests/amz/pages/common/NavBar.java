package com.bootcamp.mdq.tests.amz.pages.common;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.tests.amz.pages.cart.ShoppingCart;
import com.bootcamp.mdq.tests.amz.pages.results.SearchResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Optional;

public class NavBar extends WebComponent {

  @FindBy(id = "searchDropdownBox")
  private WebElement searchCategoriesSelect;

  @FindBy(id = "twotabsearchtextbox")
  private WebElement searchInput;

  @FindBy(css = "div.nav-search-submit input")
  private WebElement searchButton;

  @FindBy(id = "nav-cart")
  private WebElement shoppingCartLink;

  public NavBar(WebElement container) {
    super(container);
  }

  public SearchResults search(String product, Optional<String> category) {
    if (category.isPresent()) {
      filter(category.get());
    }
    return typeProduct(product).clickOnSearchButton();
  }

  public NavBar filter(String category) {
    selectByText(searchCategoriesSelect, category);
    return this;
  }

  public NavBar typeProduct(String product) {
    type(searchInput, product);
    return this;
  }

  public SearchResults clickOnSearchButton() {
    click(searchButton);
    return new SearchResults();
  }

  public ShoppingCart shoppingCart() {
    click(shoppingCartLink);
    return new ShoppingCart();
  }

}
