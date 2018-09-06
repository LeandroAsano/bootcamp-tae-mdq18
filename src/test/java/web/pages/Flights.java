package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.String.valueOf;

public class Flights extends WebPage {

    @FindBy(id="flight-origin-flp")
    private WebElement fromInput;

    @FindBy (id="flight-destination-flp")
    private WebElement toInput;

    @FindBy (id="flight-departing-flp")
    private WebElement  deperturingDate;

    @FindBy (id="flight-returning-flp")
    private WebElement  returingDate;

    @FindBy (id="flight-adults-flp")
    private WebElement adultsSelect;

    @FindBy(css = "btn-primary btn-action gcw-submit ")
    private WebElement searchBtn;


    public Flights(){
        super();
    }

    public Flights typeOrigin(String origin){
        type(fromInput, origin);
        return this;
    }

    public Flights typeDestination(String destination){
        type(toInput, destination);
        return this;
    }

    public Flights depertureDate(int day){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(deperturingDate,(LocalDate.now().plusDays(day).format(format)));
        return this;
    }

    public Flights returningDate(int day){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        type(returingDate,(LocalDate.now().plusDays(day).format(format)));
        return this;
    }

    public Flights setAdults(int adults){
        selectByText(adultsSelect, valueOf(adults));
        return this;
    }

    public ResultsFlights searchFlight(){
        click(searchBtn);
        return new ResultsFlights();
    }

}
