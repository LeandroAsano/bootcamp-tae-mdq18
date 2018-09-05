package com.bootcamp.mdq.tests.excersise1test;

import com.bootcamp.mdq.tests.components.cheapticketshomepagecomponents.CheapTicketsHome;
import com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents.HotelCard;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;

public class ReservationTest extends BaseTestSuite {

    private CheapTicketsHome cheapTicketsHome;

    @Test
    public void reservationTest(){
        cheapTicketsHome = new CheapTicketsHome();
        HotelCard hotelCard = cheapTicketsHome
                .initHotelReservationTest().
                        getGoingToSearchBar().
                        enterDestinyCity("Miami Beach")
                .calendar(2018, 10, 10, 20)
                .setCheckInDate()
                .adultsComboBoxSelector("4")
                .childsComboBoxSelector("1")
                .ageChildComboBoxSelector("7")
                .clickOn()
                .useSearchBar()
                .search("Faena Hotel Miami Beach")
                .clickOn()
                .getSpecificHotel("Faena Hotel Miami Beach");

        Assert.assertEquals("Faena Hotel Miami Beach",hotelCard.getName());

    }

    @Test
    public void reservationTest2(){
        cheapTicketsHome = new CheapTicketsHome();
        cheapTicketsHome
                .initHotelReservationTest().
                getGoingToSearchBar().
                enterDestinyCity("Medellin")
                .calendar(2018,10,15,20)
                .setCheckInDate()
                .adultsComboBoxSelector2("1")
                .clickOn2();
             /*   .getFirstHotel();*/
    }

}
