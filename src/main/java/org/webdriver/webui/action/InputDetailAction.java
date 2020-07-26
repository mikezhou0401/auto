package org.webdriver.webui.action;

import org.webdriver.webui.pageObject.DetailPage;
import org.webdriver.webui.utils.BaseAction;
import org.webdriver.webui.utils.ElementAction;

public class InputDetailAction extends BaseAction {


    public InputDetailAction() {
        DetailPage detailPage = new DetailPage();
        detailPage.open();
        ElementAction action = new ElementAction();
        setLocalStorage("testToken", "eyJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjE4ODcwLCJkZXYiOm51bGwsImV4cCI6MTU5Njk0MjY1NCwidXVpZCI6IjE4ODcwXzU0MzkwYTRhLWU1MzUtNDZlYy05NGZlLWFkMzY4NzNmNmY5NiIsInR0bCI6MTI5NjAwMCwiaWF0IjoxNTk1NjQ2NjI0fQ.0-P5mgJs4FVm6boWJcmRgicilZ0n1yefZuJlJNFLNMg");
        sleep(2000);
        refresh();
        maximize();
        action.click(detailPage.operate());
        sleep(2000);
        action.click(detailPage.edit());
    }
}
