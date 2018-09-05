package com.bootcamp.mdq.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Home;
import pages.HotelDetails;
import pages.PayPage;
import pages.ResultsSearchHotel;

import static com.bootcamp.mdq.driver.Drivers.getDriver;

public class CheapTicketsTest extends BaseTestSuite {

  private Home home;

  @Test
  public void myTest() {

    WebDriver webDriver = getDriver().getWebDriver();

    home = new Home();

    ResultsSearchHotel result = home.header()
            .clickHotel()
            .destination("Miami Beach")
            //.close()
            .checkIn(10)
            .checkOut(0)
            .rooms(1)
            .selectAdults(4)
            .childs(1)
            .childsAge(7)
            .search()
            .serchHotelName("Faena Hotel Miami Beach")
            .findHotel();

    Assert.assertTrue("Flights are displayed",result.results("Faena Hotel Miami Beach"));
  }

  @Test
  public void reserveTest() {

    home = new Home();

    HotelDetails hotelPage = home.header()
            .clickHotel()
            .destination("Medellin")
            .checkIn(10)
            .checkOut(0)
            .selectAdults(1)
            .search()
            .clickOverSearchResult(0);

    hotelPage.changeWindow(2);

    PayPage payPage = hotelPage.clickOnItem(1);

    Assert.assertTrue(payPage.hasCardHolderName());
    Assert.assertTrue(payPage.hasCreditCardNumber());
    Assert.assertTrue(payPage.hasMonthSelector());
    Assert.assertTrue(payPage.hasExpirationYear());
    Assert.assertTrue(payPage.hasSecurityCode());
    Assert.assertTrue(payPage.hasZipCode());
  }

}
