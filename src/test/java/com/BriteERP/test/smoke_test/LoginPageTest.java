package com.BriteERP.test.smoke_test;

import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilieties.ApplicationConstants;
import com.BriteERP.utilieties.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class LoginPageTest extends TestBase {


    @Test(groups="smoke")
    public void singInTest(){

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Positive sign in test");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        wait(10);
        String actualTitle= driver.getTitle();
        extentLogger.info("Verifying homepage title");
        assertEquals(actualTitle, ApplicationConstants.HOME_PAGE_TITLE);
        extentLogger.pass("Passed: CRM home page test");


    }

}









