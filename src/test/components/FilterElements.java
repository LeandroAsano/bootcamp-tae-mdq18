package components;

import com.bootcamp.mdq.driver.Driver;
import com.bootcamp.mdq.driver.Drivers;
import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonHomePage;
import pages.IndividualProductWeb;
import tests.AmazonTest;

import java.util.List;

/**
 * Created by Yo on 7/9/2018.
 */
public class FilterElements extends WebPage {

    @FindBy(id = "searchDropdownBox")
    private WebElement dropDownlistCategories;

    public AmazonHomePage categoriesFilter(String categorieName){

        Select categoriesSelector = new Select(dropDownlistCategories);
        List<WebElement> categories = categoriesSelector.getOptions();

        for (WebElement categorie : categories) {
            if(categorieName.equals(categorie.getText())){
                return new AmazonHomePage();
            }
        }
        return new AmazonHomePage();
    }
}
