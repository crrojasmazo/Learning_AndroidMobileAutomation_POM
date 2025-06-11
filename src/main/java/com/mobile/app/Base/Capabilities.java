package com.mobile.app.Base;

import io.appium.java_client.android.options.UiAutomator2Options;

public class Capabilities {
    public static UiAutomator2Options setCapabilities(String deviceName, String platformVersion) {
        return new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName(deviceName)
                .setAutomationName("Uiautomator2")
                .setPlatformVersion(platformVersion)
                .setApp("C:\\Users\\crroj\\Documents\\ApiDemos-debug.apk");
    }
}
