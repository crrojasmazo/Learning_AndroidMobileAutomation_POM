package com.mobile.app.screens;

import com.mobile.app.Base.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessibilityScreen extends BaseScreen {

    public AccessibilityScreen(AndroidDriver driver) {
        super(driver);
    }
    private WebElement btnAccessNodeProvider = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]"));

    private WebElement btnAccessNodeQuerying = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]"));

    private WebElement btnAccessService = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Service\"]"));

    private WebElement btnCustomView = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Custom View\"]"));

    @Step("Checking the accessibility screen is displayed")
    public boolean isAccessibilityScreenDisplayed() {
        return btnAccessNodeProvider.isDisplayed() &&
                btnAccessNodeQuerying.isDisplayed() &&
                btnAccessService.isDisplayed() &&
                btnCustomView.isDisplayed();
    }




}
