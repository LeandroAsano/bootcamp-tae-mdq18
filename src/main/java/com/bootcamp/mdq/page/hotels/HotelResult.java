package com.bootcamp.mdq.page.hotels;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.component.HotelCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelResult extends BasePage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement hotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement hotelNameGoBtn;

    @FindBy(id = "ResultsContainer")
    private List<WebElement> resultsContainer;

    @FindBy(id = "hotelResultTitle")
    private WebElement hotelResultTitle;

    public HotelResult serchHotelName(String name){
        type(hotelNameInput, name);
        return this;
    }

    public HotelResult findHotel(){
        click(hotelNameGoBtn);
        return this;
    }

    public HotelCard selectHotelCard(int position){
        return new HotelCard(resultsContainer.get(position));
    }

    public int getNumberOfResults(){
        WebElement label = hotelResultTitle.findElement(By.className("section-header-main") );
        System.out.println(getText(label));
        String[] arr = getText(label).split(":");
        String[] arr2 = arr[1].split(" ");
        System.out.println(arr2[1]);
        return Integer.parseInt(arr2[1]);
    }
}
