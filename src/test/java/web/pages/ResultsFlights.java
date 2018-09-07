package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.components.FlightList;
import web.components.SellModal;
import static com.bootcamp.mdq.waits.Waits.isVisible;
import static com.bootcamp.mdq.waits.Waits.notVisible;

public class ResultsFlights extends WebPage {

    @FindBy(id = "flight-listing-container")
    private WebElement flightList;

    @FindBy(id = "xSellHotelForcedChoice")
    private WebElement sellModal;

    public FlightList getResultList(){
        isVisible(flightList);
        return new FlightList(flightList);
    }

    public SellModal SellModal(){
        return new SellModal(sellModal);
    }
}
