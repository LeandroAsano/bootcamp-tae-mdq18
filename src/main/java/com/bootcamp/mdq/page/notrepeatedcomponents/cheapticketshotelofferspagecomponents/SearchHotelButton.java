package com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelpagecomponents.SearchButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class SearchHotelButton extends BasePage {

    @FindBy(id = "hotelNameGoBtn")
    private WebElement clickeable;

    public void clickOn(){
        click(clickeable);
        waitPageLoad();
        int i;
    }
}
