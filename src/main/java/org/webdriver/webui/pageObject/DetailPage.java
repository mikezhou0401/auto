package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.webdriver.webui.action.BaseAction;

public class DetailPage extends BaseAction {
    public static final String url = "http://bz-app.yunsom.cn/bsentity/instance/todo?entity_id=802cb3b1-8e56-4ed2-b90a-24a07c5f1f3d&entity_name=%E8%87%AA%E5%AE%9A%E4%B9%89%E5%85%A8%E8%A1%A8%E5%8D%95&data_structure=LIST&resources=edit&instance_id=dbf256b92014475d92e1fb48532bc6c7&r_type=view";

    public void open() {
        driver.get(url);
    }

    public  WebElement operate() {
        return  findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[2]/div");
    }

    public  WebElement edit() {
        return findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[3]/div[1]");
    }

    public WebElement delete() {
        return findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[3]/div[2]");
    }
}
