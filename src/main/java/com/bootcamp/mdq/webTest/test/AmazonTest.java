package com.bootcamp.mdq.webTest.test;

import com.bootcamp.mdq.driver.Drivers;
import com.bootcamp.mdq.properties.TestProperties;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import com.bootcamp.mdq.webTest.page.CartPage;
import com.bootcamp.mdq.webTest.page.HomePage;
import com.bootcamp.mdq.webTest.page.ShoppingCart;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static com.bootcamp.mdq.driver.Drivers.dispose;

public class AmazonTest extends BaseTestSuite {

    @Test
    public void amazonTest(){
        HomePage homePage = new HomePage() ;

        homePage.clickLink()
                .clickCellphoneLink()
                .searchInputType("iphone 7")
                .clickSearchButton()
                .searchIphone("Rose Gold")
                .clickAddToCartButton()
                .clickCartButton()
                .deleteItem();

        Assert.assertEquals("Added to Cart", CartPage.getConfirmationText());
        Assert.assertEquals("Your Shopping Cart is empty.", ShoppingCart.getDeleteConfirmation());
    }

    @After
    public void testTearDown() {
        dispose();
    }
}
