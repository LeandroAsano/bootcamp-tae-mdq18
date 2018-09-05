package pages;

import com.bootcamp.mdq.page.web.WebPage;
import components.RoomList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.waits.Waits.areVisible;

public class HotelDetails extends WebPage {

    @FindBy (css = "tbody.room")
    List<WebElement> avaliableRooms;

    public HotelDetails() {
    }

    public PayPage clickOnItem(int item){
        areVisible(avaliableRooms);
        return (new RoomList(avaliableRooms.get(item - 1))).clickReserve();
    }
}
