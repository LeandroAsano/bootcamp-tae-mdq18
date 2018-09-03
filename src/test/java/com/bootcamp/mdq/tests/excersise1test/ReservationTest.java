package com.bootcamp.mdq.tests.excersise1test;

import com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshomepagecomponents.CheapTicketsHome;
import com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelpagecomponents.comboboxworkflow.ChildsComboBox;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Test;

import java.time.LocalDate;

public class ReservationTest extends BaseTestSuite {

    private CheapTicketsHome cheapTicketsHome;

    @Test
    public void reservationTest(){

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
                .clickOn2()
                .getFirstHotel();;
    }

}
