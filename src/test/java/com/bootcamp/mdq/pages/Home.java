package com.bootcamp.mdq.pages;

import com.bootcamp.mdq.page.BasePage;

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
