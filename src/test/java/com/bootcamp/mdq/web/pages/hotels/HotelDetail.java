package com.bootcamp.mdq.web.pages.hotels;


import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.waits.Waits;
import com.bootcamp.mdq.web.pages.components.RoomCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.bootcamp.mdq.waits.Waits.*;

public class HotelDetail extends WebPage{

    @FindBy(css = ".room.room-above-fold")
    private List<WebElement> roomsResults;

    public RoomCard getRoom(int position){
        waitUntilListVisible(roomsResults);
        return new RoomCard(roomsResults.get(position));
    }




}
