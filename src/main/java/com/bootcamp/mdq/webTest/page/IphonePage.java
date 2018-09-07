package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IphonePage extends WebPage {



    @FindBy(id = "s-results-list-atf")
    private List<WebElement> iphoneList;

    @FindBy(css = "#result_1 > div > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div:nth-child(1) > a > h2")
    private WebElement cardLink;

    public IphoneCard searchIphone(String condition){
        Boolean isCondition = false ;
        int index = 0 ;

        while (isCondition == false)
            if(iphoneList.get(index).getText().contains(condition))
                isCondition = true ;
            else
                index ++ ;

        if(isCondition == true)
            //click(iphoneList.get(index));
            click(cardLink);
        return new IphoneCard();
    } //to be rose gold
}
