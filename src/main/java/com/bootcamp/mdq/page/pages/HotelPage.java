package com.bootcamp.mdq.page.pages;


import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.PayBookingPage;
import com.bootcamp.mdq.page.component.ItemRoomList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelPage extends BasePage {

    @FindBy (css = "tbody.room")
    List<WebElement>  avaliableRooms;

    public HotelPage() {

    }

    public PayBookingPage clickOnItem(int item){
        return (new ItemRoomList(avaliableRooms.get(item))).clickOnReserve();
    }


}