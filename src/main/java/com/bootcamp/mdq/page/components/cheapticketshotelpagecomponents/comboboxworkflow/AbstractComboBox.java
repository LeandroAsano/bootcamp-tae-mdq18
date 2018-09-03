package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.comboboxworkflow;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Yo on 3/9/2018.
 */
public abstract class AbstractComboBox extends BasePage {



    protected void getComboBoxOption(String criteria){
        click(this.getOpenComboboxClickeable());
        Select ddl = new Select(this.getOpenComboboxClickeable());
        ddl.selectByVisibleText(criteria);
    }

    protected abstract WebElement getOpenComboboxClickeable();
}
