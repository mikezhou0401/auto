package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.webdriver.webui.action.BaseAction;
import org.webdriver.webui.utils.PropertiesUtil;


public class LoginPage extends BaseAction {

    public static final String url = PropertiesUtil.getProperties().getProperty("adminLoginURL");

    public void open() {
        driver.get(url);
    }

    public WebElement user() {
        return findElement("id", "su");
    }

    public WebElement password() {
        return findElement("id", "kw");
    }

    public WebElement submit() {
        return findElement("id", "dd");
    }
}
