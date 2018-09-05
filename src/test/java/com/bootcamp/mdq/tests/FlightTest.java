package com.bootcamp.mdq.tests;


import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;
import pages.Home;
import pages.ResultsFlights;

public class FlightTest extends BaseTestSuite {

    private Home home;


    @Test
    public void flightTest(){

        home=new Home();

        ResultsFlights flights=home.header().clickFligths()
                .typeOrigin("LAS")
                .typeDestination("LAX")
                .depertureDate(10)
                .returningDate(20)
                .setAdults(1)
                .searchFlight();



    }


}
