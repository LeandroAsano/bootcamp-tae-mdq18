package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Contacts extends MobilePage {

    @AndroidFindBy(id = "create_contact_button")
    private MobileElement createButton;

    @AndroidFindBy(id = "add_account_button")
    private MobileElement addAccountButton;

    @AndroidFindBy(id = "import_contacts_button")
    private MobileElement importButton;



}
