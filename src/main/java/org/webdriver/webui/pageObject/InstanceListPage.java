package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocalStorage;
import org.webdriver.webui.action.BaseAction;
import org.webdriver.webui.action.ElementAction;

public class InstanceListPage extends BaseAction {

    public InstanceListPage() {
        this.open();
        ElementAction action = new ElementAction();
        setLocalStorage("testToken", getLocalStorage());
        sleep(2000);
        refresh();
        action.click(this.newInstance());
    }

    public static final String url = "http://bz-app.yunsom.cn/bsentity/instance?entity_id=802cb3b1-8e56-4ed2-b90a-24a07c5f1f3d&entity_name=%E8%87%AA%E5%AE%9A%E4%B9%89%E5%85%A8%E8%A1%A8%E5%8D%95&data_structure=LIST&resources=add,update,delete,view";

    public void open() {
        driver.get(url);
    }

    public WebElement newInstance() {
        return findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[2]/div/div/a/span[2]");
    }
}
