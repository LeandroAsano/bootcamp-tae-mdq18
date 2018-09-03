package com.bootcamp.mdq.page.hotel;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.results.ResultsSearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Hotel extends BasePage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement destinationInput;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkinDate;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkoutDate;

    @FindBy(id = "hotel-rooms-hlp")
    private Select roomsSelect;

    @FindBy(id = "hotel-1-adults-hlp")
    private Select adultsSelect;

    @FindBy(id = "hotel-1-children-hlp")
    private Select childrenSelect;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private Select childrenAge;

    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement searchBtn;

    public Hotel destination(String destination){
        type(destinationInput, destination);

        return this;
    }
    public Hotel checkIn(int day){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(checkinDate,(LocalDate.now().plusDays(day).format(format)));

        return this;
    }

    public Hotel checkOut(int day){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(checkoutDate,(LocalDate.now().plusDays(day).format(format)));

        return this;
    }
    public Hotel rooms(int rooms){
        selectByText((WebElement) roomsSelect, String.valueOf(rooms));

        return this;
    }
    public Hotel adults(int adults){
        selectByText((WebElement) adultsSelect, String.valueOf(adults));

        return this;
    }
    public Hotel childs(int childs){
        selectByText((WebElement) childrenSelect, String.valueOf(childs));

        return this;
    }
    public Hotel childsAge(int age){
        if (age == 0) {
            selectByText((WebElement) childrenAge,"Under 1");
        }
        else {
            selectByText((WebElement) childrenAge, String.valueOf(age));
        }

        return this;
    }

    public ResultsSearchHotel search(){
        click(searchBtn);

        return new ResultsSearchHotel();
    }
}
