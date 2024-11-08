package com.mobile.app.Base;

import io.appium.java_client.android.AndroidDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.mobile.app.Base.Capabilities.setCapabilities;
import static com.mobile.app.utils.EvidenceTaker.captureScreenshot;


public class BaseTest {
    protected static AndroidDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = createDriver();

    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            captureScreenshot(result.getName(), driver);
        }

        if (driver != null) {
            driver.quit();
        }
    }


    private AndroidDriver createDriver(){
        try {
            AndroidDriver androidDriver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"), setCapabilities());
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return androidDriver;

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
