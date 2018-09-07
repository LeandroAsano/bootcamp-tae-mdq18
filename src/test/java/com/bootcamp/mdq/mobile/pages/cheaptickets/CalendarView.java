package com.bootcamp.mdq.mobile.pages.cheaptickets;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.time.LocalDate;

public class CalendarView extends MobilePage {

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'next month'])]")
    private MobileElement nextMonthButton;

    public CalendarView goToMonth(int month) {
        int currentMonth = LocalDate.now().getMonthValue();
        int numberMovements = 0;

        if (month < currentMonth) {
            numberMovements = currentMonth - month;
        } else {
            numberMovements = month - currentMonth;
        }

        for (int i = 0; i < numberMovements; i++) {
            click(nextMonthButton);
        }

        return this;
    }



}
