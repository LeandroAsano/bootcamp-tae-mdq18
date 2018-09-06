package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class NewContactAlertDialog extends MobilePage {

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'Keep local')]")
    private MobileElement keepLocalButton;

    public CreateContactPage keepLocal() {
        click(keepLocalButton);
        return new CreateContactPage();
    }
}
