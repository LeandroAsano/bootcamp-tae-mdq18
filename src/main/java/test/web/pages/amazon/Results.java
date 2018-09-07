package test.web.pages.amazon;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Results extends WebPage {
    @FindBy(css=".a-row.a-spacing-none .a-link-normal.s-access-detail-page")
    private List<WebElement> title;

    public ProductDetails clickTitle() {
        boolean contains = false;
        int index = 0;
        while (!contains) {
            title.get(index).getText().contains("Rose Gold");
            index++;
            click(title.get(index));
        }
        return new ProductDetails();
    }
}
