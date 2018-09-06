package com.bootcamp.mdq.tests.web.components;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Yo on 5/9/2018.
 */
public class ReserveRoomPage extends WebPage {

    @FindBy(css = "[data-automation=\"bookButton\"]")
    private List<WebElement> reserveButton;


    public DataCreditCardForm dataCreditCardForm(){
        System.out.println("reserve buttons: " + reserveButton.size());
        click(reserveButton.get(0));
        return new DataCreditCardForm();
    }
}
