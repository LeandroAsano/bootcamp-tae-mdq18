package com.bootcamp.mdq.page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



/**
 * Created by Matias on 30/08/2018.
 */
public class DatePicker extends BaseComponent {

    @FindBy(css = "datepicker-next")
    private WebElement nextMonthBtn;

    @FindBy(css = "datepicker-prev")
    private WebElement prevMonthBtn;

    public DatePicker(WebElement container) {
        super(container);
    }

    public DatePicker clickDate(String date){

        return this;
    }
}
