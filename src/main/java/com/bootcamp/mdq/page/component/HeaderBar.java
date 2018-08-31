package com.bootcamp.mdq.page.component;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderBar extends BasePage {
    @FindBy(
            name = "as_word"
    )
    private WebElement searchInput;
    @FindBy(
            css = "button.nav-search-btn"
    )
    private WebElement searchButton;

    public HeaderBar(WebDriver driver) {
        super(driver);
    }

    public Results search(String criteria) {
        this.searchInput.sendKeys(new CharSequence[]{criteria});
        this.searchButton.click();
        return new Results(this.driver);
    }
}