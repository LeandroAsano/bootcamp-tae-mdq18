package com.bootcamp.mdq.page.components.cheapticketshotelofferspagecomponents;

import org.openqa.selenium.WebElement;

/**
 * Created by Yo on 3/9/2018.
 */
public class HotelCard {

    private String name;

    public String getName() {
        return name;
    }

    public HotelCard(String name) {
        this.name = name;
    }

    public HotelCard() {
        name = "";
    }
}
