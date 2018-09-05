package com.bootcamp.mdq.web.page.component;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RoomCard extends WebComponent {

    @FindAll({
            @FindBy(css = ".rate-plan.rate-plan-first"),
            @FindBy(css = ".rate-plan")
    })
    private List<WebElement> roomPlans;

    public RoomCard(WebElement container) {
        super(container);
    }

    public RoomOption bookRoom(int index) {
        return new RoomOption(roomPlans.get(index));
    }
}
