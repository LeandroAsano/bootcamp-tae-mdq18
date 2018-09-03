package com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelofferspagecomponents.CheapTicketsHotelsOffersPage;
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


}
