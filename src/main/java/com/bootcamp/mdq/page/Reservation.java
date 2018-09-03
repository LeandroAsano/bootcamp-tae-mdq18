package com.bootcamp.mdq.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Reservation extends BasePage{

    @FindBy(css = "[data-view-type=\"RoomsAndRatesView\"]")
    private List<WebElement> roomOptions;

}
