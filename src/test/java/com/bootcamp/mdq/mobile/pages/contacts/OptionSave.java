package com.bootcamp.mdq.mobile.pages.contacts;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Matias on 06/09/2018.
 */
public class OptionSave extends MobilePage {

    @AndroidFindBy(id = "left_button")
    private MobileElement keepLocal;

    @AndroidFindBy(id = "right_button")
    private MobileElement addAccount;

    public AddContact keepLocal(){
        click(keepLocal);
        return new AddContact();
    }


}
