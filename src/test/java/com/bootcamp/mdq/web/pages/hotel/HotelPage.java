package com.bootcamp.mdq.web.pages.hotel;


import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.ItemRoomList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.waits.Waits.areVisible;


public class HotelPage extends WebPage {

    @FindBy (css = "tbody.room")
    List<WebElement>  avaliableRooms;

    public HotelPage() {
    }

    public PayBookingPage clickOnItem(int item){
        areVisible(avaliableRooms);
        return (new ItemRoomList(avaliableRooms.get(item - 1))).clickOnReserve();
    }
}