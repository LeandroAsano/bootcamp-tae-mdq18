package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.web.pages.flights.Flight;
import com.bootcamp.mdq.web.pages.hotels.Hotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


/**
 * Created by Matias on 30/08/2018.
 */
public class DatePicker extends WebComponent {

    @FindBy(css = "datepicker-next")
    private WebElement nextMonthBtn;

    @FindBy(css = "datepicker-prev")
    private WebElement prevMonthBtn;

    @FindBy(css = "button.datepicker-cal-date")
    private List<WebElement> daysList;

    private int day;
    private int month;
    private int year;

    public DatePicker(WebElement container) {
        super(container);
    }

    public DatePicker selectDaysAhead(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = LocalDate.now().plusDays(daysAhead).format(format);
        String[]arr = date.split("/");
        day = Integer.parseInt(arr[1]);
        month = Integer.parseInt(arr[0]);
        year = Integer.parseInt(arr[2]);
        int actualMonth = LocalDate.now().getMonthValue();
        if(month<actualMonth){
            clickNextMonthBtn(12-actualMonth+month);
        }
        else{
            clickNextMonthBtn(actualMonth-month);
        }
        return this;
    }


    public Flight clickFlightDate(){
        click(daysList.get(day-1));
        return new Flight();
    }

    public Hotel clickHotelDate(){
        click(daysList.get(day-1));
        return new Hotel();
    }

    public DatePicker clickNextMonthBtn(int times){
        for(int i=0;i<times;i++){
            click(nextMonthBtn);
        }
        return this;
    }


}
