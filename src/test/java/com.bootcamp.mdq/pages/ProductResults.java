package com.bootcamp.mdq.pages;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.pages.components.ProductCard;
import com.bootcamp.mdq.waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.driver.Drivers.getDriver;

public class ProductResults extends WebPage {

    @FindBy(className = "s-item-container")
    private List<WebElement> itemsContainer;

    public ProductCard getFirstProductByDescription(String description) {

        List<WebElement> items = Waits.areVisible(getDriver().getWebDriver()
                .findElements(By.xpath("//h2[contains(@data-attribute, '" + description + "')]")));

        return new ProductCard(items.get(0));
    }

    public ProductCard getFirstProduct() {
        return itemsContainer.get(0);
    }

}
