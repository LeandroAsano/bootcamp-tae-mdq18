package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.comboboxworkflow;


import com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.SearchButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Yo on 3/9/2018.
 */
public class AdultsComboBox  extends AbstractComboBox {

    @FindBy(id = "hotel-1-adults-hlp")
    private WebElement openComboboxClickeable;

    public AdultsComboBox() {
    }

    public ChildsComboBox adultsComboBoxSelector(String criteria){
        getComboBoxOption(criteria);
        return new ChildsComboBox();
    }

    public SearchButton adultsComboBoxSelector2(String criteria){
        getComboBoxOption(criteria);
        return new SearchButton();
    }

    public WebElement getOpenComboboxClickeable() {
        return openComboboxClickeable;
    }

}
