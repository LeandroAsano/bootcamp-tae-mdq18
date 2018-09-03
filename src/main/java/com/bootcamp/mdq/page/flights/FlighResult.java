package com.bootcamp.mdq.page.flights;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Matias on 03/09/2018.
 */
public class FlighResult extends BasePage {

    @FindBy(css = "li.flight-module")
    private List<WebElement> flightList;


}
