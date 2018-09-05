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

    /*@Test
    public void searchFlightTest(){
        FlightResult result = home.header().clickFlight().searchFlight()
                .enterOrigin("LAS")
                .enterDestination("LAX")
                .enterCheckIn().setDate(3)
                .enterCheckOut().setDate(10)
                .selectAdults(1)
                .search()
                .getResultList()
                .selectCard(0)
                .selectFlight()
        //Assert.assertTrue(result.getTitleCitySpanText().contains("Select your return"));
                .getResultList()
                .selectCard(0)
                .selectFlight();

        assertTrue(result.hotelSellModal().isNoThanksLinkVisible());


    }*/
}
