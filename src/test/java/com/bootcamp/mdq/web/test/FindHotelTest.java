package com.bootcamp.mdq.web.test;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import com.bootcamp.mdq.web.page.Home.Home;
import com.bootcamp.mdq.web.page.SearchHotelsResults;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class FindHotelTest extends BaseTestSuite {

    private Home home;

    @Before
    public void setupHome() {
        this.home = new Home();
    }

    @Test
    public void findHotelTest() {
        LocalDate checkInDate = LocalDate.now().plusYears(1);
        LocalDate checkOutDate = LocalDate.now().plusDays(7).plusYears(1);

        SearchHotelsResults results = this.home.getHeader()
                .findHotels()
                .setDestination("Miami Beach")
                .closeSuggestDestinationDropdown()
                .setChekinByCalendar()
                .selectMonth(11)
                .selectDay(23)
                .setCheckoutByCalendar()
                .selectDay(26)
                .selectNumberAdults("4")
                .selectNumberChildrens("1")
                .selectChildAge("7")
                .searchHotels()
                .filterHotelByName("Faena Hotel Miami Beach")
                .applyNameFilter();

        Assert.assertTrue(results.getResults().size() > 0);

    }
}
