package page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RoomCard extends WebComponent {

    @FindAll({
            @FindBy(className = ".rate-plan.rate-plan-first"),
            @FindBy(className = ".rate-plan")
    })
    private List<RoomOption> roomPlans;

    public RoomCard(WebElement container) {
        super(container);
    }

    public RoomOption bookRoom(int index) {
        return roomPlans.get(index);
    }
}
