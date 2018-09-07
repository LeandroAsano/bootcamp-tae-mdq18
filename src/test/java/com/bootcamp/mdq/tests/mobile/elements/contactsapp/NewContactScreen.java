package com.bootcamp.mdq.tests.mobile.elements.contactsapp;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.bootcamp.mdq.page.mobile.MobileOperations.*;



/**
 * Created by Yo on 6/9/2018.
 */
public class NewContactScreen extends MobilePage {

        @CacheLookup
        @FindBy(id = "left_button")
        private MobileElement keepContactsOnLocalButton;

        @CacheLookup
        @FindBy(id = "names")
        private MobileElement nameInputField;

        @CacheLookup
        @FindBy(id = "phone_numbers")
        private MobileElement phoneInputField;

        @CacheLookup
        @FindBy(id = "emails")
        private MobileElement emailInputField;

        @CacheLookup
        @FindBy(id = "Save")
        private MobileElement okButton;




        public NewContactScreen closeModal(){
            click(keepContactsOnLocalButton);
            return new NewContactScreen();
        }

        public NewContactScreen typeName(String name){
            type(nameInputField,name);
            return new NewContactScreen();
        }
        public NewContactScreen typePhone(String name){
            type(phoneInputField,name);
                return new NewContactScreen();
        }
        public NewContactScreen typeEmail(String name){
            type(emailInputField,name);
            return new NewContactScreen();
        }

        public ContactInfoScreen addContactConfirm(){
                click(okButton);
                return new ContactInfoScreen();
        }
}
