package mobile.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import mobile.pages.ContactPage;
import mobile.pages.ContactsHome;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class ContactTest extends BaseTestSuite {

    private ContactsHome contactsHome;
    private ContactPage contactPage;

    @Test
    public void addContactTest(){

        contactsHome = new ContactsHome();
        contactPage = contactsHome
                .newContact()
                .keepLocal()
                .addName("Mariano")
                .addPhoneNumber("222222")
                .addEmail("aaaa@bbbb.com")
                .save();

        Assert.assertEquals("Mariano",contactPage.getContactName());
        Assert.assertEquals("222222",contactPage.getContactNumber());
        Assert.assertEquals("aaaa@bbbb.com",contactPage.getContactEmail());
    }

    @After
    public void deleteNewContact(){
        contactPage.clickOptions()
                    .clickDelete()
                    .clickOkDelete();
    }
}
