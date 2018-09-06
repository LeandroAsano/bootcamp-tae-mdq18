package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ContactsPage extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "add new contact")
    private MobileElement addNewContactButton;

    public NewContactAlertDialog createContact() {
        click(addNewContactButton);
        return new NewContactAlertDialog();
    }

}
