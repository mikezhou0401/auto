package org.webdriver.webui.utils;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNGRetry implements IRetryAnalyzer {
    private int maxRetryCount = 2;
    private int currentRetryCount = 0;
    private Logger log = Logger.getLogger(TestNGRetry.class);

    @Override
    public boolean retry(ITestResult result) {
        if (currentRetryCount < maxRetryCount) {
            currentRetryCount++;
            log.info("运行第【" + currentRetryCount + "】次重试机制");
            return true;
        } else {
            return false;
        }
    }
}
