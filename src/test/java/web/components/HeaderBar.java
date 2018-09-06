package web.components;


import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.Flights;
import web.pages.Hotel;

public class HeaderBar extends WebComponent {

    @FindBy(id = "primary-header-hotel")
    private WebElement hotelLink;

    @FindBy(id = "primary-header-flight")
    private WebElement flightLink;

    public HeaderBar(WebElement container) {
        super(container);
    }

    public Hotel clickHotel(){
        click(hotelLink);
        return new Hotel();
    }

    public Flights clickFligths(){
        click(flightLink);
        return new Flights();
    }
}