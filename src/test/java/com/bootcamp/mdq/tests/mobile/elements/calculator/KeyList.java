package com.bootcamp.mdq.tests.mobile.elements.calculator;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


import java.util.List;

/**
 * Created by Yo on 6/9/2018.
 */
public class KeyList extends MobilePage {



    @AndroidFindBy(className = "android.widget.Button")
    private List<MobileElement> Keys;


    public Calculator opearation(String operationChars){
        for (char  c : operationChars.toCharArray()) {
            searchkey(c);
        }
        return new Calculator();
    }

    private void searchkey(char input){
        for (MobileElement e : Keys){
            if(getText(e).equals(String.valueOf(input))){
                System.out.println();
                click(e);
            }
        }
    }


}
