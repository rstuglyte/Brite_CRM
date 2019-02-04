package com.BriteERP.test.smoke_test;

import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilietes.ApplicationConstants;
import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.TestBase;
import javafx.application.Application;
import org.testng.Assert;
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
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        wait(10);
        String actualTitle= driver.getTitle();
        extentLogger.info("Verifying homepage title");
        assertEquals(actualTitle, ApplicationConstants.HOME_PAGE_TITLE);
        extentLogger.pass("Passed: CRM home page test");


    }

//    @Test(groups = { "regression","smoke" } )
//    public void wrongPasswordTest() {
//        extentLogger = report.createTest("Wrong password test");
//        extentLogger.info("Entering login information");
//        pages.login().login(ConfigurationReader.getProperty("username"), "wrong password");
//
//        String actualError = pages.login().errorMessage.getText();
//        extentLogger.info("Verifying error message");
//        assertEquals(actualError, LOGIN_ERROR_MESSAGE);
//        extentLogger .pass("Passed:Wrong password test");
//
//    }

}










//        extentLogger = report.createTest("Sing in test");
//        extentLogger.info("Verifying singin page title");
//
//       Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGIN_PAGE_TITLE);
//       extentLogger.info("Login to application");
//       pages.loginPag
//
//       extentLogger.info("Verifying url");
//       Assert.assertEquals(driver.getTitle(), ApplicationConstants.APPLICATION_TITLE);
//
//       Assert.assertEquals(driver.getCurrentUrl(), "52.39.162.23");
//
//       fail();
//       extentLogger.pass("");
//
//       pass