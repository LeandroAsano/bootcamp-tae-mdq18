package com.bootcamp.mdq.page.web;

import com.bootcamp.mdq.page.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static com.bootcamp.mdq.waits.Waits.hasWindows;
import static com.bootcamp.mdq.waits.Waits.isClickable;
import static com.bootcamp.mdq.waits.Waits.isTextPresent;

public abstract class WebOperations extends CommonOperations {

    /**
     * Navigates to the URL.
     *
     * @param url the URL
     */
    protected void goTo(String url) {
        getDriver().getWebDriver().get(url);
    }

    /**
     * Refresh the page.
     */
    protected void refresh() {
        getDriver().getWebDriver().navigate().refresh();
    }


    /**
     * Types on the element.
     *
     * @param webElement the {@link WebElement}
     * @param text       the text
     */
    protected boolean type(WebElement webElement, String text) {
        isClickable(webElement).sendKeys(text);
        return isTextPresent(webElement, text);
    }

    /**
     * Selects an option by text from an HTML Select.
     *
     * @param webElement the {@link WebElement}
     * @param text       the text to select
     */
    protected void selectByText(WebElement webElement, String text) {
        select(isClickable(webElement)).selectByVisibleText(text);
    }

    private Select select(WebElement webElement) {
        return new Select(webElement);
    }


    public void setNumerOf(WebElement element, String amount) {
        Select selector = select(element);
        selector.selectByValue(amount);
    }

    public void changeWindow(int window) {
        hasWindows(window);
        ArrayList<String> windows = new ArrayList<String>(getDriver().getWebDriver().getWindowHandles());
        getDriver().getWebDriver().switchTo().window(windows.get(window - 1));
    }

}
