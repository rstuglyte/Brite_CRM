package com.BriteERP.pages;

import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.Driver;
import com.BriteERP.utilietes.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='list-group']/a[2]")
    public WebElement BriteErpDemo_button;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[2]")
    public WebElement crmButtn;


    public void singin(String usr, String pass) {
        BriteErpDemo_button.sendKeys();
        email.sendKeys(usr);
        password.sendKeys(pass);
        login.click();

    }

        public void open() {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    public void login() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        BriteErpDemo_button.click();
        email.sendKeys(ConfigurationReader.getProperty("manager"));
        password.sendKeys(ConfigurationReader.getProperty("managerpass"));
        login.click();
    }

    public void crm(){
        crmButtn.click();
    }
}



