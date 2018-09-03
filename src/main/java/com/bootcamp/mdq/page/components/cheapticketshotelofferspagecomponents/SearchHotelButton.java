package com.bootcamp.mdq.page.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class SearchHotelButton extends BasePage {

    @FindBy(id = "hotelNameGoBtn")
    private WebElement clickeable;

    @FindBy(id = "modalInterstitial")
    private WebElement refresherResultsModalLoading;

    public HotelCardList clickOn(){
        click(clickeable);
        notVisible(refresherResultsModalLoading);
        return new HotelCardList();
    }
}
