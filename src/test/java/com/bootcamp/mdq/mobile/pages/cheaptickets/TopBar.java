package com.bootcamp.mdq.mobile.pages.cheaptickets;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

public class TopBar extends MobilePage {

    @CacheLookup
    @AndroidFindBy(accessibility = "Shop travel tab")
    private MobileElement shopTravelTab;

    @CacheLookup
    @AndroidFindBy(accessibility = "Trips tab")
    private MobileElement tripsTab;

    @CacheLookup
    @AndroidFindBy(accessibility = "Account tab")
    private MobileElement accountTab;

    public ShopTravelView switchToShopTravel() {
        click(shopTravelTab);
        return new ShopTravelView();
    }

    public AccountView switchToAccountView() {
        click(accountTab);
        return new AccountView();
    }
}
