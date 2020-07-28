package org.webdriver.webui.pageObject;

import org.openqa.selenium.WebElement;
import org.webdriver.webui.action.BaseAction;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class APPEditPage extends BaseAction {
    /**
     * 单行文本
     */
    public WebElement field1() {
        return findElement("id", "6217");
    }//单行文本

    public WebElement field2() {
        return findElement("id", "6219");
    }//单行文本联动

    public WebElement field3() {
        return findElement("id", "7847");
    }//单行文本2


    /**
     * 引用对象
     */
    public WebElement reference() {
        return findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[18]/div/div/div[2]");

    }

    /**
     * 部门
     */
    public WebElement department() {
        return findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[20]/div/div/div[2]");
    }

    public WebElement departments() {
        return findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[21]/div/div/div[2]");
    }


    /**
     * 多行文本
     */

    public List<WebElement> multiline() {
        return findElements("tagName", "textarea");
    }


    /**
     * 单选元素定位
     */
    public List<WebElement> singleSelectLists() {
        return findElements("className", "select");
    }

    /**
     * 用于点击单选后选择选项
     */
    public WebElement selectOption() {
        return findElement("className", "picker-popup-content-list-text");
    }

    /**
     * 用于点击单选后，选择已勾选项
     */
    public WebElement checked() {
        return findElement("className", "biz-form-radio-checked");
    }


    /**
     * 多选元素定位//todo
     */
    public List<WebElement> multipleSelect() {
        return findElements("className", "select");
    }


    /**
     * 图片
     */

    public List<WebElement> pictures() {

        return findElements("cssSelector", "input[type=\"file\"]");
//        return findElements("className", "am-image-picker-item am-image-picker-upload-btn");
    }

    /**
     * 日期时间
     */

    public List<WebElement> date() {
        List<WebElement> lists = new LinkedList<>();
        lists.add(findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[10]/div/div/div[2]"));//日期
        lists.add(findElement("xpath", "//*[@id=\"__next\"]/div[2]/div[1]/div/div[11]/div/div/div[2]"));//日期时间
        return lists;
    }


    /**
     * 正负值按钮
     */
    public List<WebElement> switch_() {
        return findElements("className", "am-switch");
    }


    /**
     * 数值输入框
     */
    public List<WebElement> number() {
        return findElements("className", "fake-input-container");
    }

    /**
     * 填写结果
     */
    public Map<WebElement, String> result() {
        Map<WebElement, String> map =new HashMap<>();
        for (WebElement element : findElements("cssSelector", "div.am-list-content>p")) {
            if (null != element.getText()) {
                map.put(element, element.getText());
            }
        }

        for (WebElement element : findElements("tagName", "input")) {
            if (null != element.getAttribute("value")) {
                map.put(element, element.getAttribute("value"));
            }
        }
        return map;
    }
    /**
     * 提交
     */
    public WebElement submit() {
        return findElement("partialLinkText", "提 交");
    }

    /**
     * 箭头元素定位
     *//*
    public List<WebElement> arrowLists() {
        return findElements("className", "am-list-arrow-horizontal");
    }


    *//**
     * 文本输入框定位(不包含多行文本)
     *//*
    public List<WebElement> text() {
        return findElements("className", "am-input-control");
    } */

}

