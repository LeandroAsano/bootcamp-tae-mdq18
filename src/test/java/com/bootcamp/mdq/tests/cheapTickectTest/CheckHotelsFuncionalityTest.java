package com.bootcamp.mdq.tests.cheapTickectTest;

import com.bootcamp.mdq.page.pages.Home;
import com.bootcamp.mdq.page.pages.Hotels;
import com.bootcamp.mdq.page.pages.SearchResults;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;

public class CheckHotelsFuncionalityTest extends BaseTestSuite {

    private Home home;

    @Test
    public void goingToHotelsPageTest(){

        home=new Home();

        Hotels hotel=home.navegationBar().clickOnHotel();
        hotel.typeHotelName("Miami Beach");
        hotel.clickOnBanner();
        hotel.setAmountOfAdults("4");
        hotel.setCheckInDate("09/18/2018");
        //hotel.setCheckOutDate("09/28/2018");
        hotel.setAmountOfChilden("1");
        hotel.setChildrenAge("7");
        SearchResults resultPage= hotel.clickOnSearch();

        resultPage.searchOnPropertyNameFild("Faena Miami Beach");


        resultPage.clickOnSearchButton();

        resultPage.clickOnItem(0);
//        Assert.assertTrue(resultPage.isEmpthyResult());








      //  type(res.getPropertyNameField(), "Faena Hotel Miami beach");
        //HotelPage hs= res.clickOnItem(1);


    }
/*
    @Test
    public boolean validateNameOnTheResultsLista(List<WebElement> list, String propertyName){
        boolean control=true;
        //for( WebElement x : list && control==true) {
           // propertyName.matches()
          // propertyName.(((HotelCard) x).getHotelName());
       //}
       return control;
    }*/










}
