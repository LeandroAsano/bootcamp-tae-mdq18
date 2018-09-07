package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.cheaptickets.CheapTicketsHome;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

public class CheapTicketsOperations extends BaseTestSuite {

    private CheapTicketsHome cheapTicketsHome;

    @Before
    public void setupCheapTicketsOperations() {
        this.cheapTicketsHome = new CheapTicketsHome();
    }

    @Test
    public void openCheapTickets() {
        cheapTicketsHome.closeLogin()
                .acceptPopupMessage()
                .switchToShopTravel()
                .switchToHotelsSearch()
                .enterLocation("Miami Beach")
                .selectSuggestedLocation(0);
    }
}
