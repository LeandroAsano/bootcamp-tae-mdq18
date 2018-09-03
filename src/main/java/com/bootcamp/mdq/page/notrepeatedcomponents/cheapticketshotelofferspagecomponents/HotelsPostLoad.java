package com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.BasePage;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelsPostLoad extends BasePage{
    @FindBy(css = "flex-link")
    private List<WebElement> allHotels;

    public HotelCard getFirstHotel(){
        waitPageLoad();
        System.out.println("SIZE:" + allHotels.size());
        for (WebElement w:
                allHotels) {
            System.out.println(w.getText());
            click(w);
        }
        System.out.println("llego");
        System.out.println("a");
        return new HotelCard();
    }
}
