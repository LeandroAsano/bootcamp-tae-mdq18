package components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PayPage;

public class RoomList extends WebComponent {

    @FindBy(className = "book-button-wrapper")
    WebElement reserveBtn;

    public RoomList(WebElement container) {
        super(container);
    }

    public PayPage clickReserve(){
        click(reserveBtn);
        return new PayPage();
    }
}