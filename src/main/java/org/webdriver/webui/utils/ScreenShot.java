package org.webdriver.webui.utils;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {
    public WebDriver driver;
    private String screenName = "screen";

    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    private void takeScreenshot(String screenPath) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrFile, new File(screenPath));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void takeScreenshot() {
        int number = 1;
        File dir = new File("test-output\\snapshot");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String screenPath = dir.getAbsolutePath() + "\\" + screenName + number + ".jpg";

        if (new File(screenPath).exists()) {
            number = number + 1;
            screenPath = dir.getAbsolutePath() + "\\" + screenName + number + ".jpg";
        }
        this.takeScreenshot(screenPath);
    }
}
