package com.bootcamp.mdq.web.pages.hotel;


import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PayBookingPage extends WebPage {

    @FindBy (id= "payments")
    private WebElement creditCardInfoContainer;

    @FindBy(className = "billing-cardholder-name")
    private WebElement cardHolderName;

    @FindBy(id = "creditCardInput")
    private WebElement creditCardNumber;

    @FindBy(className = "cc-expiry-month")
    private WebElement expirationMonth;

    @FindBy(className = "cc-expiry-year")
    private WebElement expirationYear;

    @FindBy(id = "new_cc_security_code")
    private WebElement securityCode;

    @FindBy(className = "pwp-insurance-zipcode")
    private WebElement zipCode;


    public PayBookingPage() {
    }

    public PayBookingPage enterCardName(String name) {
        type(cardHolderName, name);
        return this;
    }

    public PayBookingPage enterCardNumber(String number) {
        type(creditCardNumber, number);
        return this;
    }

    public PayBookingPage selectExpiryMonth(String number) {
        setNumerOf(expirationMonth, number);
        return this;
    }

    public PayBookingPage selectExpiryYear(String number) {
        setNumerOf(expirationYear, number);
        return this;
    }

    public PayBookingPage enterSecurityCode(String Code) {
        type(securityCode, Code);
        return this;
    }

    public PayBookingPage enterZipCode(String Code) {
        type(zipCode, Code);
        return this;
    }


    public boolean hasCardHolderName() {
        if(cardHolderName==null){
            return false;
        }else {
            return true;
        }
    }

    public boolean hasCreditCardNumber() {
        if(creditCardNumber==null){
            return false;
        }else {
            return true;
        }
    }

    public boolean hasMonthSelector() {
        if(expirationMonth==null){
            return false;
        }else {
            return true;
        }
    }

    public boolean hasExpirationYear() {
        if(expirationYear==null){
            return false;
        }else {
            return true;
        }
    }

    public boolean hasSecurityCode() {
        if(securityCode==null){
            return false;
        }else {
            return true;
        }
    }

    public boolean hasZipCode() {
        if(zipCode==null){
            return false;
        }else {
            return true;
        }
    }



}

