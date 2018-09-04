package page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends WebPage {

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

    public boolean isDisplayedCardHolderNameInput() {
        return isDisplayed(cardHolderNameInput);
    }

    public boolean isDisplayedCreditCardInput() {
        return isDisplayed(creditCardInput);
    }

    public boolean isDisplayedExpirationDateMonthSelect() {
        return isDisplayed(expirationDateMonthSelect);
    }

    public boolean isDisplayedExpirationDateYearSelect() {
        return isDisplayed(expirationDateYearSelect);
    }

    public boolean isDisplayedSecurityCodeInput() {
        return isDisplayed(securityCodeInput);
    }

    public boolean isDisplayedBillingZipCodeInput() {
        return isDisplayed(billingZipCodeInput);
    }

}
