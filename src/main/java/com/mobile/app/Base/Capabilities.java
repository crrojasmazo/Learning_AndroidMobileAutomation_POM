package com.mobile.app.Base;

import io.appium.java_client.android.options.UiAutomator2Options;

public class Capabilities {
    public static UiAutomator2Options setCapabilities() {
        return new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("emulator-5554")
                .setAutomationName("Uiautomator2")
                .setPlatformVersion("15")
                .setApp("C:\\Users\\crroj\\Documents\\ApiDemosdebug.apk");
    }
}
