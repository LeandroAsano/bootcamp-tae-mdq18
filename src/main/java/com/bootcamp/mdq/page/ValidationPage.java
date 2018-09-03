package com.bootcamp.mdq.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends BasePage{

    @FindBy(className = ".text.billing-cardholder-name")
    private WebElement cardHolderNameInput;

    @FindBy(id = "creditCardInput")
    private WebElement creditCardInput;

    @FindBy(className = ".cko-field.cc-expiry-month.fast-payment-include.gb-whitelist")
    private WebElement expirationDateMonthSelect;

    @FindBy(className = ".cko-field.cc-expiry-year.fast-payment-include.gb-whitelist")
    private WebElement expirationDateYearSelect;

    @FindBy(id = "new_cc_security_code")
    private WebElement securityCodeInput;

    @FindBy(className = ".text.cko-field.fast-payment-include.pwp-insurance-zipcode")
    private WebElement billingZipCodeInput;

    public boolean isVisibleCardHolderNameInput() {
        return isVisible(cardHolderNameInput);
    }

    public boolean isVisibleCreditCardInput() {
        return isVisible(creditCardInput);
    }

    public boolean isVisibleExpirationDateMonthSelect() {
        return isVisible(expirationDateMonthSelect);
    }

    public boolean isVisibleExpirationDateYearSelect() {
        return isVisible(expirationDateYearSelect);
    }

    public boolean isVisibleSecurityCodeInput() {
        return isVisible(securityCodeInput);
    }

    public boolean isVisibleBillingZipCodeInput() {
        return isVisible(billingZipCodeInput);
    }

}
