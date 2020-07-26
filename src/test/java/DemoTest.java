package java1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.webdriver.webui.action.InputDetailAction;
import org.webdriver.webui.pageObject.APPEditPage;
import org.webdriver.webui.pageObject.BasePage;
import org.webdriver.webui.utils.BaseAction;
import org.webdriver.webui.utils.ElementAction;
import org.webdriver.webui.utils.ScreenShot;

public class DemoTest extends BaseAction {
    @Test(invocationCount=2)
    public void test() {
        InputDetailAction inputDetailAction = new InputDetailAction();
        APPEditPage APPEditPage = new APPEditPage();
        BasePage basePage = new BasePage();
        ElementAction action = new ElementAction();

/*

        //单行
        action.sendKeys(APPEditPage.field1(), "输入1");
        action.sendKeys(APPEditPage.field2(), "输入2");
        action.sendKeys(APPEditPage.field3(), "输入3");

        //多行
        for (WebElement element : APPEditPage.multiline()) {
            action.sendKeys(element, "多行");
            sleep(2000);
        }

        //单选(下拉单选自定义、下拉单选关联、人员单选)
        for (WebElement element : APPEditPage.singleSelectLists()) {
            action.click(element);
            sleep(2000);
            action.click(APPEditPage.selectOption());
            sleep(2000);
        }

      */
/*  //图片无效
        for (WebElement element : APPEditPage.pictures()) {
            action.sendKeys(element, "F:\\琪琪\\测试.jpg");
        }*//*


        //日期 &日期时间
        for (WebElement element : APPEditPage.date()) {
            action.click(element);
            sleep(2000);
            action.click(basePage.date().get(1));//点击确定
        }


        */
/**
         * 正负数
         * *//*


        for (WebElement webElement : APPEditPage.switch_()) {
            sleep(2000);
            action.click(webElement);
        }


        */
/**
         * 输入数值
         * *//*


        for (WebElement webElement : APPEditPage.number()) {
            sleep(2000);

            action.click(webElement);
            for (int i = 0; i < webElement.getText().length(); i++) {
                action.click(basePage.keypad().get(12));
            }
            action.click(basePage.keypad().get(1));
            action.click(basePage.keypad().get(13));
        }


        */
/**
         * 引用对象
         **//*

        sleep(2000);
        action.click(APPEditPage.reference());
        sleep(2000);
        action.click(basePage.roundOption());
        sleep(2000);
        action.click(basePage.sure());

        */
/**
         * 部门单
         * *//*

        action.click(APPEditPage.department());
        sleep(2000);
        action.click(basePage.roundOption());
        action.click(basePage.sure());

        */
/**
         * 部门多
         * *//*

        action.click(APPEditPage.departments());
        sleep(2000);
        action.click(basePage.roundOption());
        action.click(basePage.sure());
*/


        ScreenShot screenShot=new ScreenShot(driver);
        screenShot.takeScreenshot();

        /**
         * 提交
         * */
        action.click(APPEditPage.submit());
    }
}