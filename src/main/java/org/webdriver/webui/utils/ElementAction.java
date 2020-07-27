package org.webdriver.webui.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementAction extends BaseAction {

    /**
     * 元素操作
     */
    public void click(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        sleep(500);
        element.click();
    }
    public void submit(WebElement element) {
        element.submit();
    }

    public void sendKeys(WebElement element, String key) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        sleep(500);
        element.clear();
        element.sendKeys(key);

    }

    public void clear(WebElement element) {
        element.clear();
    }

}
