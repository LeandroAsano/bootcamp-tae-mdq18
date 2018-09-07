package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class SaveModal extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id = "left_button")
    private MobileElement keepLocal;

    @CacheLookup
    @AndroidFindBy(id = "right_button")
    private MobileElement addAccount;

    public AddNewContact keepLocal(){
        click(keepLocal);
        return new AddNewContact();
    }
}
