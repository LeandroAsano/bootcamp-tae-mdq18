package page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Reservation extends WebPage {

    @FindBy(css = "[data-view-type=\"RoomsAndRatesView\"]")
    private List<WebElement> roomOptions;

}
