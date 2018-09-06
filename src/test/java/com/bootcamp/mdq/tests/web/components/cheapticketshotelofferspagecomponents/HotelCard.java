package com.bootcamp.mdq.tests.web.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelCard extends WebComponent{

    @FindBy(tagName = "h3")
    private WebElement title;

    public HotelCard(WebElement container) {
        super(container);
    }

    public String getHotelName() {
        return getText(title);
    }


}
