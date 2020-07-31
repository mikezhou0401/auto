import org.testng.annotations.Test;
import org.webdriver.webui.action.BaseAction;
import org.webdriver.webui.action.ElementAction;
import org.webdriver.webui.pageObject.APPEditPage;
import org.webdriver.webui.pageObject.BasePage;
import org.webdriver.webui.pageObject.InstanceListPage;
import org.webdriver.webui.pageObject.LoginPage;

public class AdminLoginPageTest extends BaseAction {
    ElementAction action = new ElementAction();
    LoginPage loginPage = new LoginPage();

    @Test
    public void testLogin() {
        loginPage.open();
        action.sendKeys(loginPage.user(), "15902379217");
        action.sendKeys(loginPage.password(), "123456");
        action.sendKeys(loginPage.captcha(), "0000");
        action.click(loginPage.login());
    }
}
