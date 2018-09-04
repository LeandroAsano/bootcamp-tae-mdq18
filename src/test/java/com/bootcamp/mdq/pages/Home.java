package com.bootcamp.mdq.pages;


import com.bootcamp.mdq.page.web.WebPage;

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

