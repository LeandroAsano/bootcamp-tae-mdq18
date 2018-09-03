package com.bootcamp.mdq.page.components.cheapticketshomepagecomponents;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.CheapTicketsHotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketsHome extends BasePage {

    @FindBy(id="primary-header-hotel")
    private WebElement hotelbutton;

    private CheapTicketsHotels cheapTicketsHotels;

    private static final String HOME_URL = "https://www.cheaptickets.com/";

    public CheapTicketsHome() {
        super();
        this.cheapTicketsHotels = new CheapTicketsHotels();
    }

    public CheapTicketsHotels initHotelReservationTest(){
        navigate(HOME_URL);
        click(hotelbutton);
        return cheapTicketsHotels;
    }


    /**
     *  CALENDARIO : COMPONENTE REUTILIZABLE
     *  - ABSTRAER.
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
