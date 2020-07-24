package org.webdriver.webui.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {
    public WebDriver driver;
    private String screenName;

    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    private void takeScreenshot(String screenPath){
        File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }
}
