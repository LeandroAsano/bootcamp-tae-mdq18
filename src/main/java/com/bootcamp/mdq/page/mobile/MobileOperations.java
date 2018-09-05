package com.bootcamp.mdq.page.mobile;

import com.bootcamp.mdq.page.CommonOperations;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import static com.bootcamp.mdq.driver.Drivers.getDriver;
import static com.bootcamp.mdq.waits.Waits.isClickable;
import static com.bootcamp.mdq.waits.Waits.isVisible;

public abstract class MobileOperations extends CommonOperations {

  /**
   * Types on the element.
   *
   * @param mobileElement the {@link MobileElement}
   * @param text          the text
   */
  protected void type(MobileElement mobileElement, String text) {
    isClickable(mobileElement);
    mobileElement.setValue(text);
  }

  /**
   * Tap on element.
   *
   * @param mobileElement the {@link MobileElement}
   */
  protected void tap(MobileElement mobileElement) {
    isClickable(mobileElement);
    touchActions().singleTap(mobileElement);
  }

  /**
   * Get text from a mobile element
   *
   * @param mobileElement the {@link MobileElement}
   * @return the text contained
   */
  protected String getText(MobileElement mobileElement) {
    isVisible(mobileElement);
    return mobileElement.getText();
  }

  private TouchActions touchActions() {
    return new TouchActions(getDriver().getWebDriver());
  }

}
