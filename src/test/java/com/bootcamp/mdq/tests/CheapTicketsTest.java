package com.bootcamp.mdq.tests;

import com.bootcamp.mdq.page.home.Home;

import com.bootcamp.mdq.page.results.ResultsSearchHotel;
import org.junit.Assert;
import org.junit.Test;

public class CheapTicketsTest extends BaseTestSuite {

    private Home home;

    @Test
    public void myTest() {

        home = new Home;

        ResultsSearchHotel result = home.header()
                .clickHotel()
                .destination("Miami Beach")
                .checkIn(4)
                .checkOut(20)
                .rooms(1)
                .adults(4)
                .childs(1)
                .childsAge(7)
                .search()
                .serchHotelName("Faena Hotel Miami Beach")
                .findHotel();

        Assert.assertFalse(ResultsSearchHotel.getResults().size() > 0);

    }
}