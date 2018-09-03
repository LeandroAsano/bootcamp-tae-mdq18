package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.BasePage;

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
