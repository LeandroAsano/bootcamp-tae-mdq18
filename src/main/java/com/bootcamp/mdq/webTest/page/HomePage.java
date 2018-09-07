package com.bootcamp.mdq.webTest.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {

    @FindBy(id="nav-link-shopall")
    private WebElement departmentsLink;



    public DepartmentsPage clickLink(){
        click(departmentsLink);
        return new DepartmentsPage();
    }
}
