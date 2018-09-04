package com.bootcamp.mdq.pages.flights;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.pages.components.FlightResultList;
import com.bootcamp.mdq.pages.components.HotelSellModal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Matias on 03/09/2018.
 */
public class FlightResult extends BasePage {

    @FindBy(id = "pi-interstitial")
    private WebElement loadingBar;

    @FindBy(id = "flight-listing-container")
    private WebElement flightList;

    @FindBy(css = "span.title-city-text")
    private WebElement titleCitySpan;

    @FindBy(id = "xSellHotelForcedChoice")
    private WebElement hotelSellModal;

    public FlightResultList getResultList(){
        waitUntilInvisibility(loadingBar);
        return new FlightResultList(flightList);
    }

    public HotelSellModal hotelSellModal(){
        return new HotelSellModal(hotelSellModal);
    }

    public String getTitleCitySpanText(){
        return getText(titleCitySpan);
    }




}
