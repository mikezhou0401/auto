package org.webdriver.webui.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import sun.rmi.runtime.Log;

import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseAction extends TestBaseCase {
    public static WebDriver driver;
    public BaseAction() {
        System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
        if (null == driver) {
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void open(String url) {
        driver.get(url);
    }

    public void open(URL url) {
        driver.navigate().to(url);
    }

    public String getTitle() {
        return driver.getCurrentUrl();
    }

    public List<WebElement> findElements(String key, String value) {
        return driver.findElements(by(key, value));
    }

    public WebElement findElement(String key, String value) {
        return driver.findElement(by(key, value));
    }

    public By by(String key, String value) {
        switch (key) {
            case "id":
                return By.id(value);
            case "linkText":
                return By.linkText(value);
            case "partialLinkText":
                return By.partialLinkText(value);
            case "name":
                return By.name(value);
            case "tagName":
                return By.tagName(value);
            case "xpath":
                return By.xpath(value);
            case "className":
                return By.className(value);
            case "cssSelector":
                return By.cssSelector(value);
            default:
                return null;
        }
    }


    /**
     * 页面操作
     */

    public void back() {
        driver.navigate().back();
    }

    public void forward() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }

    Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    String getWindowHandle() {
        return driver.getWindowHandle();
    }

    /**
     * 对浏览器window进行进行封装
     */
    void setSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public void setPosition(int x, int y) {
        driver.manage().window().setPosition(new Point(x, y));
    }

    public Dimension getSize() {
        return driver.manage().window().getSize();
    }

    public Point getPosition() {
        return driver.manage().window().getPosition();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void fullscreen() {
        driver.manage().window().fullscreen();
    }

    /**
     * 休眠
     */
    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * cookie&session
     */
    public void setCookie(String key, String value) {
        Cookie c = new Cookie(key, value);
        driver.manage().addCookie(c);
    }

    public void setLocalStorage(String key, String value) {
        ChromeDriver c = (ChromeDriver) driver;
        LocalStorage ls = c.getLocalStorage();
        ls.setItem(key, value);
    }


}
