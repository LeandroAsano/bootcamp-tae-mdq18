package com.bootcamp.mdq.amazon.test;

import com.bootcamp.mdq.amazon.pages.amazon.Cart;
import com.bootcamp.mdq.amazon.pages.amazon.Home;
import com.bootcamp.mdq.amazon.pages.amazon.Results;
import com.bootcamp.mdq.amazon.pages.components.SearchNavBar;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmazonFilterTest extends BaseTestSuite {

    private Home home;

    @Before
    public void start(){
        home = new Home();
    }

    @Test
    public void shopAndRemoveTest(){
        Cart cart = home
                .searchNavBar()
                .selectFilter("Cell Phones & Accessories")
                .searchText("iphone 7 cellphone")
                .searchGo()
                .getFirstFilteredByName("Rose Gold")
                .addToCart()
                .openCartButton();

        Assert.assertTrue(cart.getItemText().contains("iphone 7"));

        cart.deleteItemFromCart();

        Assert.assertEquals("Your Shopping Cart is empty." , cart.getCartRowEmpty());


    }

}
