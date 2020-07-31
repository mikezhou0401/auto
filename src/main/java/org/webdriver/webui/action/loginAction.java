package org.webdriver.webui.action;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.webdriver.webui.pageObject.LoginPage;

/**
 * 登陆模块
 */
@Test(dataProvider = "BaseAction")
public class loginAction extends BaseAction {
    @Parameters({"user", "password"})
    public loginAction(@Optional("100") String user, String password) {
        LoginPage loginPage = new LoginPage();
        ElementAction action = new ElementAction();
        loginPage.open();
        action.sendKeys(loginPage.user(), user);
        action.sendKeys(loginPage.password(), password);
        action.sendKeys(loginPage.captcha(), "0000");
        action.click(loginPage.login());
    }
}
