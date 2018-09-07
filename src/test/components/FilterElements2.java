package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonHomePage;
import pages.IndividualProductWeb;

import java.util.List;

/**
 * Created by Yo on 7/9/2018.
 */
public class FilterElements2 {


    /* NO ENCONTRE EL SELECTOR DE LA LISTA DE IPHONES */ 
    @FindBy(className = "s-item-container")
    private List<WebElement> dropDownlistCategories;

    public IndividualProductWeb categoriesFilter2(String categorieName){

        for (WebElement categorie : dropDownlistCategories) {
            if(categorie.getText().contains(categorieName)){
                return new IndividualProductWeb();
            }
        }
        return new IndividualProductWeb();
    }
}
