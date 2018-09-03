package com.bootcamp.mdq.page.notrepeatedcomponents.cheapticketshotelpagecomponents.comboboxworkflow;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Yo on 3/9/2018.
 */
public class AdultsComboBox  extends AbstractComboBox {

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement openComboboxClickeable;

    public ChildsComboBox adultsComboBoxSelector(String criteria){
        getComboBoxOption(criteria);
        return new ChildsComboBox();
    }

    public WebElement getOpenComboboxClickeable() {
        return openComboboxClickeable;
    }

}
