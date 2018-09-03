package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.comboboxworkflow;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Yo on 3/9/2018.
 */
public class ChildsComboBox extends AbstractComboBox {

    @FindBy(id = "hotel-1-children-hlp")
    private WebElement openComboboxClickeable;

    public AgeComboBox childsComboBoxSelector(String criteria){
        getComboBoxOption(criteria);
        return new AgeComboBox();
    }

    public WebElement getOpenComboboxClickeable() {
        return openComboboxClickeable;
    }

}
