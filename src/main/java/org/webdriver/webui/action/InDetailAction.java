package org.webdriver.webui.action;

import org.webdriver.webui.pageObject.DetailPage;
import org.webdriver.webui.utils.BaseAction;
import org.webdriver.webui.utils.ElementAction;

public class InDetailAction extends BaseAction {


    public InDetailAction() {
        DetailPage detailPage = new DetailPage();
        detailPage.open();
        ElementAction action = new ElementAction();
        setLocalStorage("testToken", "eyJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjE4ODcwLCJkZXYiOm51bGwsImV4cCI6MTU5NzEwODM4NiwidXVpZCI6IjE4ODcwX2IwODBhNmE4LTBiMDEtNGMyNy1hNGM5LWQ2ODg4MjMwYmM2MiIsInR0bCI6MTI5NjAwMCwiaWF0IjoxNTk1ODEyMzU2fQ.tdXHusp7FNT35nqSv8M5EjQlQHDe52Ksg14MBSpZ9bU");
        sleep(2000);
        refresh();
        action.click(detailPage.operate());
        action.click(detailPage.edit());
    }
}
