package com.bootcamp.mdq.tests.web.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.web.WebPage;

public class CheapTicketsHotels extends WebPage {

    private GoingToSearchBar goingToSearchBar;

    public CheapTicketsHotels() {
        super();
        this.goingToSearchBar = new GoingToSearchBar();
    }

    public GoingToSearchBar getGoingToSearchBar(){
        return this.goingToSearchBar;
    }



}
