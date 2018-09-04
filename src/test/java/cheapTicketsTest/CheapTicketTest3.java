package cheapTicketsTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.homePage.HomePage;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheapTicketTest3 extends BaseTestSuite {

    private HomePage homePage;

    @Before
    public void setUp() {
        super.setUp();
        navigate("https://www.cheaptickets.com/");
        homePage = new HomePage();
    }

    @Test
    public void CheapTicketsTest3(){

        homePage.flightHeaderLink()
                .typeLocationFromFlight("LAS",0)
                .typeDestinationFlight("LAX")
                //checkin - checkout
                .adultsNumberToFlyInput(1)
                .clickSearchFlyButton();
    }

    @After
    public void tearDown() {
        DriverManager.dispose();
    }
}
