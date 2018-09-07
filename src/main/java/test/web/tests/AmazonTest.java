package test.web.tests;

import com.bootcamp.mdq.driver.Driver;
import com.bootcamp.mdq.driver.Drivers;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.web.pages.amazon.Cart;
import test.web.pages.amazon.Home;
import test.web.pages.amazon.ProductDetails;

import java.net.MalformedURLException;

public class AmazonTest extends BaseTestSuite {

   @Test
    public void amazon(){
        ProductDetails details = new ProductDetails();
        details = new Home()
                //.selectOption(12)
                .typeSearch("iphone 7")
                .submit()
                .clickTitle();
        String expected = details.getTitle();
        Cart cart = details.addToCart()
                .goToCart();
       Assert.assertEquals(expected,cart.title());
       cart.delete();
   }

}

