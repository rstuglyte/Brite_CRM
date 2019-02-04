package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityTypesPage {
    public ActivityTypesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//input[@class=\"o_searchview_input\"]")
//    public WebElement searchBox;
//
//    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
//    public WebElement search_Plus;
//
//    @FindBy(xpath = "(//span[@class=\"caret\"])[3]")
//    public WebElement Filters;
//
//    @FindBy(xpath = "(//span[@class=\"caret\"])[4]")
//    public WebElement GroupBy;
//
//    @FindBy(xpath = "(//span[@class=\"caret\"])[5]")
//    public WebElement Favorites;



    @FindBy(xpath = "//a[@data-menu-xmlid='crm.crm_team_menu_config_activity_types']")
    public  WebElement activityTypes;


    @FindBy(xpath = "//button[@ class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement create ;

    @FindBy(xpath =   "//input[@ class='o_field_char o_field_widget o_input o_required_modifier' ]")
    public WebElement  createName;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement selectImport;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editName;





}




