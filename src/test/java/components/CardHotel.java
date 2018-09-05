package components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HotelDetails;

public class CardHotel extends WebComponent {

    @FindBy(css = "article h3")
    private WebElement hotelName;

    @FindBy(css = "a.flex-link")
    private WebElement hotelLink;

    public CardHotel(WebElement container) {
        super(container);
    }

    public HotelDetails clickHotelName(){
        click(hotelLink);
        return new HotelDetails();
    }

    public String getHotelName() {
        return getText(hotelName);
    }
}
