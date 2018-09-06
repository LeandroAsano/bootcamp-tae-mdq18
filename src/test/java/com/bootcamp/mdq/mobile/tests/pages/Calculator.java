package com.bootcamp.mdq.mobile.tests.pages;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Calculator extends MobilePage {

    @AndroidFindBy(id="digit_1")
    private WebElement digit1;

    @AndroidFindBy(id = "digit_2")
    private WebElement digit2;


}
