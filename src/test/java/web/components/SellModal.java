package web.components;

import com.bootcamp.mdq.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bootcamp.mdq.waits.Waits.isVisible;

public class SellModal extends WebComponent {

    @FindBy(id = "forcedChoiceNoThanks")
    private WebElement noThanksLink;

    public SellModal(WebElement container) {
        super(container);
    }

    public boolean isNoThanksLinkVisible(){
        return isVisible(noThanksLink).isDisplayed();
    }
}
