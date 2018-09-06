package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ContactDetail extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id = "photo_touch_intercept_overlay")
    private MobileElement contactName;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Call Mobile')]")
    private MobileElement contactPhoneNumber;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Email Home')]")
    private MobileElement contactEmailHome;

    @CacheLookup
    @AndroidFindBy(accessibility = "More options")
    private MobileElement moreOptionsButton;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'Delete')]")
    private MobileElement deleteOptionButton;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'OK')]")
    private MobileElement confirmButton;

    public boolean checkContactName(String name) {
        return name.equals(getContentDesc(contactName));
    }

    public boolean checkContactMobileNumber(String phoneNumber) {
        String numberText = getContentDesc(contactPhoneNumber).replaceAll("[^\\d.]", "");
        return phoneNumber.equals(numberText);
    }

    public boolean checkContactEmail(String email) {
        String emailAdress = getContentDesc(contactEmailHome).replaceFirst("Email Home ", "");
        return email.equals(emailAdress);
    }

    public ContactDetail selectOptionsMenu() {
        click(moreOptionsButton);
        return this;
    }

    public ContactDetail deleteContact() {
        click(deleteOptionButton);
        return this;
    }

    public ContactsPage confirmDelete() {
        click(confirmButton);
        return new ContactsPage();
    }
}
