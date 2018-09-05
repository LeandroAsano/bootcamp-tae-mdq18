package com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Yo on 3/9/2018.
 */
public class CheapTicketsHotelsOffersPage {

   private SearchBar searchBar;


    public CheapTicketsHotelsOffersPage() {
        this.searchBar = new SearchBar();
    }

    public SearchBar useSearchBar(){
        return this.searchBar;
    }


    public HotelCardList getHotelsList(){
        return new HotelCardList();
    }

}
