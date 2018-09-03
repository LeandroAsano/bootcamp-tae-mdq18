package com.bootcamp.mdq.page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class RoomCard extends BaseComponent {

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
