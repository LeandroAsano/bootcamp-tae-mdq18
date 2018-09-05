package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.web.pages.components.HotelCard;
import com.bootcamp.mdq.web.pages.home.Home;
import com.bootcamp.mdq.web.pages.hotels.HotelResult;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
        assertEquals("Faena Hotel Miami Beach",hotel.getHotelNameText());

    }

}
