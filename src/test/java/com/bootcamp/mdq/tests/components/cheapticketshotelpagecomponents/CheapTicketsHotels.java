package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents;

public class CheapTicketsHotels extends BasePage {

    private GoingToSearchBar goingToSearchBar;

    public CheapTicketsHotels() {
        super();
        this.goingToSearchBar = new GoingToSearchBar();
    }

    public GoingToSearchBar getGoingToSearchBar(){
        return this.goingToSearchBar;
    }



}
