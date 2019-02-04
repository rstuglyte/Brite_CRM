package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.ApplicationConstants;
import com.BriteERP.utilietes.BrowserUtils;
import com.BriteERP.utilietes.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PiplineTest extends TestBase {

    @Test(groups = "regression")
    public void PieChart(){
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
        extentLogger.info("Clicking on the PIE Chart");
        pages.pipelinePage().Pie_Chart.click();
        BrowserUtils.wait(5);
        String actual=pages.pipelinePage().PiplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }
    @Test(groups ="regression" )
    public void BarlineCharts(){
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
        extentLogger.info("Clicking on the Line Chart");
        pages.pipelinePage().Line_Chart.click();






    }

}
