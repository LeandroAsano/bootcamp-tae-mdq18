package page;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.component.RoomCard;

import java.util.List;

public class Reservation extends WebPage {

    @FindBy(css = ".room.room-above-fold")
    private List<WebElement> roomOptions;

    public RoomCard selectRoom(int index) {
        Waits.areVisible(roomOptions);
        return new RoomCard(roomOptions.get(index));
    }
}
