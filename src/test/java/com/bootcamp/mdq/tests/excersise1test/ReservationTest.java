package com.bootcamp.mdq.tests.excersise1test;

import com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshomepagecomponents.CheapTicketsHome;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Test;

import java.time.LocalDate;

public class ReservationTest extends BaseTestSuite {

    private CheapTicketsHome cheapTicketsHome;

    @Test
    public void reservationTest(){



       /* LocalDate birthDate = LocalDate.of(
                Integer.parseInt("1990"),
                Integer.parseInt("12"),
                Integer.parseInt("30"));

        birthDate = birthDate.plusDays(10);
        System.out.println("aaaaaaaaaaa" + birthDate);
        System.out.println("aaaaaaaaaaa" + birthDate);*/



        cheapTicketsHome = new CheapTicketsHome();
        cheapTicketsHome
                .initHotelReservationTest().
                getGoingToSearchBar().
                enterDestinyCity("Miami Beach")
                .calendar(2018,10,15,20)
                .setCheckInDate()
                .adultsComboBoxSelector("4")
                .childsComboBoxSelector("1")
                .ageChildComboBoxSelector("7")
                .clickOn()
                .useSearchBar()
                .search("Faena Hotel Miami Beach")
                .clickOn();



      /*  cheapTicketsHotels = new CheapTicketsHotels();
        cheapTicketsHotels
                .getGoingToSearchBar()
                .enterDestinyCity("Miami Beach");*/

    }

}
