package com.bootcamp.mdq.tests.web;

import com.bootcamp.mdq.tests.web.components.cheapticketshomepagecomponents.CheapTicketsHome;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservationTest extends BaseTestSuite {

    private CheapTicketsHome cheapTicketsHome;

    @Test
    public void reservationTest() {
        cheapTicketsHome = new CheapTicketsHome();
        String hotelCard = cheapTicketsHome
                .initHotelReservationTest()
                .getGoingToSearchBar()
                .enterDestinyCity("Miami Beach")
                .calendar(2018, 10, 10, 20)
                .setCheckInDate()
                .adultsComboBoxSelector("4")
                .childsComboBoxSelector("1")
                .ageChildComboBoxSelector("7")
                .clickGoToOffersPage()
                .useSearchBar()
                .search("Faena Hotel Miami Beach")
                .clickOnHotelFilterBtn()
                .getSpecificHotel("Faena Hotel Miami Beach")
                .getHotelName();

        assertEquals("Faena Hotel Miami Beach", hotelCard);
/* LA LISTA DE HOTELES NO APARECE EN EL DOM */
    }

    @Test
    public void reservationTest2() {
        cheapTicketsHome = new CheapTicketsHome();
        cheapTicketsHome
                .initHotelReservationTest().
                getGoingToSearchBar().
                enterDestinyCity("Medellin")
                .calendar(2018, 10, 15, 20)
                .setCheckInDate()
                .adultsComboBoxSelector2("1")
                .clickGoToOffersPage()
                .getHotelsList()
                .getFirstHotel()
                .dataCreditCardForm();
        /* NO LLEGA A LA LISTA DE BOTONES DE RESERVAR (PROBABLEMENTE PANTALLA DE CARGA) */
    }

}
