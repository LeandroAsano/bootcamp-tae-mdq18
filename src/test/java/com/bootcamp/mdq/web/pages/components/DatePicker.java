package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//deberia extender de baseComponent pero no encontaba forma de pasarle el contenedor al constructor y que funcionara
public class DatePicker extends WebPage {

    //next month button
    @FindBy(className = "datepicker-next")
    private WebElement nextButton;

    //Available days of month
    @FindBy(className = "datepicker-cal-date")
    private List<WebElement> dayOfMonth;

    @FindBy(className = "datepicker-close-btn")
    private WebElement close;


    public DatePicker() {
        super();
    }

    /***
     * Obtain a list of string over the list of web elements
     * @return The available dates
     */

    public List<String> getDaysOfMonth(){
        List<String> dates=new ArrayList<String>();
        for (WebElement day: dayOfMonth){
            dates.add(day.getText());
        }
        return dates;
    }

    public void pickADayOnTheCalendar(int month, int day){
        List<String> aux= getDaysOfMonth();
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        click(dayOfMonth.get(aux.indexOf(months[month].concat("\n").concat(String.valueOf(day)))));
    }

    /**
     *
     * @param range is the number of days for adding to the today´s date
     */
    public void clickOnAValidDateOnTheCalendar(int range){

        Calendar today=Calendar.getInstance();
        today.add(Calendar.DAY_OF_MONTH, range);
        pickADayOnTheCalendar(today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
    }

}
