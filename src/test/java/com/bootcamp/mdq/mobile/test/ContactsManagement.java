package com.bootcamp.mdq.mobile.test;

import com.bootcamp.mdq.mobile.pages.contacts.ContactDetail;
import com.bootcamp.mdq.mobile.pages.contacts.ContactsPage;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactsManagement extends BaseTestSuite {

    private ContactsPage contactsPage;
    private ContactDetail contactDetail;

    @Before
    public void SetupContactsManagement() {
        this.contactsPage = new ContactsPage();
    }

    @After
    public void deleteCreatedContact() {
        this.contactDetail.selectOptionsMenu()
                .deleteContact()
                .confirmDelete();
    }

    @Test
    public void createContact() {

        String contactName = "Gonzalo Sassoni";
        String contactPhone = "2236338401";
        String contactEmail = "gonzasso@gmail.com";

         this.contactDetail = contactsPage.createContact()
                 .keepLocal()
                 .typeContactName(contactName)
                 .typePhoneNumber(contactPhone)
                 .typeEmail(contactEmail)
                 .saveContact();

        Assert.assertTrue(contactDetail.checkContactName(contactName));
        Assert.assertTrue(contactDetail.checkContactMobileNumber(contactPhone));
        Assert.assertTrue(contactDetail.checkContactEmail(contactEmail));

    }
}
