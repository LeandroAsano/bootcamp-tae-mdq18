package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents.calendarworkflow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yo on 2/9/2018.
 */
public class CalendarPage extends BasePage{

    @FindBy(className = "datepicker-day-number")
    private List<WebElement> days;


    public List<WebElement> getDays() {
        return days;
    }

    private static final List<String> monthsList() {
        List <String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        return Collections.unmodifiableList(list);
    }
}
