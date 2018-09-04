package com.bootcamp.mdq.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Created by Matias on 30/08/2018.
 */
public class DatePicker extends WebComponent {

    @FindBy(css = "datepicker-next")
    private WebElement nextMonthBtn;

    @FindBy(css = "datepicker-prev")
    private WebElement prevMonthBtn;

    private int day;
    private int month;
    private int year;

    public DatePicker(WebElement container) {
        super(container);
    }

    public void setDate(int daysAhead){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = LocalDate.now().plusDays(daysAhead).format(format);
        String[]arr = date.split("/");
        day = Integer.parseInt(arr[0]);
        month = Integer.parseInt(arr[1]);
        year = Integer.parseInt(arr[2]);
    }

    public DatePicker selectDate(String date){
        setDate(date);

        return this;
    }

    public DatePicker clickNextMonthBtn(){
        click(nextMonthBtn);
        return this;
    }

    public DatePicker clickNextMonthBtn(int times){
        for(int i=0;i<times;i++){
            click(nextMonthBtn);
        }
        return this;
    }


}
