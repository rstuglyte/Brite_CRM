package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityTypesPage {
    public ActivityTypesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class=\"o_searchview_input\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement search_Plus;

    @FindBy(xpath = "(//span[@class=\"caret\"])[3]")
    public WebElement Filters;

    @FindBy(xpath = "(//span[@class=\"caret\"])[4]")
    public WebElement GroupBy;

    @FindBy(xpath = "(//span[@class=\"caret\"])[5]")
    public WebElement Favorites;


}
