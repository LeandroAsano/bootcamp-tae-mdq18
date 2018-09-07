package com.bootcamp.mdq.mobile.contacts.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Contacts extends MobilePage {

    @AndroidFindBy (id="create_contact_button")
    private MobileElement createAcount;

    public Contacts() {
        super();
    }

    public AddNewContact createAnewContact(){
        click(createAcount);
        return new AddNewContact();
    }
}
