package com.bootcamp.mdq.web.test;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import com.bootcamp.mdq.web.page.Home.Home;
import com.bootcamp.mdq.web.page.ValidationPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReservationTest extends BaseTestSuite {

    private Home home;

    @Before
    public void setupHome() {
        this.home = new Home();
    }

    @Test
    public void reservationTest() {
        ValidationPage valPage = this.home.getHeader()
                .findHotels()
                .setDestination("Miami Beach")
                .closeSuggestDestinationDropdown()
                .setCheckinByCalendar()
                .selectMonth(11)
                .selectDay(23)
                .setCheckoutByCalendar()
                .selectDay(26)
                .selectNumberAdults("1")
                .searchHotels()
                .getSingleResult(0)
                .selectHotel()
                .selectRoom(0)
                .bookRoom(0)
                .reserveRoom()
                .payNow();

        Assert.assertTrue(valPage.isDisplayedCardHolderNameInput());
        Assert.assertTrue(valPage.isDisplayedCreditCardInput());
        Assert.assertTrue(valPage.isDisplayedExpirationDateMonthSelect());
        Assert.assertTrue(valPage.isDisplayedExpirationDateYearSelect());
        Assert.assertTrue(valPage.isDisplayedSecurityCodeInput());
        Assert.assertTrue(valPage.isDisplayedBillingZipCodeInput());


    }

}
