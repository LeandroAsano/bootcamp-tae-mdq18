package com.bootcamp.mdq.tests.mobile.elements.deskclock;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


/**
 * Created by Yo on 6/9/2018.
 */
public class DeskClock extends MobilePage{

    @AndroidFindBy(id = "Stopwatch")
    private MobileElement goToChronometerButton;

    public ChronometerScreen goToChronometer(){
        click(goToChronometerButton);
        return new ChronometerScreen();
    }

}
