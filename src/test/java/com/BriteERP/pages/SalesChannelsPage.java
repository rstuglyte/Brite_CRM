package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesChannelsPage {
    public SalesChannelsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[1]/a/span")
    public WebElement SalesChannelsButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement CreateButton;

 //   @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[2]")
  //  public WebElement Import;

    @FindBy(xpath = "//div//ol//li")
    public WebElement Pipeline;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement salesChannelText;

   @FindBy(xpath = "//*[@class='o_form_label oe_edit_only']")
   public WebElement SalesName;

////
//    @FindBy(xpath = "");
//    public WebElement ;
//
//    @FindBy(xpath = "");
//    public WebElement ;
//
//    @FindBy(xpath = "");
//    public WebElement ;
//
//    @FindBy(xpath = "");
//    public WebElement ;



}