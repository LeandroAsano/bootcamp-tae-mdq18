package cheapTicketsTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.bookPage.BookPage;
import com.bootcamp.mdq.page.homePage.HomePage;
import com.bootcamp.mdq.page.hotelResultsPage.HotelResultsPage;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheapTicketsTest extends BaseTestSuite {

    private HomePage homePage;

    @Before
    public void setUp() {
        super.setUp();
        navigate("https://www.cheaptickets.com/");

        homePage = new HomePage();
    }


    @Test
    public void cheapTicketTest(){

        homePage.hotelHeaderLink()
            .typeLocation("Miami Beach")
            .closeSearchInput()
            .childrenNumberInput(1)
            .adultsNumberInput(4)
            .childAge(7)
            //BONUS CHECK-IN
            //.typeCheckIn("10/25/2018")
            .clickSearchButton()
            .typeLocation("Faena Hotel Miami Beach")
            //BONUS TIPEAR FAENA Y CLIKEAR EL PRIMERO
            .clickGoButton();

            //============ASSERTS===================

            //step 9
            assertNotEquals("NO HAY NINGUN RESULTADO PARA FAENA HOTEL",0,BookPage.isEnabled());
            //step 8-b
            assertNotEquals("NO HAY NINGUN RESULTADO PARA MIAMI BEACH",0, HotelResultsPage.hotelCards());
            //step 8-a


    }

    @After
    public void tearDown() {
        DriverManager.dispose();

    }



}
