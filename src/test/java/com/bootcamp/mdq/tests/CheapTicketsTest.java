package com.bootcamp.mdq.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Home;
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

    Assert.assertTrue("Flights are displayed",result.getResults().size() > 0);

  }

}
