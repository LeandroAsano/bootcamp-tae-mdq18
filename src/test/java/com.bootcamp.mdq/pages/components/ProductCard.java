package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.pages.ProductDetailPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends WebComponent {

    @FindBy(css = ".a-size-medium.s-inline.s-access-title.a-text-normal")
    private WebElement productDescription;

    public ProductCard(WebElement container) {
        super(container);
    }

    public String getProductDescription() {
        return getText(productDescription);
    }

    public ProductDetailPage goToProductDetail() {
        click(productDescription);
        return new ProductDetailPage();
    }
}
