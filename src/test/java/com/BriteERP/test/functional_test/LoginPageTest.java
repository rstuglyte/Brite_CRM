package com.BriteERP.test.functional_test;

import com.BriteERP.utilieties.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class LoginPageTest extends TestBase {


    @Test()
    public void singInTest(){

    pages.loginPage().BriteErpDemo_button.click();
    pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
    pages.loginPage().password.sendKeys("Ugh45wQ12");
    pages.loginPage().login.click();
    pages.crmPage().crmButtn.click();

    }

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
//password