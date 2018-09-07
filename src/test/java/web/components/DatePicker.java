package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.Flights;
import web.pages.Hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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

    public DatePicker selectDays(int days){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = LocalDate.now().plusDays(days).format(format);
        String[]arr = date.split("/");

        day = Integer.parseInt(arr[1]);
        month = Integer.parseInt(arr[0]);
        year = Integer.parseInt(arr[2]);
        int actualMonth = LocalDate.now().getMonthValue();

        if(month<actualMonth){
            clickNextMonth(12-actualMonth+month);
        }
        else{
            clickNextMonth(actualMonth-month);
        }
        return this;
    }

    public DatePicker clickNextMonth(int times){
        for(int i=0;i<times;i++){
            click(nextMonthBtn);
        }
        return this;
    }

    public Hotel hotelDate(){
        click(daysList.get(day-1));
        return new Hotel();
    }

    public Flights flightDate(){
        click(daysList.get(day-1));
        return new Flights();
    }
}
