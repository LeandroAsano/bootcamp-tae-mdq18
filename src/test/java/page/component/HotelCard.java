package page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import page.Reservation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends WebComponent {

    @FindBy(css = "a.flex-link")
    private WebElement hotelName;

    public HotelCard(WebElement container) {
        super(container);
    }

    public Reservation selectHotel() {
        switchNewTabHandle(hotelName);
        return new Reservation();
    }

    public String getHotelName() {
        return hotelName.getText();
    }

}
