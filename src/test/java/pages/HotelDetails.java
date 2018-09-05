package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetails {

    @FindBy(css = "btn-sub-action book-button btn-pwa")
    private WebElement ReserveBtn;
}