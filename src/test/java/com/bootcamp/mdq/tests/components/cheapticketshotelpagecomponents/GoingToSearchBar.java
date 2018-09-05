package com.bootcamp.mdq.tests.components.cheapticketshotelpagecomponents;

import com.bootcamp.mdq.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bootcamp.mdq.page.web.WebOperations;
import java.time.LocalDate;



public class GoingToSearchBar extends WebPage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement goingToSearchBarInput;

    public SugestionsForCompletedSearchBar getSugestorModal() {
        return sugestorModal;
    }

    private SugestionsForCompletedSearchBar sugestorModal;

    private MyCalendar checkinCalendar;

    public GoingToSearchBar() {
        super();
        sugestorModal = new SugestionsForCompletedSearchBar();
    }

    public GoingToSearchBar enterDestinyCity(String criteria){
        type(goingToSearchBarInput,criteria);
        this.sugestorModal.closeModal();
        return new GoingToSearchBar();
    }

    public MyCalendar calendar(int year, int month , int day,int time){
        LocalDate criteria = LocalDate.of(year,month,day);
        return new MyCalendar(criteria,time);
    }
}
