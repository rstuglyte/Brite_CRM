package com.BriteERP.test.smoke_test;

import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.xml.ws.RequestWrapper;

public class QuotationsLogin extends TestBase {

    @Test
    public void clickQuotations (){
        extentLogger = report.createTest("Automating TestCase 724");
        extentLogger.info("Log in into website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click in on CRM module");
        pages.crmPage().crmButtn.click();
        WebDriverWait wait = new WebDriverWait(driver , 10);
        extentLogger.info("Click on Quotations functionality");
        wait.until(ExpectedConditions.elementToBeClickable(pages.quotationsPage().quotButton)).click();


    }



}
