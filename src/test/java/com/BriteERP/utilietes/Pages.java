package com.BriteERP.utilietes;

import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private CRMpage crmPage;

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
