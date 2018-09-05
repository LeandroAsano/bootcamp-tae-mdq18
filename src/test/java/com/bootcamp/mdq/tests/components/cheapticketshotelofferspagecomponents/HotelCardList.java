package com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.tests.components.ReserveRoomPage;
import com.google.common.collect.Iterables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static com.bootcamp.mdq.waits.Waits.*;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelCardList extends WebPage {

    @FindBy(css = "article.hotel")
    private List<WebElement> allHotels;

    @FindBy(id = "modalInterstitial")
    private WebElement refresherResultsModalLoading;

    public HotelCard getSpecificHotel(String criteria){
        isNotVisible(refresherResultsModalLoading);
        pageReady();
        jsWait();
        for (WebElement w: allHotels) {
            if(w.getText().contains(criteria)){
                return new HotelCard(criteria);
            }
        }
        return new HotelCard();

    }

    public ReserveRoomPage getFirstHotel(){
        System.out.println("hoteles: " + allHotels.size());
        click(allHotels.get(0));
        changeToLastTab();
        return new ReserveRoomPage();
    }
}
