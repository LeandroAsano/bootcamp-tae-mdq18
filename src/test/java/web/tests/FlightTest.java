package web.tests;


import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;
import web.pages.Home;
import web.pages.ResultsFlights;

public class FlightTest extends BaseTestSuite {

    private Home home;


    @Test
    public void flightTest(){

        home=new Home();

        ResultsFlights flights=home.header()
                .clickFligths()
                .typeOrigin("LAS")
                .typeDestination("LAX")
                .depertureDate(10)
                .returningDate(0)
                .setAdults(1)
                .searchFlight()
                .getResultList()
                .selectCard(0)
                .selectFlight()
                .getResultList()
                .selectCard(0)
                .selectFlight();

        flights.changeWindow(2);

        Assert.assertTrue(flights.SellModal().isNoThanksLinkVisible());



    }


}
