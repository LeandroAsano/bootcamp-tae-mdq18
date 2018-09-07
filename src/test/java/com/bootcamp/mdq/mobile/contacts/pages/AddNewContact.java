package com.bootcamp.mdq.mobile.contacts.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class AddNewContact extends MobilePage {

    @CacheLookup
    @AndroidFindBy (id="names")
    private MobileElement nameInput;

    @CacheLookup
    @AndroidFindBy (id="phone_numbers")
    private MobileElement phoneNumberInput;

    @CacheLookup
    @AndroidFindBy (id="emails")
    private MobileElement emailInput;

    @CacheLookup
    @AndroidFindBy (accessibility="Save")
    private MobileElement save;


    //------------------------------
    @CacheLookup
    @AndroidFindBy (id= "left_button")
    private MobileElement keepLocal;

    @CacheLookup
    @AndroidFindBy (id= "right_button")
    private MobileElement addAcount;


public AddNewContact(){
    super();
}

public AddNewContact typeName(String nameContact){
    type(nameInput, nameContact);
    return this;
}

public AddNewContact typePhone(String phone){
    type(phoneNumberInput, phone);
    return this;
}

public AddNewContact typeEmail(String emailAdress){
    type(emailInput, emailAdress);
    return this;
}


public AddNewContact clickOnSave(){
    click(save);
    return this;
}

public ContactInfo clickOnKeppLocal(){
        click(keepLocal);
        return new ContactInfo();
    }






}
