package org.webdriver.webui.listener;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.webdriver.webui.utils.TestNGRetry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IRetryAnalyzer iRetryAnalyzer = null;
        try {
            iRetryAnalyzer = annotation.getRetryAnalyzerClass().getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == iRetryAnalyzer) {
            annotation.setRetryAnalyzer(TestNGRetry.class);
        }

    }

}
