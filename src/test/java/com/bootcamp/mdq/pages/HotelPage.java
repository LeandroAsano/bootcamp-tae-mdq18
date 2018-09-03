package com.bootcamp.mdq.pages;


import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.pages.components.ItemRoomList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelPage extends BasePage {

    @FindBy (css = "tbody.room")
    List<WebElement>  avaliableRooms;

    public HotelPage() {
        navigate("https://www.cheaptickets.com/Miami-Hotels-Faena-Hotel-Miami-Beach.h10344566.Hotel-Information?chkin=9%2F15%2F2018&chkout=9%2F22%2F2018&rm1=a1&sort=recommended&hwrqCacheKey=ec23dd4e-4092-4cdf-81de-a53bb60557bcHWRQ1536008325368&cancellable=false&regionId=6361420&vip=false&hotelname=Faena+Hotel+Miami+beach&c=dbc6d0b3-880a-4223-b815-ed2569334afd&&exp_dp=493.39&exp_ts=1536008325595&exp_curr=USD&swpToggleOn=false");
    }

    public PayBookingPage clickOnItem(int item){
        return (new ItemRoomList(avaliableRooms.get(item))).clickOnReserve();
    }


}