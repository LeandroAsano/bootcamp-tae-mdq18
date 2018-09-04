package page;

import com.bootcamp.mdq.page.web.WebPage;
import page.component.RoomCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchHotelsResults extends WebPage {

    @FindBy(id = "inpHotelNameMirror")
    private WebElement filterHotelNameInput;

    @FindBy(id = "hotelNameGoBtn")
    private WebElement applyFilterButton;

    @FindBy(className = "section-header-main")
    private WebElement resultsNumber;

    @FindBy(css = ".hotel.listing.col")
    private List<RoomCard> resultsContainer;

    public SearchHotelsResults filterHotelByName(String hotelName) {
        type(filterHotelNameInput, hotelName);
        return this;
    }

    public SearchHotelsResults applyNameFilter() {
        click(applyFilterButton);
        return this;
    }

    public List<RoomCard> getResults() {
        return resultsContainer;
    }

    public RoomCard getSingleResult(int id) {
        return getResults().get(id);
    }

}
