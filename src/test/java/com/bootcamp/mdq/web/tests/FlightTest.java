package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.web.pages.flights.FlightResult;
import com.bootcamp.mdq.web.pages.home.Home;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Matias on 31/08/2018.
 */
public class FlightTest extends BaseTestSuite {

    private Home home;

    @Before
    public void start(){
        home = new Home();
    }

    @Test
    public void searchFlightTest(){
        FlightResult result = home.header().clickFlight()
                .enterOrigin("LAS")
                .enterDestination("LAX")
                .enterCheckIn()
                .selectDaysAhead(3)
                .clickFlightDate()
                .enterCheckOut()
                .selectDaysAhead(10)
                .clickFlightDate()
                .selectAdults(1)
                .search()
                .getResultList()
                .selectCard(0)
                .selectFlight()
                .getResultList()
                .selectCard(0)
                .selectFlight();

        assertTrue(result.hotelSellModal().isNoThanksLinkVisible());


    }
}
