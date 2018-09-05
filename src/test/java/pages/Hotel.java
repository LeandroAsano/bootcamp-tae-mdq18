package pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.String.valueOf;


public class Hotel extends WebPage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement destinationInput;

    @FindBy(className = "Close")
    private WebElement close;

    @FindBy(id = "hotel-checkin-hlp")
    private WebElement checkinDate;

    @FindBy(id = "hotel-checkout-hlp")
    private WebElement checkoutDate;

    @FindBy(id = "hotel-rooms-hlp")
    private WebElement roomsSelect;

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement adultsSelect;

    @FindBy(id = "hotel-1-children-hlp")
    private WebElement childrenSelect;

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private WebElement childrenAge;

    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement searchBtn;

    public Hotel destination(String destination){
        type(destinationInput, destination);
        return this;
    }

    public Hotel close(){
        click(close);
        return this;
    }
    public Hotel checkIn(int day){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(checkinDate,(LocalDate.now().plusDays(day).format(format)));
        return this;
    }

    public Hotel checkOut(int day){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(checkoutDate,(LocalDate.now().plusDays(day).format(format)));
        return this;
    }
    public Hotel rooms(int rooms){
        selectByText(roomsSelect, valueOf(rooms));
        return this;
    }
    public Hotel selectAdults(int adults){
        selectByText(adultsSelect, valueOf(adults));
        return this;
    }
    public Hotel childs(int childs){
        selectByText(childrenSelect, valueOf(childs));
        return this;
    }
    public Hotel childsAge(int age){
        if (age == 0) {
            selectByText(childrenAge,"Under 1");
        }
        else {
            selectByText(childrenAge, valueOf(age));
        }
        return this;
    }

    public ResultsSearchHotel search(){
        click(searchBtn);
        return new ResultsSearchHotel();
    }
}
