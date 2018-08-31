package com.bootcamp.mdq.tests.cheapTickectTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.CommonOperations;
import com.bootcamp.mdq.page.component.HotelCard;
import com.bootcamp.mdq.page.pages.Home;
import com.bootcamp.mdq.page.pages.HotelPage;
import com.bootcamp.mdq.page.pages.Hotels;
import com.bootcamp.mdq.page.pages.ResultsOfSearch;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class CheckHotelsFuncionality extends BaseTestSuite {

    private Home home;

    @Test
    public void goingToHotelsPageTest(){

        home=new Home();

        Hotels hotel=home.navegationBar().clickOnHotel();
        type(hotel.getGoinTofield(), "Miami Beach");
        click(hotel.banner());
        setNumerOf(hotel.amountOfAdults(), "4");

        hotel.checkInDate().clear();
        type(hotel.checkInDate(), "09/18/2018");

        setNumerOf(hotel.amountOfChilden(), "1");
        setNumerOf(hotel.child1Age(), "7");

        //hotel.checkOutDate().clear();
        //type(hotel.checkOutDate(), "09/28/2018");
        ResultsOfSearch res= hotel.clickOnSearch();
        //Assert.assertTrue();
        type(res.getPropertyNameField(), "Faena Hotel Miami beach");
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
