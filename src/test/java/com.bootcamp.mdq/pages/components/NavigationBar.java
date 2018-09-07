package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.ProductResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends WebComponent {

   @FindBy(css = ".nav-search-dropdown.searchSelect")
   private WebElement filterCategoriesSelect;

   @FindBy(id = "twotabsearchtextbox")
   private WebElement searchProductTextBox;

   @FindBy(css = ".nav-search-submit.nav-sprite")
   private WebElement submitSearchButton;

    public NavigationBar(WebElement container) {
        super(container);
    }

    public NavigationBar selectCategoryFilter(String categoriesName) {
        selectByText(filterCategoriesSelect, categoriesName);
        return this;
    }

    public NavigationBar enterProductSearch(String product) {
        type(searchProductTextBox, product);
        return this;
    }

    public ProductResults searchProduct() {
        click(submitSearchButton);
        return new ProductResults();
    }

}
