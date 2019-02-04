package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Quotations {

        public Quotations(){PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//a[@data-menu='536']")
        public WebElement quotButton;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
        public WebElement createButton;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
        public WebElement customer;

        @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item'])[3]/a")
        public WebElement createAndEdit;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
        public WebElement invoiceAddress;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
        public WebElement deliveryAddress;

        @FindBy(xpath = "//input[@name='validity_date']")
        public WebElement expirationDate ;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
        public WebElement priceList;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[5]")
        public WebElement paymentTerms;


        @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
        public Select select;

        @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
        public WebElement select1;


    }



