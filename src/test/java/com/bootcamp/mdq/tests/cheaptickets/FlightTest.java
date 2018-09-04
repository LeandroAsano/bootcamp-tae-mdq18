package com.bootcamp.mdq.tests.cheaptickets;

import com.bootcamp.mdq.pages.flights.FlightResult;
import com.bootcamp.mdq.pages.home.Home;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        FlightResult result = home.header().clickFlight().searchFlight()
                .enterOrigin("LAS")
                .enterDestination("LAX")
                .enterCheckIn(3)
                .enterCheckOut(15)
                .selectAdults(1)
                .search()
                .getResultList()
                .selectCard(0)
                .selectFlight()
        //Assert.assertTrue(result.getTitleCitySpanText().contains("Select your return"));
                .getResultList()
                .selectCard(0)
                .selectFlight();

        Assert.assertTrue(result.hotelSellModal().visibleNoThanksLink());


    }
}
