package com.bootcamp.mdq.pages;


import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBookingPage extends BasePage {

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
        isVisible(creditCardInfoContainer);
        return isVisible(cardHolderName);
    }

    public boolean hasCreditCardNumber() {
        return isVisible(creditCardNumber);
    }

    public boolean hasMonthSelector() {
        return isVisible(expirationMonth);
    }

    public boolean hasExpirationYear() {
        return isVisible(expirationYear);
    }

    public boolean hasSecurityCode() {
        return isVisible(securityCode);
    }

    public boolean hasZipCode() {
        return isVisible(zipCode);
    }

    public boolean availableCardHolderName() {
        return isEnabled(cardHolderName);
    }

    public boolean availableCreditCardNumber() {
        return isEnabled(creditCardNumber);
    }

    public boolean availableMonthSelector() {
        return isEnabled(expirationMonth);
    }

    public boolean availableExpirationYear() {
        return isEnabled(expirationYear);
    }

    public boolean availableSecurityCode() {
        return isEnabled(securityCode);
    }

    public boolean availableZipCode() {
        return isEnabled(zipCode);
    }

}

