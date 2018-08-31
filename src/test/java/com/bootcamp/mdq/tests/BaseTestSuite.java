package com.bootcamp.mdq.tests;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.CommonOperations;
import org.junit.After;
import org.junit.Before;

import static com.bootcamp.mdq.driver.DriverManager.dispose;
import static com.bootcamp.mdq.driver.DriverManager.populateDriver;

public abstract class BaseTestSuite extends CommonOperations {

  /**
   * Creates a new browser session.
   */
  @Before
  public void setUp() {
    populateDriver("chrome");
  }

  /**
   * Closes the browser by closing the Selenium server's session.
   */
  @After
  public void tearDown() {
    dispose();
  }

}
