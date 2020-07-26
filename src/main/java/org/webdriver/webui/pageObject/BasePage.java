package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.webdriver.webui.utils.BaseAction;

import java.util.LinkedList;
import java.util.List;

public class BasePage extends BaseAction {
    /**
     * 数字键盘 //todo
     */
    public List<WebElement> keypad() {
        List<WebElement> lists = new LinkedList<>();
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(4) > td:nth-child(2)"));//0
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(1) > td:nth-child(1)"));//1
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(1) > td:nth-child(2)"));//2
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(1) > td:nth-child(3)"));//3
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(2) > td:nth-child(1)"));//4
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(2) > td:nth-child(2)"));//5
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(2) > td:nth-child(3)"));//6
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(3) > td:nth-child(1)"));//7
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(3) > td:nth-child(2)"));//8
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(3) > td:nth-child(3)"));//9
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(4) > td:nth-child(1)"));//.
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(4) > td:nth-child(3)"));//关闭
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(1) > td:nth-child(4)"));//删除
        lists.add(findElement("cssSelector", "#am-number-keyboard-container > div > table > tbody > tr:nth-child(3) > td:nth-child(4)"));//确定
        return lists;
    }

    /**
     * 时间日期控件
     */
    public List<WebElement> date() {
        List<WebElement> lists = new LinkedList<>();

        //取消
        lists.add(findElement("xpath", "//*[@id=\"datePicker\"]/div/div/div[1]/div[1]"));
        //确定
        lists.add(findElement("xpath", "//*[@id=\"datePicker\"]/div/div/div[1]/div[3]"));
        return lists;

    }


    /**
     * 底部确定按钮定位
     */
    public WebElement sure() {
        return findElement("className", "footerBtns-sure");
    }

    /**
     * 选择圆框定位
     */
    public WebElement roundOption () {
        return findElement("className", "biz-square-check-btn-normal");
    }
}
