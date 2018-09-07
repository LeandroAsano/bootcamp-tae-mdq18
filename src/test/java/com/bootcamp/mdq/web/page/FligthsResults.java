package com.bootcamp.mdq.web.page;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FligthsResults extends WebPage {

    @FindBy(css = ".flight-module.segment.offer-listing")
    private List<WebElement> flightsResultsContainer;


}
