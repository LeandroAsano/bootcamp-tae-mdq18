package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ContactPage extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id = "photo_touch_intercept_overlay")
    private MobileElement contactName;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Call')]")
    private MobileElement contactNumber;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Email')]")
    private MobileElement contactEmail;

    @CacheLookup
    @AndroidFindBy(accessibility = "More options")
    private MobileElement optionsBtn;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'Delete')]")
    private MobileElement deleteBtn;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'OK')]")
    private MobileElement deleteOkBtn;

    public String getContactName(){
        return contactName.getAttribute("contentDescription");
    }

    public String getContactNumber(){
        return contactNumber.getAttribute("contentDescription").replaceAll("[a-zA-z]","").replace(" ","");
    }

    public String getContactEmail(){
        return contactEmail.getAttribute("contentDescription").replace("Email Home ","");
    }

    public ContactPage clickOptions(){
        click(optionsBtn);
        return this;
    }

    public ContactPage clickDelete(){
        click(deleteBtn);
        return this;
    }

    public ContactsHome clickOkDelete(){
        click(deleteOkBtn);
        return new ContactsHome();
    }

}
