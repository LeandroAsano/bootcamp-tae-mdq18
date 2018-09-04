package com.bootcamp.mdq.tests.cheapTickectTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.pages.Home;
import com.bootcamp.mdq.pages.HotelPage;
import com.bootcamp.mdq.pages.PayBookingPage;
import com.bootcamp.mdq.pages.SearchResults;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.openqa.selenium.By;



public class CheckHotelsFuncionalityTest extends BaseTestSuite {

    private Home home;

    @Test
    public void goingToHotelsPageTest() {

        home = new Home();

        SearchResults searchResults = home.navegationBar()
                .clickOnHotel()
                .typeHotelName("Miami Beach")
                .closeSuggestion()
                .pickAdate()
                .setAmountOfAdults("4")
                .setAmountOfChilden("1")
                .setChildrenAge("7")
                .clickOnSearch()
                .filterByNameFild("Faena Hotel Miami Beach")
                .clickOnSearchButton();

        //Check the number of results is not empty.
        Assert.assertFalse(searchResults.isEmpthyResult());

        //The results´s name on the list contain the name Filt
        Assert.assertTrue(searchResults.validResults("Faena Hotel Miami Beach"));


    }


    @Test

    public  void bookingTest(){

        home = new Home();

        HotelPage hotelPage = home.navegationBar()
                .clickOnHotel()
                .typeHotelName("Medellin")
                .closeSuggestion()
                .pickAdate()
                .setAmountOfAdults("1")
                .clickOnSearch()
                .clickOnItemOverSearchResult(0);


        hotelPage.changeWindow(1);

        PayBookingPage payBookingPage=hotelPage.clickOnItem(0);

        //DriverManager.getDriver().findElement(By.id("deposit-pay-now-button")).click();

        Assert.assertTrue(payBookingPage.hasCardHolderName());
        Assert.assertTrue(payBookingPage.hasCreditCardNumber());
        Assert.assertTrue(payBookingPage.hasMonthSelector());
        Assert.assertTrue(payBookingPage.hasExpirationYear());
        Assert.assertTrue(payBookingPage.hasSecurityCode());
        Assert.assertTrue(payBookingPage.hasZipCode());

        Assert.assertTrue(payBookingPage.availableCardHolderName());
        Assert.assertTrue(payBookingPage.availableCreditCardNumber());
        Assert.assertTrue(payBookingPage.availableMonthSelector());
        Assert.assertTrue(payBookingPage.availableExpirationYear());
        Assert.assertTrue(payBookingPage.availableSecurityCode());
        Assert.assertTrue(payBookingPage.availableZipCode());

    }

}
