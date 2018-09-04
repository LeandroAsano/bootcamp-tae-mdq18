package com.bootcamp.mdq.testsuite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.net.MalformedURLException;

import static com.bootcamp.mdq.driver.Drivers.dispose;
import static com.bootcamp.mdq.driver.Drivers.populateDriver;
import static com.bootcamp.mdq.platform.Platform.WEB;
import static com.bootcamp.mdq.properties.TestProperties.TEST_PROPERTIES;
import static com.bootcamp.mdq.server.SeleniumStandaloneServer.SERVER;
import static junit.framework.Assert.fail;

/**
 * BaseTestSuite represents the base suite for all the test suites in the test automation project.
 * A new suite should inherit BaseTestSuite functionality.
 */
public abstract class BaseTestSuite {

  @BeforeClass
  public static void suiteSetUp() {
    if (WEB.equals(TEST_PROPERTIES.getPlatform())) {
      SERVER.start();
    }
  }

  @AfterClass
  public static void suiteTearDown() {
    if (WEB.equals(TEST_PROPERTIES.getPlatform())) {
      SERVER.stop();
    }
  }

  @Before
  public void testSetUp() {
    try {
      populateDriver(TEST_PROPERTIES.getPlatform(), TEST_PROPERTIES.getBrowser());
    } catch (MalformedURLException e) {
      fail("Unable to populateDriver an instance of the getDriver, please check the configuration.");
    }
  }

  @After
  public void testTearDown() {
    dispose();
  }

}
