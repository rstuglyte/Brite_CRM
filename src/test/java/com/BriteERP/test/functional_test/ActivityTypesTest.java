package com.BriteERP.test.functional_test;

import com.BriteERP.utilieties.Driver;
import com.BriteERP.utilieties.TestBase;
//import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityTypesTest extends TestBase {


    @Test
    public void positiveTest() throws InterruptedException {
        extentLogger = report.createTest("Activity type Test");
        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com","Ugh45wQ12");

        extentLogger.info("Click CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        wait.until(ExpectedConditions.visibilityOf(pages.activityTypesPage().activityTypes));
        pages.activityTypesPage().activityTypes.click();




        extentLogger.info("Create a new name");
        pages.activityTypesPage().create.click();
        Assert.assertTrue(pages.activityTypesPage().create.isDisplayed());


        extentLogger.info("give a name ");

        pages.activityTypesPage().createName.sendKeys("gggg");


        extentLogger.info("save the name");
        pages.activityTypesPage().save.click();
        Assert.assertTrue(pages.activityTypesPage().save.isDisplayed());

        extentLogger.info(("edit the name"));
        pages.activityTypesPage().editName.click();
        Assert.assertTrue(pages.activityTypesPage().createName.isDisplayed());


    }
}