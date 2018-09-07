package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ListProduct extends WebComponent {

    @FindBy(id = "s-results-list-atf")
    private List<WebElement> productCardList;

    public ListProduct(WebElement container) {
        super(container);
    }

    public int results(String name) {
        int i=0;
        for (String hotelName : getListProductos()) {
            if (!hotelName.contains(name)) {
                i=++;
            }
        }
        return i;
    }

    public List<String> getListProductos() {

        List<String> productNames = new ArrayList<String>();
        List<WebElement> webNames = productCardList.findElements(By.cssSelector("data-attribute h2"));

        for (WebElement element : results) {
            productNames.add(element.getText());
        }
        return productNames;
    }

    public CardProduct selectCard(){
        int position=0;
        return new CardProduct(productCardList.get(position));
    }
}
