package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobileOperations;
import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Matias on 06/09/2018.
 */
public class AddContact extends MobilePage {

    @AndroidFindBy(id = "names")
    private MobileElement nameInput;

    @AndroidFindBy(id = "phone_numbers")
    private MobileElement phoneInput;

    @AndroidFindBy(id = "emails")
    private MobileElement emailInput;

    @AndroidFindBy(accessibility = "Save")
    private MobileElement saveButton;

    public AddContact enterName(String name){
        type(nameInput,name);
        return this;
    }

    public AddContact enterPhoneNumber(String number){
        type(phoneInput,number);
        return this;
    }

    public AddContact enterEmail(String email){
        type(emailInput,email);
        return this;
    }

    public ContactDetails save(){
        click(saveButton);
        return new ContactDetails();
    }




}
