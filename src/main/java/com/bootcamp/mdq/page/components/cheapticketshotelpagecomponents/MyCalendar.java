package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.calendarworkflow.StayTime;
import com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.calendarworkflow.CalendarPage;
import com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.comboboxworkflow.AdultsComboBox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.time.LocalDate;


/**
 * Created by Yo on 2/9/2018.
 */
public class MyCalendar extends BasePage {


    @FindBy(name = "startDate")
    private WebElement checkInInputField;

    @FindBy(name = "endDate")
    private WebElement checkOutInputField;

    @FindBy(className = "datepicker-next")
    private WebElement changeMonthInput;

    private StayTime stayTime;

    private CalendarPage calendarPage;


    public MyCalendar(LocalDate checkInDate, int stayTimeByDays) {
        this.stayTime = new StayTime(checkInDate, stayTimeByDays);
        this.calendarPage = new CalendarPage();
    }

    public AdultsComboBox setCheckInDate() {
        String month = stayTime.getCheckInDate().getMonth().toString().toLowerCase();
        String day = Integer.toString(stayTime.getCheckInDate().getDayOfMonth());
        click(checkInInputField);
        click(datePick(month, day));
        month = stayTime.getCheckOutDate().getMonth().toString().toLowerCase();
        day = Integer.toString(stayTime.getCheckOutDate().getDayOfMonth());
        click(checkOutInputField);
        click(datePick(month,day));
        return new AdultsComboBox();
    }

    private WebElement datePick(String month, String day) {
        for (WebElement w : calendarPage.getDays()) {
            if ((w.getText().toLowerCase().contains(month) && (w.getText().contains(day)))) {
                return w;
            }
        }
        click(changeMonthInput);
        this.calendarPage = new CalendarPage();
        return datePick(month, day);
    }
}
