package com.mobile.app.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.mobile.app.Base.Capabilities.setCapabilities;
import static com.mobile.app.utils.EvidenceTaker.captureScreenshot;


public class BaseTest {
    protected ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    protected AppiumDriverLocalService service;

    @BeforeMethod
    @Parameters({"portNumber", "deviceName", "platformVersion"})
    public void setUp(String portNumber, String deviceName, String platformVersion){
        startAppiumService(portNumber);
        setDriver(createDriver(deviceName, portNumber, platformVersion));
    }

    public AppiumDriver getDriver() {
        return this.driver.get();
    }

    public void startAppiumService(String portNumber) {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1")
                .usingAnyFreePort()
                .build();
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println(service.getUrl());
    }

    public void closeAppiumService() {
        service.close();
    }

    public void setDriver(AppiumDriver driver) {
        this.driver.set(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            captureScreenshot(result.getName(), getDriver());
        }
        if (getDriver() != null) {
            getDriver().quit();
        }
        closeAppiumService();
    }

    private AppiumDriver createDriver(String deviceName, String portNumber, String platformVersion){
        try {
            AppiumDriver appiumDriver = new AndroidDriver(
                    new URL(service.getUrl().toString()), setCapabilities(deviceName, platformVersion));
            appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return appiumDriver;

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
