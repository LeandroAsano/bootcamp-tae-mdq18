package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.component.DatePicker;
import com.bootcamp.mdq.page.component.HotelCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SearchResults extends BasePage {

    private NavegationBar navegationBar;

    @FindBy (id ="inpHotelNameMirror")
    private WebElement filterbyname;

    @FindBy (css ="article.hotel")
    private List<WebElement> results;

    @FindBy (id="hotelNameGoBtn")
    private WebElement filtergoButton;

    @FindBy (className = "section-header-main")
    private WebElement nameDestination;

    @FindBy (id = "resultsContainer")
    private WebElement resultsContainer;


    public SearchResults() {
        navegationBar=new NavegationBar();
    }

    public HotelPage clickOnItem(int index){
        click(results.get(index));
        return new HotelPage();
    }

    public SearchResults filterByNameFild(String nameOfHotel){
        type(filterbyname, nameOfHotel);
        return this;
    }

    public SearchResults clickOnSearchButton(){
        click(filtergoButton);
        return this;
    }

    public boolean isEmpthyResult()
    {
        return results.isEmpty();
    }


    public List<String> getListOfAvailableHotels(){
         List<String> hotelNames=new ArrayList<String>();
        //System.out.println("Result is empthy "+results.isEmpty());
        for (WebElement element: results){
            hotelNames.add((new HotelCard(element)).getHotelName());
        }
        return hotelNames;
    }


    public List<String> getListOfAvailableHotels2(){

        List<String> hotelNames=new ArrayList<String>();

        //System.out.println("Result is empthy "+results.isEmpty());
        List<WebElement> webNames=resultsContainer.findElements(By.cssSelector("article h3"));

        for (WebElement element: results){
            hotelNames.add(element.getText());
        }
        return hotelNames;
    }

    /**
     * validate that the all elements on the results list are acordin to the filt
     * @param name the filter aplicated
     * @return True if all the results on the list are acording to the name search
     */
    public boolean validResults(String name){
        boolean check=true;
        List<String> names=getListOfAvailableHotels2();
        ListIterator<String> iterator=names.listIterator();
        while (iterator.hasNext()&&check){
           check=iterator.next().contains(name);
        }
        return check;
    }

}
