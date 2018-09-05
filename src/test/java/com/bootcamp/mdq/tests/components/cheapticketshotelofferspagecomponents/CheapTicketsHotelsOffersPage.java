package com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents;

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
}
