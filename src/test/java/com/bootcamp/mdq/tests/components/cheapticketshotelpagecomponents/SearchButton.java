package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents.CheapTicketsHotelsOffersPage;
import com.bootcamp.mdq.tests.components.cheapticketshotelofferspagecomponents.HotelCardList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.js.Javascript.click;
import static com.bootcamp.mdq.waits.Waits.isNotVisible;
import static com.bootcamp.mdq.waits.Waits.jsWait;
import static com.bootcamp.mdq.waits.Waits.pageReady;

/**
 * Created by Yo on 3/9/2018.
 */
public class SearchButton extends WebPage {


    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement clickeable;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement filterHotels;

    @FindBy(id = "modalInterstitial")
    private WebElement refresherResultsModalLoading;


    public CheapTicketsHotelsOffersPage clickGoToOffersPage(){
        click(clickeable);
        isNotVisible(refresherResultsModalLoading);
        pageReady();
        jsWait();
        return new CheapTicketsHotelsOffersPage();
    }

    public HotelCardList clickOnHotelFilterBtn(){
        click(filterHotels);
        isNotVisible(refresherResultsModalLoading);
        pageReady();
        jsWait();
        return new HotelCardList();
    }



}
