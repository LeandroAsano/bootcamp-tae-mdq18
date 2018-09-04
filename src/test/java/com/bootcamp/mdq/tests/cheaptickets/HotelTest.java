package com.bootcamp.mdq.tests.cheaptickets;

import com.bootcamp.mdq.pages.components.HotelCard;
import com.bootcamp.mdq.pages.home.Home;
import com.bootcamp.mdq.pages.hotels.HotelResult;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Matias on 31/08/2018.
 */
public class HotelTest extends BaseTestSuite {

    private Home home;

    @Before
    public void start(){
        home = new Home();
    }

    @Test
    public void searchHotelTest(){
        HotelResult result = home.header().clickHotel()
                .destination("Miami Beach")
                .checkIn(4)
                .checkOut(20)
                .rooms(1)
                .adults(4)
                .childs(1)
                .childsAge(7)
                .search()
                .searchHotelName("Faena Hotel Miami Beach")
                .findHotel();
        HotelCard hotel = result.selectHotelCard(0);

        assertTrue("The number of results must be greater than 0",0 < result.getNumberOfResults());
        assertTrue("A result card(s) must be displayed for the “Faena Hotel Miami Beach” hotel ",
                "Faena Hotel Miami Beach".equals(hotel.getHotelNameText()));

    }

}
