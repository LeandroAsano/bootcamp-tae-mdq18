package com.bootcamp.mdq.mobile.pages.cheaptickets;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class AccountView extends MobilePage {

    private TopBar topBar;

    @CacheLookup
    @AndroidFindBy(xpath = "//*[contains(@text, 'OK')]")
    private MobileElement acceptPopupMessageButton;

    public AccountView() {
        this.topBar = new TopBar();
    }

    public AccountView acceptPopupMessage() {
        click(acceptPopupMessageButton);
        return this;
    }

    public ShopTravelView switchToShopTravel() {
        return topBar.switchToShopTravel();
    }
}
