package com.bootcamp.mdq.web.tests.hotel;


import com.bootcamp.mdq.web.pages.Home;
import com.bootcamp.mdq.web.pages.hotel.HotelPage;
import com.bootcamp.mdq.web.pages.hotel.PayBookingPage;
import com.bootcamp.mdq.web.pages.hotel.SearchResults;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;


public class HotelSearchTest extends BaseTestSuite {

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
    public void bookingTest() {

        home = new Home();

        HotelPage hotelPage = home.navegationBar()
                .clickOnHotel()
                .typeHotelName("Medellin")
                .closeSuggestion()
                .pickAdate()
                .setAmountOfAdults("1")
                .clickOnSearch()
                .clickOnItemOverSearchResult(0);

        hotelPage.changeWindow(2);

        PayBookingPage payBookingPage = hotelPage.clickOnItem(1);

        Assert.assertTrue(payBookingPage.hasCardHolderName());
        Assert.assertTrue(payBookingPage.hasCreditCardNumber());
        Assert.assertTrue(payBookingPage.hasMonthSelector());
        Assert.assertTrue(payBookingPage.hasExpirationYear());
        Assert.assertTrue(payBookingPage.hasSecurityCode());
        Assert.assertTrue(payBookingPage.hasZipCode());
    }

}
