package com.bootcamp.mdq.tests;

import com.bootcamp.mdq.page.Home.Home;
import com.bootcamp.mdq.page.ValidationPage;
import com.bootcamp.mdq.page.component.RoomCard;
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
    public void ReservationTest() {
        ValidationPage valPage = this.home.getHeader()
                .findHotels()
                .setDestination("Miami Beach")
                .closeSuggestDestinationDropdown()
                .setChekinByCalendar()
                .selectMonth(11)
                .selectDay(23)
                .setCheckoutByCalendar()
                .selectDay(26)
                .selectNumberAdults("1")
                .searchHotels()
                .getSingleResult(0)
                .bookRoom(0)
                .reserveRoom();

        Assert.assertTrue(valPage.isVisibleCardHolderNameInput());
        Assert.assertTrue(valPage.isVisibleCreditCardInput());
        Assert.assertTrue(valPage.isVisibleExpirationDateMonthSelect());
        Assert.assertTrue(valPage.isVisibleExpirationDateYearSelect());
        Assert.assertTrue(valPage.isVisibleSecurityCodeInput());
        Assert.assertTrue(valPage.isVisibleBillingZipCodeInput());


    }

}
