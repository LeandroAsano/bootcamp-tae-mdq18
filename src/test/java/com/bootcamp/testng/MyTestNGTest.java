package com.bootcamp.testng;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.*;

import static java.lang.String.format;

@Listeners(MyTestNGTest.MyListener.class)
public class MyTestNGTest {

  @BeforeMethod
  public void testSetUp() {
    System.out.println("Before Method");
  }

  @AfterMethod
  public void testTearDown() {
    System.out.println("After Method");
  }

  @Test(dataProvider = "dataProvider")
  public void myTest(int num1, int num2, int expected) {
    System.out.println(format("Test Execution - myTest - with arguments %s and %s. Expected result is %s", num1, num2, expected));
    int actual = num1 + num2;
    Assert.assertTrue(actual == expected, format("The expected result is %s, but was %s", expected, actual));
  }

  @DataProvider(name = "dataProvider")
  public static Object[][] dataProvider() {
    return new Object[][] {{1, 2, 3}, {3, 4, 7}, {10, -10, 0}, {5, 1, 6}};
  }

  public static class MyListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {
      super.onTestFailure(tr);
      System.out.println("Failure Reason: " + tr.getThrowable().getLocalizedMessage());
    }

  }


}
