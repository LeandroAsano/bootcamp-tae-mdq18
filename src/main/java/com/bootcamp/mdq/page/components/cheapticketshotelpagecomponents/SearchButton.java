package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.components.cheapticketshotelofferspagecomponents.CheapTicketsHotelsOffersPage;
import com.bootcamp.mdq.page.components.cheapticketshotelofferspagecomponents.HotelCardList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class SearchButton extends BasePage {


    @FindBy(css = "[data-gcw-change-submit-text=\"Search\"]")
    private WebElement clickeable;


    public CheapTicketsHotelsOffersPage clickOn(){
        click(clickeable);
        return new CheapTicketsHotelsOffersPage();
    }

    public HotelCardList clickOn2(){
        click(clickeable);
        return new HotelCardList();
    }


}
