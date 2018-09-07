package com.bootcamp.mdq.web.amazon.pages;

import com.bootcamp.mdq.page.web.WebPage;
import com.bootcamp.mdq.web.amazon.pages.component.ItemList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchResults extends WebPage {

    private NavegationBar navegationBar;

    @FindBy (className = "s-item-container")
    private List<WebElement> searchResulList;


    public List<String> getNameOfTheResults(){
        List<String> titles= new ArrayList<>();
        for (WebElement element : searchResulList){
           titles.add(new ItemList(element).getTitle());
        }
        return titles;
    }

    public ArticlePage clickOnFistElementWhitTheCrieria(String criteria){

        for (WebElement element: searchResulList){
            if((new ItemList(element)).getTitle().contains(criteria)){
                (new ItemList(element)).clickOnItem();
            }
        }
        return new ArticlePage();
    }






}
