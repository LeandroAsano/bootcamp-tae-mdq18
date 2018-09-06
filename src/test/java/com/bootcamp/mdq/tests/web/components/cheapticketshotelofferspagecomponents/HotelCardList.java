package com.bootcamp.mdq.tests.web.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.tests.web.components.ReserveRoomPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.waits.Waits.*;
import static java.lang.String.format;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelCardList extends WebPage {

    @FindBy(css = ".hotel.listing")
    private List<WebElement> allHotels;

    @FindBy(className = "flex-link-wrap")
    private WebElement hotelCardContainer;

    @FindBy(id = "modalInterstitial")
    private WebElement refresherResultsModalLoading;

    public HotelCard getSpecificHotel(String criteria){
        isNotVisible(refresherResultsModalLoading);
        for (WebElement w: allHotels) {
            HotelCard card = new HotelCard(w);
            if (card.getHotelName().equals(criteria)){
                return card;
            }
        }
        throw new RuntimeException(format("Unable to find hotel result with the required criteria as %s", criteria));
    }

    public ReserveRoomPage getFirstHotel(){
        System.out.println("hoteles: " + allHotels.size());
        click(allHotels.get(0));
        changeToLastTab();
        return new ReserveRoomPage();
    }
}
