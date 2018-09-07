package com.bootcamp.mdq.pages.tests;

import com.bootcamp.mdq.pages.AmazonHome;
import com.bootcamp.mdq.pages.Cart;
import com.bootcamp.mdq.pages.components.ProductCard;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

public class CartBasicOperations extends BaseTestSuite {

    private AmazonHome amazonHome;

    @Before
    public void setupCartBasicOperations() {
        this.amazonHome = new AmazonHome();
    }

    @Test
    public void addAndRemoveProductToCart() {
        ProductCard product = amazonHome.getNavBar()
                .selectCategoryFilter("Cell Phones & Accessories")
                .enterProductSearch("iphone 7 cell phone")
                .searchProduct()
                .getFirstProductByDescription("Rose Gold");

        String productDesc = product.getProductDescription();

        product.goToProductDetail()
                .addToCart()
                .viewCart()
                .getItemCardByDescription(productDesc)
                .deleteItem();

    }

}
