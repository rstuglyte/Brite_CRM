package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NewEventTest extends TestBase {




    @Test
    public void nameNewEventTest() throws InterruptedException {
        //BRIT-3211

       pages.loginPage().open();
       pages.loginPage().BriteErpDemo_button.click();
       pages.loginPage().email.sendKeys(ConfigurationReader.getProperty("manager"));
       pages.loginPage().password.sendKeys(ConfigurationReader.getProperty("managerpass"));
       pages.loginPage().login.click();
       pages.loginPage().crmButtn.click();

        pages.newEventPage().LeadsOp.click();

        Thread.sleep(3000);

        pages.newEventPage().lostReason.click();

        Thread.sleep(2000);

        Assert.assertEquals(driver.getTitle(),"Lost Reasons - Odoo");
    }

    @Test
    public void sadsad(){


    }

    @Test
    public void test3(){


    }
}
