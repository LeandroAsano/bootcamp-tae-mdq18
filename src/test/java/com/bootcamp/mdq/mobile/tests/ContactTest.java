package com.bootcamp.mdq.mobile.tests;

import com.bootcamp.mdq.mobile.pages.contacts.AddContact;
import com.bootcamp.mdq.mobile.pages.contacts.ContactDetails;
import com.bootcamp.mdq.mobile.pages.contacts.Contacts;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest extends BaseTestSuite {

    private Contacts contacts;
    private ContactDetails contact;

    @Before
    public void start(){
        contacts = new Contacts();
    }

    @Test
    public void addNewContactTest(){
        contact = contacts
                .createNewContact()
                .keepLocal()
                .enterName("Globant Tester")
                .enterPhoneNumber("223987654")
                .enterEmail("tae@globant.com")
                .save();

        assertEquals("Globant Tester",contact.getContactName());
        assertEquals("(223)987-654",contact.getContactNumber());
        assertEquals("tae@globant.com",contact.getContactEmail());

    }

    @After
    public void deleteThatNewContact(){
        contact.pressOptions()
                .clickDelete()
                .clickOkToDelete();
    }
}
