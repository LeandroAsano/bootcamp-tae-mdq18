package cheapTicketsTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.home.Home;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheapTicketsTest extends BaseTestSuite {

    private Home home;

    @Before
    public void setUp() {
        super.setUp();
        navigate("https://www.cheaptickets.com/");

        home = new Home();
    }


    @Test
    public void cheapTicketTest(){

        //click on hotel header link type Miami Beach on SearchInput
        home.hotelHeaderLink().typeCheckIn("10/25/2018").typeLocation("Miami Beach");

    }

    @After
    public void tearDown() {
        DriverManager.dispose();

    }



}
