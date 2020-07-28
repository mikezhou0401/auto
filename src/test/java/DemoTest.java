
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.webdriver.webui.pageObject.APPEditPage;
import org.webdriver.webui.pageObject.BasePage;
import org.webdriver.webui.pageObject.InstanceListPage;
import org.webdriver.webui.action.BaseAction;
import org.webdriver.webui.action.ElementAction;
import org.webdriver.webui.utils.ScreenShot;

public class DemoTest extends BaseAction {
    @Test()
    public void test() {
        //进入详情页
    //    InputDetailAction inputDetailAction = new InputDetailAction();

        //进入实例列表
        InstanceListPage instanceListPage = new InstanceListPage();
        APPEditPage APPEditPage = new APPEditPage();
        BasePage basePage = new BasePage();
        ElementAction action = new ElementAction();

        //单行
        action.sendKeys(APPEditPage.field1(), "输入1");
        action.sendKeys(APPEditPage.field2(), "输入2");
        action.sendKeys(APPEditPage.field3(), "输入3");

        //多行
        for (WebElement element : APPEditPage.multiline()) {
            action.sendKeys(element, "多行");
        }

        //单选(下拉单选自定义、下拉单选关联、人员单选)
        for (WebElement element : APPEditPage.singleSelectLists()) {
                action.click(element);
                action.click(APPEditPage.selectOption());
        }

       /* //图片无效
        for (WebElement element : APPEditPage.pictures()) {
            action.sendKeys(element, "F:\\XX\\测试.jpg");
        }*/


        //日期 &日期时间
        for (WebElement element : APPEditPage.date()) {
            action.click(element);
            action.click(basePage.date().get(1));//点击确定
        }


        /**
         * 正负数
         **/
        for (WebElement webElement : APPEditPage.switch_()) {
            action.click(webElement);
        }

        /**
         * 输入数值
         **/
        for (WebElement webElement : APPEditPage.number()) {
            action.click(webElement);
            for (int i = 0; i < webElement.getText().length(); i++) {
                action.click(basePage.keypad().get(12));
            }
            action.click(basePage.keypad().get(1));
            action.click(basePage.keypad().get(13));
        }

        /**
         * 引用对象
         **/

        action.click(APPEditPage.reference());
        new BaseAction().clickRound();

        /**
         * 部门单
         **/
        action.click(APPEditPage.department());
        new BaseAction().clickRound();

        /**
         * 部门多
         **/
        action.click(APPEditPage.departments());
        new BaseAction().clickRound();
        ScreenShot screenShot = new ScreenShot(driver);

        screenShot.takeScreenshot();

        /**
         * 提交
         **/
        action.click(APPEditPage.submit());
    }
}