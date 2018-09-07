package com.bootcamp.mdq.web.page.Hotels;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.page.SearchHotelsResults;
import com.bootcamp.mdq.web.page.component.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotels extends WebPage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement destinationInput;

    @FindBy(css = "[aria-label= \"Close\"]")
    private WebElement closeSuggestionButton;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkInDateInput;

    @FindBy(id = "hotel-checkout-hlp")
    private WebElement checkOutDateInput;

    @FindBy(className = "datepicker-cal")
    private WebElement datePickerContainer;

    @FindBy(id = "hotel-rooms-hlp")
    private WebElement roomsSelect;

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement adultsSelect;

    @FindBy(id = "hotel-1-children-hlp")
    private WebElement childrenSelect;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private WebElement child1AgeSelect;

    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement searchButton;

    private DatePicker datePicker;

    public Hotels() {
        this.datePicker = new DatePicker(datePickerContainer);
    }

    public Hotels setDestination(String destination) {
        type(destinationInput, destination);
        return this;
    }

    public Hotels closeSuggestDestinationDropdown() {
        click(closeSuggestionButton);
        return this;
    }

    public DatePicker setCheckinByCalendar() {
        click(checkInDateInput);
        return datePicker;
    }

    public DatePicker setCheckoutByCalendar() {
        click(checkOutDateInput);
        return datePicker;
    }

    public Hotels selectNumberRooms(String value) {
        selectDropdown(roomsSelect, value);
        return this;
    }

    public Hotels selectNumberAdults(String value) {
        selectDropdown(adultsSelect, value);
        return this;
    }

    public Hotels selectNumberChildrens(String value) {
        selectDropdown(childrenSelect, value);
        return this;
    }

    public Hotels selectChildAge(String age){
        selectDropdown(child1AgeSelect, age);
        return this;
    }

    public SearchHotelsResults searchHotels() {
        click(searchButton);
        return new SearchHotelsResults();
    }

}
