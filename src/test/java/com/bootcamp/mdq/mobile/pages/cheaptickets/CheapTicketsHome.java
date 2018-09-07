package com.bootcamp.mdq.mobile.pages.cheaptickets;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Test;
import org.openqa.selenium.support.CacheLookup;

public class CheapTicketsHome extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Close")
    private MobileElement closeLoginButton;

    public AccountView closeLogin() {
        click(closeLoginButton);
        return new AccountView();
    }


}
