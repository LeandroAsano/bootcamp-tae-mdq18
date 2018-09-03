package com.bootcamp.mdq.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class PayBookingPage extends BasePage{

    @FindBy (id = "payments")
    private WebElement payForm;

    @FindBy (className = "billing-cardholder-name")
    private WebElement cardHolderName;

    @FindBy (id = "creditCardInput")
    private WebElement creditCardNumber;

    @FindBy(className = "cc-expiry-month")
    private WebElement expirationMonth;

    @FindBy (className = "cc-expiry-year")
    private WebElement expirationYear;

    @FindBy (id="new_cc_security_code")
    private WebElement securityCode;

    @FindBy (className = "pwp-insurance-zipcode")
    private WebElement zipCode;


    public PayBookingPage() {
    }

    public PayBookingPage enterCardName(String name){
        type(cardHolderName, name);
        return this;
    }

    public PayBookingPage enterCardNumber(String number){
        type(creditCardNumber, number);
        return this;
    }

    public PayBookingPage selectExpiryMonth(String number){
        setNumerOf(expirationMonth, number);
        return this;
    }

    public PayBookingPage selectExpiryYear(String number){
        setNumerOf(expirationYear, number);
        return this;
    }

    public PayBookingPage enterSecurityCode(String Code){
        type(securityCode, Code);
        return this;
    }

    public PayBookingPage enterZipCode(String Code){
        type(zipCode, Code);
        return this;
    }

    public boolean paymentFormIsDisplayed(){
        return cardHolderName.isDisplayed()&& creditCardNumber.isDisplayed()&& expirationMonth.isDisplayed()&& expirationYear.isDisplayed()&&securityCode.isDisplayed()&&zipCode.isDisplayed();
    }

    public boolean paymentFormIsAviliable(){
        return cardHolderName.isEnabled()&& creditCardNumber.isEnabled()&& expirationMonth.isEnabled()&& expirationYear.isEnabled()&&securityCode.isEnabled()&&zipCode.isEnabled();
    }

}

