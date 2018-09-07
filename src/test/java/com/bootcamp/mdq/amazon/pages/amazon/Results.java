package com.bootcamp.mdq.amazon.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class Results extends WebPage {

    @CacheLookup
    @FindBy(css = ".s-result-item.celwidget")
    private List<WebElement> resultItems;

    public ItemDetails getFirstFilteredByName(String item){
        List<WebElement> items = resultItems.stream()
                .filter(element -> item.contains(element.findElement(By.tagName("h2")).getText()))
                .collect(Collectors.toList());
        click(items.get(0));
        return new ItemDetails();
    }
}
