package com.bootcamp.mdq.pages;


import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBookingPage extends BasePage {

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

    public boolean paymentFormIsDisplayed() {
        return cardHolderName.isDisplayed() && creditCardNumber.isDisplayed() && expirationMonth.isDisplayed() && expirationYear.isDisplayed() && securityCode.isDisplayed() && zipCode.isDisplayed();
    }

    public boolean paymentFormIsAviliable() {
        return cardHolderName.isEnabled() && creditCardNumber.isEnabled() && expirationMonth.isEnabled() && expirationYear.isEnabled() && securityCode.isEnabled() && zipCode.isEnabled();
    }

    public boolean hasCardHolderName() {
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




}

