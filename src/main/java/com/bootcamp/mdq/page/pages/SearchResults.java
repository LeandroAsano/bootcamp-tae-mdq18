package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults extends BasePage {

    private NavegationBar navegationBar;

    @FindBy (id ="inpHotelNameMirror")
    private WebElement propertyNameField;

    @FindBy (className ="flex-link-wrap")
    private List<WebElement> results;

    @FindBy (id="hotelNameGoBtn")
    private WebElement goBotton;

    public SearchResults() {
        navegationBar=new NavegationBar();
    }

    public HotelPage clickOnItem(int index){
        click(results.get(index));

        return new HotelPage();
    }

    public boolean isEmpthyResult(){
        return results.isEmpty();
    }

    public void searchOnPropertyNameFild(String nameOfHotel){
        type(propertyNameField, nameOfHotel);
    }

    public void clickOnSearchButton(){
        click(goBotton);
    }
    /*
    // <div class="fooer"
    <a .....
    [aria-laber="close"]
    .clos.b2(al mismo nivel)
    .div .

            cachelooup
    expectedConditions
            element.getText
    elemente getAtribute"value"*/


}
