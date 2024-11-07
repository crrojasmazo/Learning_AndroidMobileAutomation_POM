package com.mobile.app.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseScreen {

    public static AppiumDriver driver;

    public BaseScreen(){
        driver = getDriver();
    }

    public AppiumDriver getDriver(){
        if(driver == null){
            return createDriver();
        } else {
            return driver;
        }

    }

    private AppiumDriver createDriver(){
        try {
            return new AppiumDriver(
                    new URL("http://127.0.0.1:4723"), setCapabilities()
            );
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    private UiAutomator2Options setCapabilities() {
        return new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("emulator-5554")
                .setAutomationName("Uiautomator2")
                .setPlatformVersion("15")
                .setApp("C:\\Users\\crroj\\Documents\\ApiDemosdebug.apk");
    }

    @Step("Tap on {1}")
    public void click(WebElement element, String elementName){
        element.click();
    }

    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }

}
