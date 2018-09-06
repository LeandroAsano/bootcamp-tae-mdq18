package com.bootcamp.mdq.tests.web.components.cheapticketshomepagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.tests.web.components.cheapticketshotelpagecomponents.CheapTicketsHotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketsHome extends WebPage {

    @FindBy(id="primary-header-hotel")
    private WebElement hotelbutton;

    private CheapTicketsHotels cheapTicketsHotels;

    private static final String HOME_URL = "https://www.cheaptickets.com/";

    public CheapTicketsHome() {
        super();
        this.cheapTicketsHotels = new CheapTicketsHotels();
    }

    public CheapTicketsHotels initHotelReservationTest(){
        goTo(HOME_URL);
        click(hotelbutton);
        return cheapTicketsHotels;
    }
}
