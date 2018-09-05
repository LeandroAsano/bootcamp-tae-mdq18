package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents.comboboxworkflow;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Yo on 3/9/2018.
 */
public abstract class AbstractComboBox extends WebPage {



    protected void getComboBoxOption(String criteria){
        click(this.getOpenComboboxClickeable());
        Select ddl = new Select(this.getOpenComboboxClickeable());
        ddl.selectByVisibleText(criteria);
    }

    protected abstract WebElement getOpenComboboxClickeable();
}
