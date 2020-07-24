package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.webdriver.webui.utils.BaseAction;


public class LoginPage extends BaseAction {

    public static final String url = "admin.scm3.yunsom.cn";

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
