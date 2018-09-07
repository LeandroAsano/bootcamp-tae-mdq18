package mobile.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class AddNewContact extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id = "names")
    private MobileElement nameInput;

    @CacheLookup
    @AndroidFindBy(id = "phone_numbers")
    private MobileElement phoneInput;

    @CacheLookup
    @AndroidFindBy(id = "emails")
    private MobileElement emailInput;

    @CacheLookup
    @AndroidFindBy(accessibility = "Save")
    private MobileElement saveBtn;

    public AddNewContact addName(String name){
        type(nameInput,name);
        return this;
    }
    public AddNewContact addPhoneNumber(String number){
        type(phoneInput,number);
        return this;
    }
    public AddNewContact addEmail(String email){
        type(emailInput,email);
        return this;
    }
    public ContactPage save(){
        click(saveBtn);
        return new ContactPage();
    }
}
