package com.bootcamp.mdq.tests.mobile.elements.contactsapp;

import com.bootcamp.mdq.page.mobile.MobilePage;
import com.bootcamp.mdq.tests.web.components.cheapticketshotelofferspagecomponents.SearchBar;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

/**
 * Created by Yo on 6/9/2018.
 */
public class ContactsApp extends MobilePage {


    @AndroidFindBy(id = "floating_action_button_container")
    @CacheLookup
    private MobileElement addNewContactButton;

    @AndroidFindBy(id = "menu_search")
    @CacheLookup
    private MobileElement searchButton;

    public NewContactScreen go(){
        click(addNewContactButton);
        return new NewContactScreen();
    }
}
