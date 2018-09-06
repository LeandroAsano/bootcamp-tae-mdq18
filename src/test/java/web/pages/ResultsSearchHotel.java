package web.pages;

import com.bootcamp.mdq.page.web.WebPage;
import web.components.CardHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

import static com.bootcamp.mdq.waits.Waits.notVisible;

public class ResultsSearchHotel extends WebPage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement hotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement hotelNameGo;

    @FindBy(id = "ResultsContainer")
    private WebElement resultsContainer;

    @FindBy(id = "hotelResultTitle")
    private WebElement hotelResultTitle;

    @FindBy(css = "article.hotel")
    private List<WebElement> results;

    @FindBy(id = "modalInterstitial")
    private WebElement resultsModal;

    @FindBy(id= "tva-module")
    private WebElement searchingHotels;

    public HotelDetails clickOverSearchResult(int i) {
        notVisible(searchingHotels);
        return (new CardHotel(results.get(i))).clickHotelName();
    }

    public ResultsSearchHotel serchHotelName(String name){
        type(hotelNameInput, name);
        return this;
    }

    public ResultsSearchHotel findHotel(){
        click(hotelNameGo);
        notVisible(resultsModal);
        return this;
    }

    public List<String> getListHotels() {

        List<String> hotelNames = new ArrayList<String>();
        List<WebElement> webNames = resultsContainer.findElements(By.cssSelector("article h3"));

        for (WebElement element : results) {
            hotelNames.add(element.getText());
        }
        return hotelNames;
    }

    public boolean results(String name) {
        boolean i=true;
        for (String hotelName : getListHotels()) {
            if (!hotelName.contains(name)) {
                i=false;
            }
        }
        return i;
    }


}
