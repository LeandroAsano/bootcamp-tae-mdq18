package com.bootcamp.mdq.tests.mobile.tests;

import com.bootcamp.mdq.tests.mobile.elements.calculator.Calculator;
import com.bootcamp.mdq.tests.mobile.elements.contactsapp.ContactInfoScreen;
import com.bootcamp.mdq.tests.mobile.elements.contactsapp.ContactsApp;
import com.bootcamp.mdq.tests.mobile.elements.deskclock.DeskClock;
import com.bootcamp.mdq.testsuite.BaseTestSuite;

import org.junit.After;
import org.junit.Test;
import org.junit.Assert.*;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class Tests extends BaseTestSuite {

    private Calculator app;

    private DeskClock deskClock;

    private ContactsApp contactsApp;
/*
    @Test
    public void calculatorTest() {
        String expectedResult = "15000.01";
        String operationChars = "10000+5000.01";
        app = new Calculator();
        String result = app.getKeyboard()
                .operation(operationChars)
                .getResult();
        assertEquals(expectedResult,result);
    }
*/
/*
    @Test
    public void clockTest(){
        int max = 25;
        deskClock = new DeskClock();
        int result = deskClock.goToChronometer().start().stop(20).getTime();
        Assert.assertTrue(max > result);

    }
*/
    @Test
    public void testContacts(){
        String name = "facu";
        String phone = "4892032";
        String email = "facuvega@gmail.com";
        contactsApp = new ContactsApp();
        List<String> data = contactsApp
                .go()
                .closeModal()
                .typeName(name)
                .typePhone(phone)
                .typeEmail(email)
                .addContactConfirm()
                .getData();
        assertEquals(name,data.get(0));
        assertEquals(phone,data.get(1));
        assertEquals(email,data.get(2));
        deleteContact();
    }

    @After
    public void deleteContact(){

        ContactInfoScreen contactInfoScreen = new ContactInfoScreen();
        contactInfoScreen
                .clickMoreOptions()
                .clickOnDeleteOption()
                .confirmDelete();
    }
}
