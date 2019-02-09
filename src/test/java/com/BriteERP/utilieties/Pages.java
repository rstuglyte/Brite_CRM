package com.BriteERP.utilieties;

import com.BriteERP.pages.ActivityTypesPage;
import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.pages.PipelinePage;
import com.BriteERP.pages.Quotations;

import com.BriteERP.pages.NewEventPage;

public class Pages {

    private LoginPage loginPage;
    private CRMpage crmPage;
    private ActivityTypesPage activityTypesPage;

    private PipelinePage pipelinePage;
    private Quotations quotationsPage;
    private NewEventPage newEventPage;

    public  ActivityTypesPage activityTypesPage() {
        if (activityTypesPage == null){
            activityTypesPage = new ActivityTypesPage();

        }
        return activityTypesPage;

    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CRMpage crmPage(){
        if(crmPage == null){

            crmPage = new CRMpage();
        }
        return crmPage;
    }


    public Quotations quotationsPage() {
        if (quotationsPage == null) {
            quotationsPage = new Quotations();
        }
        return quotationsPage;
    }

        public NewEventPage newEventPage(){
            if (newEventPage == null) {
                newEventPage = new NewEventPage();
            }
            return newEventPage;

        }

        public PipelinePage pipelinePage(){
            if(pipelinePage == null){
                pipelinePage = new PipelinePage();
            }
            return pipelinePage;

        }




}
