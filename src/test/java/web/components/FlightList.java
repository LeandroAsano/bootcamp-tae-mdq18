package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightList extends WebComponent {

    @FindBy(css = "li.flight-module")
    private List<WebElement> flightCardList;

    public FlightList(WebElement container) {
        super(container);
    }

    public CardFlight selectCard(int position){
        return new CardFlight(flightCardList.get(position));
    }
}
