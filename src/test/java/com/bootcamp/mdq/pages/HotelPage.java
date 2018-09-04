package com.bootcamp.mdq.pages;


import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.pages.components.ItemRoomList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HotelPage extends WebPage {

    @FindBy (css = "tbody.room")
    List<WebElement>  avaliableRooms;

    public HotelPage() {
    }

    public PayBookingPage clickOnItem(int item){
        //System.out.println(avaliableRooms.isEmpty());
        //System.out.println(isVisible(avaliableRooms.get(0)));
        return (new ItemRoomList(avaliableRooms.get(item))).clickOnReserve();
    }
}