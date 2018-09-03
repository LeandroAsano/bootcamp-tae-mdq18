package com.bootcamp.mdq.page.components.cheapticketshotelofferspagecomponents;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelCardList extends BasePage {

    @FindBy(css = "article.hotel")
    private List<WebElement> allHotels;

    public HotelCard getSpecificHotel(String criteria){
        for (WebElement w : allHotels) {
            if(w.getText().contains(criteria)){
                return new HotelCard(criteria);
            }
        }
        return new HotelCard();
    }
}