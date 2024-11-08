package com.mobile.app.screens;

import com.mobile.app.Base.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class AnimationScreen extends BaseScreen {

    protected AnimationScreen(AndroidDriver androidDriver){
        super(androidDriver);
    }

    private WebElement btnBouncingBalls = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Bouncing Balls\")"));


    public boolean isAnimationScreenDisplayed(){
        return btnBouncingBalls.isDisplayed();
    }
}
