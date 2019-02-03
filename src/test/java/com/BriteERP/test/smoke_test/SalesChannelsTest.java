package com.BriteERP.test.smoke_test;

import com.BriteERP.pages.LoginPage;
import com.BriteERP.pages.SalesChannelsPage;
import com.BriteERP.utilietes.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SalesChannelsTest extends TestBase {

    @Test
    public void test1() throws InterruptedException {

        loginPage.open();//step 1
        loginPage.login();//step 2
        loginPage.crmButtn.click();//step 3
        Thread.sleep(3000);
        String pipeLine = salesChannels.Pipeline.getText();
        Assert.assertEquals(pipeLine,"Pipeline");


    }

    @Test
    public void test2() throws InterruptedException {
        loginPage.open();//step 1
        loginPage.login();//step 2
        loginPage.crmButtn.click();//step 3
        Thread.sleep(2000);
        salesChannels.SalesChannelsButton.click();
        Thread.sleep(3000);
        String sCh = salesChannels.salesChannelText.getText();
        Assert.assertEquals(sCh,"Sales Channels");
    }


    @Test
    public void test3() throws InterruptedException {
        loginPage.open();//step 1
        loginPage.login();//step 2
        loginPage.crmButtn.click();//step 3
        Thread.sleep(5000);
        salesChannels.SalesChannelsButton.click();
        Thread.sleep(5000);
        salesChannels.CreateButton.click();
        Thread.sleep(5000);
        String salesTeam = salesChannels.SalesName.getText();
        Assert.assertEquals(salesTeam,"Sales Channel");


    }


}
