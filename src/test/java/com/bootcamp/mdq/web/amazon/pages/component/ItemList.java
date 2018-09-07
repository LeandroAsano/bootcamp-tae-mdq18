package com.bootcamp.mdq.web.amazon.pages.component;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.amazon.pages.ArticlePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemList extends WebComponent {

    @FindBy(className = "s-access-detail-page")
    private WebElement titleArticle;


    public ItemList(WebElement container) {
        super(container);
    }

    public String getTitle()
    {
        return getText(titleArticle);
    }

    public ArticlePage clickOnItem(){
        click(titleArticle);
        return new ArticlePage();
    }
}
