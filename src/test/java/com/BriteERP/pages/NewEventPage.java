package com.BriteERP.pages;

import com.BriteERP.utilietes.BrowserUtils;
import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


@Test
public class NewEventPage {


    public NewEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement briteErpDemoButton;

    @FindBy(xpath = "//a[@class='navbar-brand logo']")
    public  WebElement briteLogoHomeButton;

    @FindBy(xpath = "//li[@id='new-content-menu']/a")
    public WebElement newButton;

    @FindBy(xpath = "(//*[@class='oe_menu_text'])[35]")
    public WebElement LeadsOp;

    @FindBy(xpath = "(//*[@class='oe_menu_text'])[37]")
    public WebElement lostReason;

    public void open(){
        briteErpDemoButton.click();
        BrowserUtils.wait(5);


    }


}
