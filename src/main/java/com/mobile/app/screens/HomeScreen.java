package com.mobile.app.screens;

import com.mobile.app.Base.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    private WebElement txtTitle = driver.findElement(By.xpath("//android.widget.TextView[@text=\"API Demos\"]"));

    private WebElement btnAccesibility = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
    private WebElement btnAccessibility2 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]"));

    private WebElement btnAnimation = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));

    private WebElement btnApp = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"App\")"));

    @Step("Tap on accessibility screen")
    public AccessibilityScreen tapOnAccessibility(){
        click(btnAccesibility, "Accessibility Button");
        return new AccessibilityScreen(driver);
    }

    @Step("Check the home screen is displayed")
    public boolean isHomeScreenDisplayed(){
        return btnAccesibility.isDisplayed();
    }

    @Step("Tap on animation screen")
    public AnimationScreen tapOnAnimationScreen(){
        click(btnAnimation, "Animation Button");
        return new AnimationScreen(driver);
    }
}
