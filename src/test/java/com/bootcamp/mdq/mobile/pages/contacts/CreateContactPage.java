package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class CreateContactPage extends MobilePage {

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'Name')]")
    private MobileElement nameEditText;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'Phone')]")
    private MobileElement phoneEditText;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'Email')]")
    private MobileElement emailEditText;

    @CacheLookup
    @AndroidFindBy(accessibility = "Save")
    private MobileElement saveButton;

    public CreateContactPage typeContactName(String name) {
//        click(nameEditText);
        type(nameEditText, name);
        return this;
    }

    public CreateContactPage typePhoneNumber(String phoneNumber) {
//        click(phoneEditText);
        type(phoneEditText, phoneNumber);
        return this;
    }

    public CreateContactPage typeEmail(String email) {
//        click(emailEditText);
        type(emailEditText, email);
        return this;
    }

    public ContactDetail saveContact() {
        click(saveButton);
        return new ContactDetail();
    }

}
