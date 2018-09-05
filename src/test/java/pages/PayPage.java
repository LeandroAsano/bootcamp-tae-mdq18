package pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PayPage extends WebPage {

    @FindBy (id= "payments")
    private WebElement creditCardContainer;

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


    public PayPage() {
    }

    public PayPage enterCardName(String name) {
        type(cardHolderName, name);
        return this;
    }

    public PayPage enterCardNumber(String number) {
        type(creditCardNumber, number);
        return this;
    }

    public PayPage selectExpiryMonth(String number) {
        setNumber(expirationMonth, number);
        return this;
    }

    public PayPage selectExpiryYear(String number) {
        setNumber(expirationYear, number);
        return this;
    }

    public PayPage enterSecurityCode(String Code) {
        type(securityCode, Code);
        return this;
    }

    public PayPage enterZipCode(String Code) {
        type(zipCode, Code);
        return this;
    }


    public boolean hasCardHolderName() {
        boolean i;
        if(cardHolderName==null){
            i=false;
        }else {
            i=true;
        }
        return i;
    }

    public boolean hasCreditCardNumber() {
        boolean i;
        if(creditCardNumber==null){
            i=false;
        }else {
            i=true;
        }
        return i;
    }

    public boolean hasMonthSelector() {
        boolean i;
        if(expirationMonth==null){
            i=false;
        }else {
            i=true;
        }
        return i;
    }

    public boolean hasExpirationYear() {
        boolean i;
        if(expirationYear==null){
            i=false;
        }else {
            i=true;
        }
        return i;
    }

    public boolean hasSecurityCode() {
        boolean i;
        if(securityCode==null){
            i=false;
        }else {
            i=true;
        }
        return i;
    }

    public boolean hasZipCode() {
        boolean i;
        if(zipCode==null){
            i=false;
        }else {
            i=true;
        }
        return i;
    }



}