package com.bootcamp.mdq.mobile.pages.cheaptickets;

import com.bootcamp.mdq.page.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class HotelsSearchView extends MobilePage {

    @CacheLookup
    @AndroidFindBy(id = "search_src_text")
    private MobileElement locationSearchInputField;

    @CacheLookup
    @AndroidFindBy(id = "suggestion_text_container")
    private List<MobileElement> suggestionsLocationList;

    public HotelsSearchView enterLocation(String name) {
        type(locationSearchInputField, name);
        return this;
    }

    public CalendarView selectSuggestedLocation(int suggestionId) {
        click(suggestionsLocationList.get(suggestionId));
        return new CalendarView();
    }


}
