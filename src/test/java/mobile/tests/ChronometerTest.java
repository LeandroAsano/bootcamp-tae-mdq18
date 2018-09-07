package mobile.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import mobile.pages.Clock;
import org.junit.Assert;
import org.junit.Test;

public class ChronometerTest extends BaseTestSuite {

    private Clock clock;

    @Test
    public void chronometerTest(){

        clock = new Clock();

        String time = clock
                .openChonometer()
                .start()
                .stopTime(22000)
                .getChronometerText();

        Assert.assertTrue("The range is ok",Integer.parseInt(time) < 25);
    }
}
