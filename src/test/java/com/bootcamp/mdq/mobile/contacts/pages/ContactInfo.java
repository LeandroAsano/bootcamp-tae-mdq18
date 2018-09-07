package com.bootcamp.mdq.mobile.contacts.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ContactInfo extends MobilePage {
    @CacheLookup
    @AndroidFindBy(accessibility="Call Mobile")
    private MobileElement callPhone;

    @CacheLookup
    @AndroidFindBy(accessibility="Email ")
    private MobileElement email;

    @CacheLookup
    @AndroidFindBy(id="title_gradient")
    private MobileElement name;

    @CacheLookup
    @AndroidFindBy(accessibility = "More options")
    private MobileElement moreOptions;



    public String getPhoneNumber(){
        return callPhone.getAttribute("contentDescription");
    }

    public String getEmail(){
        return email.getAttribute("contentDescription");
    }

    public String getName(){
        return name.getAttribute("contentDescription");
    }

    public ContactInfo clickOnMoreOptions(){
        click(moreOptions);
        return this;
    }





    public ContactInfo() {
    }
}
