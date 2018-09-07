package com.bootcamp.mdq.web.amazon.pages;

import com.bootcamp.mdq.page.web.WebPage;

public class HomeAmazon extends WebPage {

    private NavegationBar navegationBar;

    public HomeAmazon() {
        navegationBar=new NavegationBar();
    }

    public NavegationBar getNavegationBar(){
        return navegationBar;
    }



}
