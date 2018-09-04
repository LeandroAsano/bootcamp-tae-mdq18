package com.bootcamp.mdq.page.hotelResultsPage;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.bookPage.BookPage;
import com.bootcamp.mdq.page.hotelCard.HotelCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelResultsPage extends BasePage {

    @FindBy(id="inpHotelNameMirror")
    private WebElement searchInput;

    @FindBy(id=("hotelNameGoBtn"))
    private WebElement goButton;

    @FindBy(css="#resultsContainer > section")
    private static List<WebElement> hotelCards;

    @FindBy(xpath = "//*[@id='7500589']/div[2]/div[1]/a")
    private WebElement firstHotelCard;

    /*@FindBy(xpath = ("//[@id='exit-intent-modal']/div/div[1]/div/figure/img"))
    private WebElement banner;

    @FindBy(className = "btn-close modal-close btn-primary" )
    private WebElement closeBanner;

    public HotelResultsPage closeBanner() {
        if(isVisible(banner))
            click(closeBanner);
        return new HotelResultsPage();
    }*/

    public HotelCard clickFirstHotelLink(){
        click(firstHotelCard);
        return new HotelCard();
    }

    public HotelResultsPage typeLocation(String location){
        type(searchInput,location);
        return this;
    }

    public BookPage clickGoButton(){
        click(goButton);
        return new BookPage();
    }

    public static int hotelCards(){
        return hotelCards.size();
    }
}
