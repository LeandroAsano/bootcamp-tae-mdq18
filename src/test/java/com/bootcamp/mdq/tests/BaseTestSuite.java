package com.bootcamp.mdq.tests;

import org.junit.After;
import org.junit.Before;

import static com.bootcamp.mdq.driver.DriverManager.dispose;
import static com.bootcamp.mdq.driver.DriverManager.getDriver;
import static com.bootcamp.mdq.driver.DriverManager.populateDriver;

public abstract class BaseTestSuite {

  /**
   * Creates a new browser session.
   */
  @Before
  public void setUp() {
    populateDriver("chrome");
    getDriver().get("https://www.cheaptickets.com/");
  }

  /**
   * Closes the browser by closing the Selenium server's session.
   */
  @After
  public void tearDown() {
    dispose();
  }

}
