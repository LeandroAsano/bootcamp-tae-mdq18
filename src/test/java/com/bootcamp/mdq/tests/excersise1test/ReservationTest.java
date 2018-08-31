package com.bootcamp.mdq.tests.excersise1test;

import com.bootcamp.mdq.page.CheapTicketsHotels;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Test;

public class ReservationTest extends BaseTestSuite {

    private CheapTicketsHotels cheapTicketsHotels;

    @Test
    public void reservationTest(){
        cheapTicketsHotels = new CheapTicketsHotels();
        cheapTicketsHotels
                .getGoingToSearchBar()
                .enterDestinyCity("Miami Beach");

    }

}
