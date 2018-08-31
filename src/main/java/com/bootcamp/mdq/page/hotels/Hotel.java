package com.bootcamp.mdq.page.hotels;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.results.Result;
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
    private Select childrenAgeSelect;

    @FindBy(css = "[data-gcw-submit-text='Search']")
    private WebElement searchBtn;

    public Hotel destination(String destination){
        destinationInput.sendKeys(destination);
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
        roomsSelect.selectByValue(String.valueOf(rooms));
        return this;
    }

    public Hotel adults(int adults){
        adultsSelect.selectByValue(String.valueOf(adults));
        return this;
    }

    public Hotel childs(int childs){
        childrenSelect.selectByValue(String.valueOf(childs));
        return this;
    }

    public Hotel childsAge(int age){
        if (age == 0) {
            childrenAgeSelect.selectByValue("Under 1");
        }
        else {
            childrenAgeSelect.selectByValue(String.valueOf(age));
        }
        return this;
    }

    public Result search(){
        click(searchBtn);
        return new Result();
    }

}
