package com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.BasePage;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelCardList extends BasePage {


    public HotelCard getFirstHotel(){
        waitPageLoad();
        return new HotelsPostLoad().getFirstHotel();

    }
}
