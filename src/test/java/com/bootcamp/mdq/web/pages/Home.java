package com.bootcamp.mdq.web.pages;


import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.pages.components.NavegationBar;

public class Home extends WebPage {

    private NavegationBar navegationBar;

    public Home() {
        goTo("https://www.cheaptickets.com");
        navegationBar=new NavegationBar();
    }

    public NavegationBar navegationBar(){
        return navegationBar;
    }

}

