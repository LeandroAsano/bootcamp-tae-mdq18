package com.bootcamp.mdq.tests.mobile.elements.contactsapp;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 7/9/2018.
 */
public class MoreOptionsPanel  extends MobilePage{

    @CacheLookup
    @FindBy(xpath = "//*[contains(@text, 'Delete')]")
    private MobileElement deleteButton;

    public DeleteConfirmOrDeclineModal clickOnDeleteOption(){
        click(deleteButton);
        return new DeleteConfirmOrDeclineModal();
    }
}
