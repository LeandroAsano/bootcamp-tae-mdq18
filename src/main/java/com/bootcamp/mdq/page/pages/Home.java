package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

    private NavegationBar navegationBar;

    public Home() {
        navigate("https://www.cheaptickets.com");
        navegationBar=new NavegationBar();
    }

    public NavegationBar navegationBar(){
        return navegationBar;
    }

}
