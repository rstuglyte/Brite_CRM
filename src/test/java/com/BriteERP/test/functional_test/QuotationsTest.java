package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.TestBase;
import org.testng.annotations.Test;

public class QuotationsTest extends TestBase {


    @Test
    public void  clickOnQuotations() {
        extentLogger = report.createTest("Automating TestCase 2825");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 5);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
    }

    @Test
    public void clickCreateButton () {
        extentLogger = report.createTest("Automating TestCase 2825");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 5);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 5);
        extentLogger.info("Click on Create button");
        pages.quotationsPage().createButton.click();
    }

    @Test
    public void enterCustomer(){
        extentLogger = report.createTest("Automating TestCase 2825");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 5);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 5);
        extentLogger.info("Click on Create button");
        pages.quotationsPage().createButton.click();

        extentLogger.info("Click on dropdow box");
        pages.quotationsPage().select1.click();




        }

    }
