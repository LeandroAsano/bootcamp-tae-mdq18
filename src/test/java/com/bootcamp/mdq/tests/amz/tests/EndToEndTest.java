package com.bootcamp.mdq.tests.amz.tests;

import com.bootcamp.mdq.tests.amz.pages.cart.ShoppingCart;
import com.bootcamp.mdq.tests.amz.pages.cart.ShoppingCartProduct;
import com.bootcamp.mdq.tests.amz.pages.common.NavBar;
import com.bootcamp.mdq.tests.amz.pages.detail.ProductDetails;
import com.bootcamp.mdq.tests.amz.pages.home.Home;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

import static com.bootcamp.mdq.tests.amz.constants.Categories.CELL_PHONES_AND_CATEGORIES;
import static java.util.Optional.of;

public class EndToEndTest extends BaseTestSuite {

  private static final String PRODUCT = "iphone 7";
  private static final String CHARACTERISTIC = "Rose Gold";

  @Test
  public void addToCartAndRemove() {

    NavBar navBar = new Home().navBar();

    ProductDetails productDetails = navBar.search(PRODUCT, of(CELL_PHONES_AND_CATEGORIES))
        .selectProduct(CHARACTERISTIC)
        .select();

    String productTitle = productDetails.getProductTitle();

    productDetails.rightPanel().addToCart();

    ShoppingCart shoppingCart = navBar.shoppingCart();

    ShoppingCartProduct product = shoppingCart.get(PRODUCT, CHARACTERISTIC);

    checkEquals(productTitle, product.getTitle());

    product.remove();

    checkEquals("Your Shopping Cart is empty.", shoppingCart.getHeaderTitle());

  }

}
