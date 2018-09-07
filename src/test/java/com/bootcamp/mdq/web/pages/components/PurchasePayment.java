package com.bootcamp.mdq.web.pages.components;

import com.bootcamp.mdq.page.web.WebComponent;
import com.bootcamp.mdq.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Matias on 07/09/2018.
 */
public class PurchasePayment extends WebComponent {

    @FindBy(className = ".text.billing-cardholder-name")
    private WebElement cardHolderNameInput;

    @FindBy(id = "creditCardInput")
    private WebElement creditCardNumberInput;

    @FindBy(className = ".cko-field.cc-expiry-month.fast-payment-include.gb-whitelist")
    private WebElement expiryMonthSelect;

    @FindBy(className = ".cko-field.cc-expiry-year.fast-payment-include.gb-whitelist")
    private WebElement expiryYearSelect;

    @FindBy(id = "new_cc_security_code")
    private WebElement securityCodeInput;

    @FindBy(className = ".text.cko-field.fast-payment-include.pwp-insurance-zipcode")
    private WebElement zipCodeInput;

    public PurchasePayment(WebElement container) {
        super(container);
    }

    public boolean isCardHolderNameVisible(){
        return cardHolderNameInput.isDisplayed();
    }

    public boolean isCreditCardNumberVisible(){
        return creditCardNumberInput.isDisplayed();
    }

    public boolean isExpiryMonthSelectVisible(){
        return expiryMonthSelect.isDisplayed();
    }

    public boolean isExpiryYearSelectVisible(){
        return expiryYearSelect.isDisplayed();
    }

    public boolean isSecurityCodeInputVisible(){
        return securityCodeInput.isDisplayed();
    }

    public boolean isZipCodeInputVisible(){
        return zipCodeInput.isDisplayed();
    }
}
