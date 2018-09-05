package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Matias on 03/09/2018.
 */
public class FlightResultList extends WebComponent {

    @FindBy(css = "li.flight-module")
    private List<WebElement> flightCardList;

    public FlightResultList(WebElement container) {
        super(container);
    }

    public FlightCard selectCard(int position){
        return new FlightCard(flightCardList.get(position));
    }

}
