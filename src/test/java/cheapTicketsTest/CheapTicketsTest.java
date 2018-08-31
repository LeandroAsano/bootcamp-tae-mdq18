package cheapTicketsTest;

import com.bootcamp.mdq.driver.DriverManager;
import com.bootcamp.mdq.page.CommonOperations;
import com.bootcamp.mdq.page.home.Home;
import com.bootcamp.mdq.page.searchHotels.SearchHotels;
import com.bootcamp.mdq.tests.BaseTestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheapTicketsTest extends BaseTestSuite {

    private Home home;
    private SearchHotels searchHotels;

    @Before
    public void setUp() {
        super.setUp();
        navigate("https://www.cheaptickets.com/");

        home = new Home();
    }


    @Test
    public void cheapTicketTest(){

        //click on hotel header link
        searchHotels = home.clickHotel(home.hotelHeaderLink());

        //type on Search input hotel
        searchHotels.type(searchHotels.searchInput(),"Miami Beach");


    }

    @After
    public void tearDown() {
        DriverManager.dispose();

    }



}
