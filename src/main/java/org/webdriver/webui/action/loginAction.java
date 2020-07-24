package org.webdriver.webui.action;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.webdriver.webui.pageObject.LoginPage;
import org.webdriver.webui.utils.BaseAction;
import org.webdriver.webui.utils.ElementAction;

/**
 * 登陆模块
 */
@Test(dataProvider = "BaseAction")
public class loginAction extends BaseAction {
   @Parameters({"user","password"})
    public loginAction(String user,String password) {
        LoginPage loginPage = new LoginPage();
        ElementAction action = new ElementAction();
        loginPage.open();
        action.sendKeys(loginPage.user(), user);
        action.sendKeys(loginPage.password(), password);
        action.click(loginPage.submit());

    }
}
