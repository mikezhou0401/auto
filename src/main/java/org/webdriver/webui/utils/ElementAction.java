package org.webdriver.webui.utils;

import org.openqa.selenium.WebElement;

public class ElementAction extends TestBaseCase {
    /**
     * 元素操作
     */
    public void click(WebElement element) {
        element.click();
    }

    public  void submit(WebElement element) {
        element.submit();
    }

    public   void sendKeys(WebElement element, String key) {
        element.sendKeys(key);
    }

    public void clear(WebElement element) {
        element.clear();
    }

}
