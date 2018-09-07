package com.bootcamp.mdq.tests.mobile.elements.contactsapp;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 7/9/2018.
 */
public class DeleteConfirmOrDeclineModal extends MobilePage {

    @FindBy(id = "button1")
    @CacheLookup
    private MobileElement okButton;

    public void confirmDelete(){
        click(okButton);
    }

}
