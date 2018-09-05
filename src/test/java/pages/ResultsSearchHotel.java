package pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsSearchHotel extends WebPage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement hotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement hotelNameGo;

    @FindBy(id = "ResultsContainer")
    private List<WebElement> resultsContainer;

    @FindBy(id = "hotelResultTitle")
    private WebElement hotelResultTitle;

    public ResultsSearchHotel serchHotelName(String name){
        type(hotelNameInput, name);
        return this;
    }
    public ResultsSearchHotel findHotel(){
        click(hotelNameGo);
        return this;
    }
    public List<WebElement> getResults() {
        return resultsContainer;
    }


}
