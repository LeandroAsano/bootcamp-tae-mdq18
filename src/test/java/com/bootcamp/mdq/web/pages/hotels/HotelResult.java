package com.bootcamp.mdq.web.pages.hotels;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.HotelCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.waits.Waits.waitUntilInivisible;

public class HotelResult extends WebPage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement hotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement hotelNameGoBtn;

    @FindBy(id = "modalInterstitial")
    private WebElement updatingModal;

    @FindBy(css = ".hotel.listing")
    private List<WebElement> hotelList;

    @FindBy(id = "hotelResultTitle")
    private WebElement hotelResultTitle;

    public HotelResult searchHotelName(String name){
        type(hotelNameInput, name);
        return this;
    }

    public HotelResult findHotel(){
        click(hotelNameGoBtn);
        waitUntilInivisible(updatingModal);
        return this;
    }

    public HotelCard selectHotelCard(int position){
        return new HotelCard(hotelList.get(position));
    }

    public int getNumberOfResults(){
        WebElement label = hotelResultTitle.findElement(By.className("section-header-main") );
        String[] arr = getText(label).split(":");
        arr = arr[1].split(" ");
        return Integer.parseInt(arr[1]);
    }
}
