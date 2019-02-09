package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

       Assert.assertTrue(pages.quotationsPage().quotButton.isDisplayed());
    }

    @Test
    public void clickCreateButton () {
        extentLogger = report.createTest("Automating TestCase 2825");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 15);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 15);
        extentLogger.info("Click on Create button");
       //Assert.assertTrue(pages.quotationsPage().createButton.isDisplayed());
        pages.quotationsPage().createButton.click();
    }

    @Test
       /*
     Step 1	--click drop down  --
        Step 2	Verify customer drop down menu contains Search more...
      */
    public void searchMore(){
        extentLogger = report.createTest("Automating TestCase 2825");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        waitForClickablility(pages.crmPage().crmButtn,15);
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 15);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 15);
        extentLogger.info("Click on Create button");
        pages.quotationsPage().createButton.click();

        extentLogger.info("Click on dropdown box");
        waitForClickablility(pages.quotationsPage().select1,15);
        pages.quotationsPage().select1.click();

        extentLogger.info("Search and more is displayed in dropdown menu");
        Assert.assertTrue(pages.quotationsPage().searchMore.isDisplayed());

    }

    @Test
    /*
     Step 1	--click drop down--
        Step 2	Verify customer drop down menu contains create and edit...
     */
    public void dropdownBoxCreateAndEdit(){
        extentLogger = report.createTest("Automating TestCase 2825");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 15);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 15);
        extentLogger.info("Click on Create button");
        pages.quotationsPage().createButton.click();

        extentLogger.info("Click on dropdown box");
        waitForClickablility(pages.quotationsPage().select1,15);
        pages.quotationsPage().select1.click();

        extentLogger.info("Create and edit is displayed in dropdown menu");
        waitForClickablility(pages.quotationsPage().createAndEdit, 15);
        Assert.assertTrue(pages.quotationsPage().createAndEdit.isDisplayed());


        }
        /*
        verify that save button is displayed
         */
        @Test
    public void saveButton(){
            extentLogger = report.createTest("Automating TestCase 2825");
            extentLogger.info("Log in into Website as a Manager");
            pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
            extentLogger.info("Click on CRM module");
            pages.crmPage().crmButtn.click();
            waitForClickablility(pages.quotationsPage().quotButton, 20);
            extentLogger.info("Click on Quotations functionality");
            pages.quotationsPage().quotButton.click();
            waitForClickablility(pages.quotationsPage().createButton, 20);
            extentLogger.info("Click on Create button");
            pages.quotationsPage().createButton.click();

            extentLogger.info("Save button is displayed");
            Assert.assertTrue(pages.quotationsPage().save.isDisplayed());
            //System.out.println(pages.quotationsPage().save.isDisplayed());  //==> true


        }
        /*
        verify that discard button is displayed
         */
        @Test
    public void discardButton(){
            extentLogger = report.createTest("Automating TestCase 2825");
            extentLogger.info("Log in into Website as a Manager");
            pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
            extentLogger.info("Click on CRM module");
            pages.crmPage().crmButtn.click();
            waitForClickablility(pages.quotationsPage().quotButton, 20);
            extentLogger.info("Click on Quotations functionality");
            pages.quotationsPage().quotButton.click();
            waitForClickablility(pages.quotationsPage().createButton, 20);
            extentLogger.info("Click on Create button");
            pages.quotationsPage().createButton.click();

            extentLogger.info("Discard button is displayed");
           // System.out.println(pages.quotationsPage().discard.isDisplayed());  //true
            Assert.assertTrue(pages.quotationsPage().discard.isDisplayed());
        }
    /*
   verify that Send By Email button is displayed
    */
        @Test
    public void sendByEmail(){
            extentLogger = report.createTest("Automating TestCase 2825");
            extentLogger.info("Log in into Website as a Manager");
            pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
            extentLogger.info("Click on CRM module");
            pages.crmPage().crmButtn.click();
            waitForClickablility(pages.quotationsPage().quotButton, 20);
            extentLogger.info("Click on Quotations functionality");
            pages.quotationsPage().quotButton.click();
            waitForClickablility(pages.quotationsPage().createButton, 20);
            extentLogger.info("Click on Create button");
            pages.quotationsPage().createButton.click();

            extentLogger.info("Send By Email button is displayed");
            //System.out.println(pages.quotationsPage().sendByEmail.isDisplayed()); // true
            Assert.assertTrue(pages.quotationsPage().sendByEmail.isDisplayed());

        }
        @Test
    public void print(){
            extentLogger = report.createTest("Automating TestCase 2825");
            extentLogger.info("Log in into Website as a Manager");
            pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
            extentLogger.info("Click on CRM module");
            pages.crmPage().crmButtn.click();
            waitForClickablility(pages.quotationsPage().quotButton, 20);
            extentLogger.info("Click on Quotations functionality");
            pages.quotationsPage().quotButton.click();
            waitForClickablility(pages.quotationsPage().createButton, 20);
            extentLogger.info("Click on Create button");
            pages.quotationsPage().createButton.click();

            extentLogger.info("Print button is displayed");
           // System.out.println(pages.quotationsPage().print.isDisplayed()); // true
            Assert.assertTrue(pages.quotationsPage().print.isDisplayed());
        }




    }



