package com.BriteERP.test.smoke_test;

import com.BriteERP.utilietes.ApplicationConstants;
import com.BriteERP.utilietes.BrowserUtils;
import com.BriteERP.utilietes.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PipelineTest extends TestBase {

    @Test(groups = "smoke")
    public void ClickPipline(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().Pipline_button.click();
        extentLogger.info("Verifying Pipline page title");
        BrowserUtils.wait(5);
        String actual = pages.pipelinePage().PiplinePage_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.PiplinePage_Title);


    }





}
