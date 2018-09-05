package com.bootcamp.mdq.web.pages.hotels;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hotel extends WebPage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement destinationInput;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkinDate;

    @FindBy(id = "hotel-checkout-hlp")
    private WebElement checkoutDate;

    @FindBy(id = "hotel-rooms-hlp")
    private WebElement roomsSelect;

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement adultsSelect;

    @FindBy(id = "hotel-1-children-hlp")
    private WebElement childrenSelect;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private WebElement childrenAgeSelect;

    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement searchBtn;

    public Hotel destination(String destination){
        type(destinationInput, destination);
        return this;
    }

    public Hotel checkIn(int daysAhead){
        //BONUS to do: create the component DatePicker, and click the date on the calendar
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(checkinDate,(LocalDate.now().plusDays(daysAhead).format(format)));
        return this;
    }

    public Hotel checkOut(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(checkoutDate,(LocalDate.now().plusDays(daysAhead).format(format)));
        return this;
    }

    public Hotel rooms(int rooms){
        selectByText(roomsSelect, String.valueOf(rooms));
        return this;
    }

    public Hotel adults(int adults){
        selectByText(adultsSelect, String.valueOf(adults));
        return this;
    }

    public Hotel childs(int childs){
        selectByText(childrenSelect, String.valueOf(childs));
        return this;
    }

    public Hotel childsAge(int age){
        if (age == 0) {
            selectByText(childrenAgeSelect,"Under 1");
        }
        else {
            selectByText(childrenAgeSelect, String.valueOf(age));
        }
        return this;
    }

    public HotelResult search(){
        click(searchBtn);
        return new HotelResult();
    }

}
