package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.webdriver.webui.action.BaseAction;
import org.webdriver.webui.utils.PropertiesUtil;


public class LoginPage extends BaseAction {
    public static final String url = new PropertiesUtil().getProperties().getProperty("adminLoginURL");

    public void open() {
        driver.get(url);
    }

    public WebElement user() {
        return findElement("cssSelector", "#root > div > div.body__lCzT4 > div > div > form > div:nth-child(1) > div > div > span > span > input");
    }

    public WebElement password() {
        return findElement("cssSelector", "#root > div > div.body__lCzT4 > div > div > form > div:nth-child(2) > div > div > span > span > input");
    }

    public WebElement captcha() {
        return findElement("cssSelector", "#root > div > div.body__lCzT4 > div > div > form > div:nth-child(3) > div > div > span > span > input");
    }

    public WebElement login() {
        return findElement("cssSelector", "#root > div > div.body__lCzT4 > div > div > form > div:nth-child(4) > div > div > span > div > button");
    }
}
