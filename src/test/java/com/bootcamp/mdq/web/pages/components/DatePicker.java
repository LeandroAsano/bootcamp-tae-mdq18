package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//deberia extender de baseComponent pero no encontaba forma de pasarle el contenedor al constructor y que funcionara
public class DatePicker extends WebPage {

    private int numberOfAvailableMonths;

    //next month button
    @FindBy(className = "datepicker-next")
    private WebElement nextButton;


    //Available days of month
    @FindBy(className = "datepicker-cal-date")
    private List<WebElement> dayOfMonth;


    /**
     * @param numberOfAvailableMonths is the number of times that i can click on the next button (it cant be usefull for check the availabe date)
     */
    public DatePicker(int numberOfAvailableMonths) {
        super();
        this.numberOfAvailableMonths = numberOfAvailableMonths;
    }

    private DatePicker clickOnNext() {
        click(nextButton);
        return this;
    }

    private DatePicker clickOnNext(int times) {
        for (int x = 0; x < times; x++) {
            clickOnNext();
        }
        return this;
    }

    /***
     * Obtain a list of string over the list of web elements
     * @return The available dates
     */

    private List<String> getDaysOfMonth() {
        List<String> dates = new ArrayList<String>();
        for (WebElement day : dayOfMonth) {
            dates.add(day.getText());
        }
        return dates;
    }

    /**
     * Choose a date on the calendar always after to today date! Don´t check if that date is available
     *
     * @param month Month to select
     * @param day   Day of the month to select
     * @return Da
     */

    public DatePicker pickADayOnTheCalendar(int year, int month, int day, boolean nextButton) {

        Calendar today = Calendar.getInstance();
        int actualMonth = today.get(Calendar.MONTH);
        int actualYear = today.get(Calendar.YEAR);
        int diference = 0;

        if (nextButton) {
            if (actualYear <= year) {
                diference = month - (actualMonth + 1);
            } else {
                diference = (11 - actualMonth) + (month - 1);

            }
        } else {
            diference = 0;
        }

        clickOnNext(diference);
        List<String> aux = getDaysOfMonth();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        click(dayOfMonth.get(aux.indexOf(months[month - 1].concat("\n").concat(String.valueOf(day)))));
        return this;
    }


}
