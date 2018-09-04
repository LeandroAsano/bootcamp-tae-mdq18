package cheapTicketsTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.homePage.HomePage;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheapTicketTest2 extends BaseTestSuite {
    private HomePage homePage;

    @Before
    public void setUp() {
        super.setUp();
        navigate("https://www.cheaptickets.com/");

        homePage = new HomePage();
    }

    @Test
    public void CheapTicketsTest2(){

        homePage.hotelHeaderLink()
                .typeLocation("Medellin")
                //checkin - checkout
                .childrenNumberInput(0)//ACA HAY QUE CAMBIARLO POR EL XPATH RELATIVO DEL CLOSE
                .adultsNumberInput(1)
                .clickSearchButton()
                //.closeBanner()
                .clickFirstHotelLink()
                .reserveHotel();

    }

    @After
    public void tearDown() {
        DriverManager.dispose();
    }

}
