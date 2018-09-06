package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.web.pages.Home;
import com.bootcamp.mdq.web.pages.flights.FlightsResults;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

public class FlightTest extends BaseTestSuite {

    private Home home;


   @Test
    public void flightTest(){

       home=new Home();

       FlightsResults flights=home.navegationBar()
                .clickOnFligths()
                .typeOrigin("LAS")
                .typeDestination("LAX")
                .chooseAdepertureDate(2018, 12, 9)
                .chooseAreturningDate(2019, 1, 10)
                .setNumberOfAdults("1")
                .clickOnSearch();

    }


}
