package com.bootcamp.mdq.tests.cheapTickectTest;

import com.bootcamp.mdq.page.pages.Home;
import com.bootcamp.mdq.page.pages.HotelPage;
import com.bootcamp.mdq.page.pages.Hotels;
import com.bootcamp.mdq.page.pages.SearchResults;
import com.bootcamp.mdq.tests.BaseTestSuite;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Wait;

import javax.jws.soap.SOAPBinding;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CheckHotelsFuncionalityTest extends BaseTestSuite {

    private Home home;


    @Test
    public void goingToHotelsPageTest(){

        home=new Home();

        SearchResults searchResults=home.navegationBar()
                .clickOnHotel()
                .typeHotelName("Miami Beach")
                .closeSuggestion()
                .pickAdate()
                .setAmountOfAdults("4")
                .setAmountOfChilden("1")
                .setChildrenAge("7")
                .clickOnSearch()
                .filterByNameFild("Faena Hotel Miami Beach")
                .clickOnSearchButton()
                ;

        //Check the number of results is not empty.
        Assert.assertFalse(searchResults.isEmpthyResult());

        //The results´s name on the list contain the name Filt
        //Assert.assertTrue(searchResults.validResults("Faena Hotel Miami Beach"));

        //HotelPage x=results.clickOnItem(0);


}

/*
    @Test

    public  void bookingTest(){
        hotel=new HotelPage();

        PayBookingPage bookingPage= hotel.clickOnItem(0);

        DriverManager.getDriver().findElement(By.id("deposit-pay-now-button")).click();

        Assert.assertTrue(bookingPage.paymentFormIsDisplayed());
        Assert.assertTrue(bookingPage.paymentFormIsAviliable());
    }*/
    }
