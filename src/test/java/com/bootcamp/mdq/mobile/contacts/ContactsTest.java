package com.bootcamp.mdq.mobile.contacts;

import com.bootcamp.mdq.mobile.contacts.pages.ContactInfo;
import com.bootcamp.mdq.mobile.contacts.pages.Contacts;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;

public class ContactsTest extends BaseTestSuite {

    Contacts contacts;

    @Test
    public void createAnewContactTest(){
        contacts=new Contacts();

        ContactInfo contactInfo =contacts.createAnewContact()
                .typeName("Marcos Casas")
                .typePhone("223 155521603")
                .typeEmail("marcoscasas@gmail.com")
                .clickOnSave()
                .clickOnKeppLocal();
    }
}
