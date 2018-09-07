package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepartmentsPage extends WebPage {
    @FindBy(css = "#a-page > div.a-container.fsdContainer.fsdFullWidthImage > div > div:nth-child(3) > div:nth-child(3) > div > a:nth-child(4)")
    private WebElement cellphoneLink;

    public CellphonePage clickCellphoneLink(){
        click(cellphoneLink);
        return new CellphonePage();
    }
}
