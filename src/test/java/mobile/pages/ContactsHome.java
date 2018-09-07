package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ContactsHome extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id ="floating_action_button_container")
    private MobileElement addContactBtn;

    public SaveModal newContact(){
        click(addContactBtn);
        return new SaveModal();
    }
}
