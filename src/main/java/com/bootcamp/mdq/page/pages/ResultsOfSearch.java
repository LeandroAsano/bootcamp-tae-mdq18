package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.component.HotelCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsOfSearch extends BasePage {

    private NavegationBar navegationBar;

    @FindBy (id ="inpHotelNameMirror")
    private WebElement propertyNameField;

    @FindBy (css ="div.flex-card")
    private List<WebElement> results;

    public ResultsOfSearch() {
        navegationBar=new NavegationBar();
    }

    public HotelPage clickOnItem(int index){
        WebElement firstitem = results.get(index-1);
        firstitem.clear();
        return new HotelPage();
    }

    public WebElement getPropertyNameField() {
        return propertyNameField;
    }
}
