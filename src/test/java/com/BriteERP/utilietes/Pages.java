package com.BriteERP.utilietes;

import com.BriteERP.pages.ActivityTypesPage;
import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private CRMpage crmPage;
    private ActivityTypesPage activityTypesPage;

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
}
