package com.bootcamp.mdq.page.pages;

import com.bootcamp.mdq.page.BasePage;
import com.bootcamp.mdq.page.CommonOperations;
import com.bootcamp.mdq.page.component.BaseComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hotels extends BasePage {

        @FindBy (id = "hotel-destination-hlp")
        private WebElement goinTofield;

        @FindBy (css = "a.close")
        private WebElement closeDestination;

        @FindBy (id= "hotel-checkin-hlp")
        private WebElement checkInDate;

        @FindBy (id="hotel-checkout-hlp")
        private WebElement checkOutDate;

        @FindBy (id="package-rooms-hp-package")
        private WebElement amountOfRooms;

        // Deberia tener el selector directamente como atributo o seguir trabajando con el webElement?
        // Sino ttendria que llamar al DriverManage...
        // private  Select amountOfRooms;

        @FindBy (id="hotel-1-adults-hlp")
        private WebElement amountOfAdults;

        @FindBy (id= "hotel-1-children-hlp")
        private WebElement amountOfChilden;

        @FindBy (id="hotel-1-age-select-1-hlp")
        private WebElement child1Age;

        @FindBy(css = "[data-gcw-change-submit-text='Search']")
        private WebElement searchButton;

        @FindBy(id="hero-banner")
        private WebElement banner;

        public Hotels() {
            super();
        }

        public ResultsOfSearch clickOnSearch(){
                click(searchButton);
                return new ResultsOfSearch();
        }

        public WebElement getGoinTofield(){
                return goinTofield;
        }

        public WebElement closeDestination(){
                return closeDestination;
        }

        public WebElement amountOfRooms() {
                return amountOfRooms;
        }

        public WebElement amountOfAdults() {
                return amountOfAdults;
        }

        public WebElement amountOfChilden() {
                return amountOfChilden;
        }

        public WebElement child1Age() {
                return child1Age;
        }

        public WebElement SearchButton() {
                return searchButton;
        }

        public WebElement banner(){
                return banner;
        }

        public WebElement checkInDate(){
                return checkInDate;
        }
        public  WebElement checkOutDate(){
                return  checkOutDate;
        }
}
