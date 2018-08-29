package com.bootcamp.junit;

import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static java.lang.String.format;

@RunWith(Parameterized.class)
public class MyJUnitTest {

  @Rule
  public TestWatcher testWatcher = new TestWatcher() {
    @Override
    protected void failed(Throwable e, Description description) {
      super.failed(e, description);
      System.out.println("Failure Reason: " + e.getLocalizedMessage());
    }
  };

  private int num1;
  private int num2;
  private int expected;

  public MyJUnitTest(int num1, int num2, int expected) {
    this.num1 = num1;
    this.num2 = num2;
    this.expected = expected;
  }

  @Before
  public void testSetUp() {
    System.out.println("Before");
  }

  @After
  public void testTearDown() {
    System.out.println("After");
  }

  @Test
  public void myTest() {
    System.out.println(format("Test Execution - myTest - with arguments %s and %s. Expected expected is %s", num1, num2, expected));
    int actual = num1 + num2;
    Assert.assertTrue(format("The expected expected is %s, but was %s", expected, actual), num1 + num2 == expected);
  }

  @Parameters
  public static Object[][] testParameters() {
    return new Object[][] {{1, 2, 3}, {3, 4, 7}, {10, -10, 0}, {5, 1, 6}};
  }

}
