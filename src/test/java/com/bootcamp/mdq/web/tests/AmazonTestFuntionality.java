package com.bootcamp.mdq.web.tests;
import com.bootcamp.mdq.testsuite.BaseTestSuite;
import com.bootcamp.mdq.web.amazon.pages.ArticlePage;
import com.bootcamp.mdq.web.amazon.pages.HomeAmazon;
import org.junit.Test;

public class AmazonTestFuntionality extends BaseTestSuite {

    private HomeAmazon home;

    @Test
    public void checkAmazonFuncionalityTest(){

        home =new HomeAmazon();

        ArticlePage results= home.getNavegationBar()
                .typeOnSearch("iphone 7")
                .clickOnSearch()
                .clickOnFistElementWhitTheCrieria("Rose Gold");

    }
}
