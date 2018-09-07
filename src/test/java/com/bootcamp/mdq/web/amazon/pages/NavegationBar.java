package com.bootcamp.mdq.web.amazon.pages;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavegationBar extends WebPage {

@FindBy (id="searchDropdownBox")
    private WebElement searchDropBox;

@FindBy (id="twotabsearchtextbox")
    private WebElement searchFild;

@FindBy (css = "input.nav-input")
    private WebElement searchButton;

public NavegationBar(){
}

/*
public List<String> getCategories(){
    List<String> elements=new ArrayList<>();
    for (WebElement r: searchDropBox){
        elements.add(getText(r));
    }
    return elements;

}*/

public NavegationBar chooseCategorie(int position){
    //click(searchDropBox.get(position));
    return this;
}

public NavegationBar typeOnSearch(String textTosearch){
    type(searchFild, textTosearch);
    return this;
}

public SearchResults clickOnSearch(){
    click(searchButton);
    return new SearchResults();
}

public NavegationBar clickOnCategories(String categorie){
    selectByText(searchDropBox,categorie);
    return this;
}




}
