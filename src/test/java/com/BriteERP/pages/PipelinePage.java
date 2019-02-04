package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PipelinePage extends CRMpage {

    public PipelinePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="(//span[@class='oe_menu_text'])[30]")
    public WebElement Pipline_button;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[3]")
    ////div[@class='btn-group btn-group-sm'][2]/button[3]
    public WebElement Pie_Chart;


    @FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[2]")
    public WebElement Line_Chart;

//    @FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
//    public WebElement Bar_Chart;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement PiplinePage_Title;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement PiplinePieChart_Title;











}
