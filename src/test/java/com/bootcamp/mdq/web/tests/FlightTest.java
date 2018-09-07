package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.web.pages.Home;
import com.bootcamp.mdq.web.pages.components.ModalSaveMoney;
import com.bootcamp.mdq.web.pages.flights.FlightsResults;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;

public class FlightTest extends BaseTestSuite {

    private Home home;


   @Test
    public void flightTest(){

       home=new Home();

      ModalSaveMoney flights=home.navegationBar()
                .clickOnFligths()
                .typeOrigin("LAS")
                .typeDestination("LAX")
                .chooseAdepertureDate(2018, 10, 9)
                .chooseAreturningDate(2018, 11, 10)
                .setNumberOfAdults("1")
                .clickOnSearch()
                .chooseADepertureFlight(1)
                .chooseARetunigFlight(1);

      Assert.assertTrue(flights.isVisibleChooseNoButton());





    }


}
