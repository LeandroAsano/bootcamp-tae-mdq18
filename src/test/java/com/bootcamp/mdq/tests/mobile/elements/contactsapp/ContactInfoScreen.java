package com.bootcamp.mdq.tests.mobile.elements.contactsapp;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Yo on 7/9/2018.
 */
public class ContactInfoScreen extends MobilePage{

    @CacheLookup
    @FindBy(id = "photo_touch_intercept_overlay")
    private MobileElement name;


    @CacheLookup
    @AndroidFindBy(className="android.widget.TextView")
    private List<MobileElement> contactData;

    @CacheLookup
    @FindBy(id = "More options")
    private MobileElement moreOptionsButton;



    public List<String> getData() {

        System.out.println(name.getAttribute("contentDescription"));
        return Arrays.asList(name.getAttribute("contentDescription"),
                getText(contactData.get(2)).replace("-",""),
                getText(contactData.get(4)));
    }


    public MoreOptionsPanel clickMoreOptions(){
        click(moreOptionsButton);
        return new MoreOptionsPanel();
    }



}
