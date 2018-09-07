package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Matias on 07/09/2018.
 */
public class ContactDetails extends MobilePage {

    @AndroidFindBy(accessibility = "More options")
    private MobileElement optionsButton;

    @AndroidFindBy(id = "photo_touch_intercept_overlay")
    private MobileElement contactNameLabel;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Call')]")
    private MobileElement contactNumber;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Email')]")
    private MobileElement contactEmail;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Delete')]")
    private MobileElement deleteButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'OK')]")
    private MobileElement deleteOkButton;

    public ContactDetails pressOptions(){
        click(optionsButton);
        return this;
    }

    public String getContactName(){
        return contactNameLabel.getAttribute("contentDescription");
    }

    public String getContactNumber(){
        return contactNumber.getAttribute("contentDescription").replaceAll("[a-zA-z]","").replace(" ","");
    }

    public String getContactEmail(){
        return contactEmail.getAttribute("contentDescription").replace("Email Home ","");
    }

    public ContactDetails clickDelete(){
        click(deleteButton);
        return this;
    }

    public Contacts clickOkToDelete(){
        click(deleteOkButton);
        return new Contacts();
    }

}
