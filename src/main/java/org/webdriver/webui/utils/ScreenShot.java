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
       /* try {
            // 获取屏幕尺寸
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // 创建需要截取的矩形区域
            Rectangle rect = new Rectangle(0, 0, screenSize.width, screenSize.height);
            // 截屏操作
            BufferedImage bufImage = new Robot().createScreenCapture(rect);
            // 保存截取的图片
            ImageIO.write(bufImage, "PNG", new File(screenPath));
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /* BufferedImage bi = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver).getImage();
        try {
            ImageIO.write(bi, "PNG", new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
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
        String screenPath = dir.getAbsolutePath() + "\\" + screenName + number+".png";
        if (new File(screenPath).exists()) {
            number++;
            screenPath = dir.getAbsolutePath() + "\\" + screenName + number+".png";
        }
        this.takeScreenshot(screenPath);
    }
}
