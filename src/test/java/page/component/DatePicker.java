package page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import page.Hotels.Hotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.util.List;

public class DatePicker extends WebComponent {

    @FindBy(className = "datepicker-next")
    private WebElement nextMonthButton;

    @FindBy(css = "button.datepicker-cal-date")
    private List<WebElement> daysButtons;

    public DatePicker(WebElement container) {
        super(container);
    }

    public DatePicker selectMonth(int month) {
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

    public Hotels selectDay(int day) {
        click(daysButtons.get(day - 1));
        return new Hotels();
    }


}
