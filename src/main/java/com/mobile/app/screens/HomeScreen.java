package com.mobile.app.screens;

import com.mobile.app.Base.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    private WebElement txtTitle = driver.findElement(By.xpath("//android.widget.TextView[@text=\"API Demos\"]"));

    private WebElement btnAccesibility = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));

    public AccessibilityScreen tapOnAccessibility(){
        click(btnAccesibility, "Accessibility Button");
        return new AccessibilityScreen(driver);
    }

    @Step("Check the home screen is displayed")
    public boolean isHomeScreenDisplayed(){
        return btnAccesibility.isDisplayed();
    }
}
