package page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import page.Hotels.Hotels;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends WebComponent {

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelHeaderButton;

    public Header(WebElement container) {
        super(container);
    }

    public Hotels findHotels() {
        click(hotelHeaderButton);
        return new Hotels();
    }

}
