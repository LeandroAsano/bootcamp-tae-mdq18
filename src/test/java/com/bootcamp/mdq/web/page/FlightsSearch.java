package com.bootcamp.mdq.web.page;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.page.component.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsSearch extends WebPage {

    @FindBy(id = "flight-origin-flp")
    private WebElement flightOriginInput;

    @FindBy(id = "flight-destination-flp")
    private WebElement flightDestinationInput;

    @FindBy(id = "flight-departing-flp")
    private WebElement departureDateInput;

    @FindBy(id = "flight-returning-flp")
    private WebElement returningDateInput;

    @FindBy(id = "flight-adults-flp")
    private WebElement adultsSelect;

    @FindBy(className = "datepicker-cal")
    private WebElement datePickerContainer;

    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement searchButton;

    private DatePicker datePicker;

    public FlightsSearch() {
        this.datePicker = new DatePicker(datePickerContainer);
    }

    public FlightsSearch setOriginLocation(String location) {
        type(flightOriginInput, location);
        return this;
    }

    public FlightsSearch setDestinationLocation(String location) {
        type(flightDestinationInput, location);
        return this;
    }

    public DatePicker setDepartingDate() {
        click(departureDateInput);
        return datePicker;
    }

    public DatePicker setReturningDate() {
        click(returningDateInput);
        return datePicker;
    }

    public FligthsResults searchFlights() {
        click(searchButton);
        return new FligthsResults();
    }


}
