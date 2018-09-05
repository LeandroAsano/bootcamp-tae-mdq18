package components;


import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Hotel;

public class HeaderBar extends WebComponent {

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelLink;

    public HeaderBar(WebElement container) {
        super(container);
    }

    public Hotel clickHotel() {
        click(hotelLink);

        return new Hotel();
    }
}