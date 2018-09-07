package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.web.pages.components.HotelCard;
import com.bootcamp.mdq.web.pages.home.Home;
import com.bootcamp.mdq.web.pages.hotels.HotelDetail;
import com.bootcamp.mdq.web.pages.hotels.HotelResult;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Matias on 31/08/2018.
 */
public class SearchHotelTest extends BaseTestSuite {

    private Home home;

    @Before
    public void start(){
        home = new Home();
    }

    @Test
    public void searchHotelTest(){
        HotelCard hotel = home.header().clickHotel()
                .destination("Miami Beach")
                .checkIn().selectDaysAhead(3).clickHotelDate()
                .checkOut().selectDaysAhead(10).clickHotelDate()
                .rooms(1)
                .adults(4)
                .childs(1)
                .childsAge(7)
                .search()
                .searchHotelName("Faena Hotel Miami Beach")
                .findHotel()
                .selectHotelCard(0);

        assertNotNull("The number of results must be greater than 0", hotel);
        assertEquals("Faena Hotel Miami Beach",hotel.getHotelNameText());

    }



}
