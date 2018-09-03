package com.bootcamp.mdq.page.Hotels;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.SearchHotelsResults;
import com.bootcamp.mdq.page.component.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.util.List;

public class Hotels extends BasePage {

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
    private WebElement childrensSelect;

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

    // use LocalDate
    public Hotels setCheckinDate(LocalDate date) {
        setDate(checkInDateInput, date);
        return this;
    }

    public DatePicker setChekinByCalendar() {
        click(checkInDateInput);
        return datePicker;
    }

    public Hotels setCheckoutDate(LocalDate date) {
        setDate(checkOutDateInput, date);
        return this;
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
        selectDropdown(childrensSelect, value);
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
