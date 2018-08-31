package com.bootcamp.mdq.page;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.notrepeatedcomponents.GoingToSearchBar;

public class CheapTicketsHotels extends BasePage{

    private GoingToSearchBar goingToSearchBar;

    public CheapTicketsHotels() {
        super();
        this.goingToSearchBar = new GoingToSearchBar();
    }

    public GoingToSearchBar getGoingToSearchBar(){
        return this.goingToSearchBar;
    }
}
