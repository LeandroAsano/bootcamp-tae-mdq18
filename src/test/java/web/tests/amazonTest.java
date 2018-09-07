package web.tests;

import com.bootcamp.mdq.testsuite.BaseTestSuite;
import org.junit.Test;
import web.pages.CartPage;
import web.pages.Home;

public class amazonTest extends BaseTestSuite {

    private Home home;

    @Test
    public void amazonTest() {

        home = new Home;

        CartPage cartPage = home.header()
                .clickDropdown()
                .selectDropdown()
                .searchingProduct("Iphone 7")
                .search()

    }
}
