package components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HotelDetails;

public class CardHotel extends WebComponent {

    @FindBy(css = "a.flex-link")
    private WebElement hotelName;

    public CardHotel(WebElement container) {
        super(container);
    }

    public HotelDetails clickHotelName(){
        click(hotelName);

        return new HotelDetails();
    }
}
