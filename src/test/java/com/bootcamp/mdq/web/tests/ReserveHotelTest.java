package com.bootcamp.mdq.web.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import com.bootcamp.mdq.web.pages.components.HotelCard;
import com.bootcamp.mdq.web.pages.home.Home;
import com.bootcamp.mdq.web.pages.hotels.HotelDetail;
import com.bootcamp.mdq.web.pages.hotels.HotelResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Matias on 07/09/2018.
 */
public class ReserveHotelTest extends BaseTestSuite {

    private Home home;

    @Before
    public void start(){
        home = new Home();
    }

    @Test
    public void reserveHotelCreditCardTest(){
        HotelDetail hotelDetail = home.header().clickHotel()
                .destination("Miami Beach")
                .checkIn().selectDaysAhead(3).clickHotelDate()
                .checkOut().selectDaysAhead(10).clickHotelDate()
                .rooms(1)
                .adults(1)
                .search()
                .selectHotelCard(0)
                .clickHotelName();

    }
}