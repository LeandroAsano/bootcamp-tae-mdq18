package tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AmazonHomePage;

/**
 * Created by Yo on 7/9/2018.
 */
public class AmazonTest extends BaseTestSuite {


    @Test
    public void test(){
        AmazonHomePage amazonhome = new AmazonHomePage();
        amazonhome
                .clickDropDownCategories()
                .categoriesFilter("Cell Phones & Accessories")
                .typeOnSearchBar("Iphone 7 cellphone")
                .search()
                .categoriesFilter2("Rose Gold").addToCartClick();
    }
}
