package com.mobile.app.Base;

import io.appium.java_client.android.options.UiAutomator2Options;

public class Capabilities {
    public static UiAutomator2Options setCapabilities(String deviceName, String platformVersion) {
        return new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName(deviceName)
                .setAutomationName("Uiautomator2")
                .setPlatformVersion(platformVersion)
                .setAppPackage("com.saucelabs.mydemoapp.android")
                .setApp("C:\\Users\\crroj\\Documents\\mda-2.2.0-25.apk");
    }
}
