package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.ResultsFlights;

public class CardFlight extends WebComponent {

    @FindBy(css = "button.btn-secondary.btn-action.t-select-btn")
    private WebElement selectBtn;

    @FindBy(id = "xSellHotelForcedChoice")
    private WebElement sellModal;

    public CardFlight(WebElement container) {
        super(container);
    }

    public ResultsFlights selectFlight(){
        click(selectBtn);
        return new ResultsFlights();
    }
}
