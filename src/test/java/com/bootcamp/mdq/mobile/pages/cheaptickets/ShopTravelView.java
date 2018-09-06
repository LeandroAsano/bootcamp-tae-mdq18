package com.bootcamp.mdq.mobile.pages.cheaptickets;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ShopTravelView extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Hotels Button")
    private MobileElement hotelsButton;

    private TopBar topBar;

    public ShopTravelView() {
        this.topBar = new TopBar();
    }

    public AccountView switchToAccount() {
        return topBar.switchToAccountView();
    }

    public HotelsSearchView switchToHotelsSearch() {
        click(hotelsButton);
        return new HotelsSearchView();
    }
}
