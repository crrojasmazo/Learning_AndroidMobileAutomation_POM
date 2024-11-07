package com.mobile.app.Base;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import static com.mobile.app.Base.BaseTest.driver;


public class BaseScreen {


    protected AndroidDriver driver;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
    }


    @Step("Tap on {1}")
    public void click(WebElement element, String elementName){
        element.click();
    }

    @Step("Navigate Backwards")
    public void navigateBack(){
        driver.navigate().back();
    }

    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }

}
