package org.webdriver.webui.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.rmi.runtime.Log;

import java.net.URL;
import java.util.List;
import java.util.Set;

public class BaseAction extends TestBaseCase {
    public static WebDriver driver;

    public BaseAction() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
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

    void back() {
        driver.navigate().back();
    }

    void forward() {
        driver.navigate().forward();
    }


    void close() {
        driver.close();
    }

    void quit() {
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

}
