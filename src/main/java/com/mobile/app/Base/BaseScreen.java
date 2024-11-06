package com.mobile.app.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseScreen {

    public AndroidDriver getDriver(){
        return getDriver();

    }

    private AndroidDriver createDriver(){
        try {
            return new AndroidDriver(
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

    public void click(WebElement element){
        element.click();
    }

}
