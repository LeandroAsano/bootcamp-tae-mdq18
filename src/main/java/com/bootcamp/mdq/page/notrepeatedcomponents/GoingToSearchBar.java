package com.bootcamp.mdq.page.notrepeatedcomponents;

import com.bootcamp.mdq.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.ResultSet;

public class GoingToSearchBar extends BasePage {

    @FindBy(id = "hotel-destination-hlp")
    private WebElement goingToSearchBarInput;

    private SugestionsForCompletedSearchBar sugestorModal;



    public GoingToSearchBar() {
        super();
        sugestorModal = new SugestionsForCompletedSearchBar();
    }

/*
*  TYPE : ESCRIBE EN LA BARRA EL CONTENIDO DE CRITERIA
*  COLSEMODAL: CIERRAR EL MODAL
 */
    public void enterDestinyCity(String criteria){
        type(goingToSearchBarInput,criteria);
        this.sugestorModal.closeModal();
    }
}
