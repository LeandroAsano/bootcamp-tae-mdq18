package com.bootcamp.mdq.pages.flights;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.pages.components.FlightResultList;
import com.bootcamp.mdq.pages.components.HotelSellModal;
import com.bootcamp.mdq.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.waitUntilInivisible;


/**
 * Created by Matias on 03/09/2018.
 */
public class FlightResult extends WebPage {

    @FindBy(id = "pi-interstitial")
    private WebElement loadingBar;

    @FindBy(id = "flight-listing-container")
    private WebElement flightList;

    @FindBy(css = "span.title-city-text")
    private WebElement titleCitySpan;

    @FindBy(id = "xSellHotelForcedChoice")
    private WebElement hotelSellModal;

    public FlightResultList getResultList(){
        waitUntilInivisible(loadingBar);
        return new FlightResultList(flightList);
    }

    public HotelSellModal hotelSellModal(){
        return new HotelSellModal(hotelSellModal);
    }

    public String getTitleCitySpanText(){
        return getText(titleCitySpan);
    }




}
