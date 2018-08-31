package com.bootcamp.mdq.page.results;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Result extends BasePage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement hotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement hotelNameGoBtn;

    @FindBy(id = "ResultsContainer")
    private WebElement resultsContainer;
}
