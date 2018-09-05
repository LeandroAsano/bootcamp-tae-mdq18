package com.bootcamp.mdq.web.pages.flights;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.FlightSearchForm;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 04/09/2018.
 */
public class Flight extends WebPage {

    @FindBy(id = "gcw-flights-form-flp")
    private WebElement flightSearchForm;

    public FlightSearchForm searchFlight(){
        return new FlightSearchForm(flightSearchForm);
    }
}
