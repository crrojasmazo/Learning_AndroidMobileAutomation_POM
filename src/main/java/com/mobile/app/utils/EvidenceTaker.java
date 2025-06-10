package com.mobile.app.utils;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EvidenceTaker {
    public static void captureScreenshot(String testName, AppiumDriver driver) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";
        try {
            FileUtils.copyFile(srcFile, new File(screenshotPath));
            Allure.addAttachment("Screenshot on failure", new FileInputStream(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
