package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.comboboxworkflow;

import com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.SearchButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yo on 3/9/2018.
 */
public class AgeComboBox extends AbstractComboBox{

    @FindBy(id = "hotel-1-age-select-1-hlp")
    private WebElement openComboboxClickeable;

    public SearchButton ageChildComboBoxSelector(String criteria){
        getComboBoxOption(criteria);
        return new SearchButton();
    }

    public WebElement getOpenComboboxClickeable() {
        return openComboboxClickeable;
    }
}
