package com.mobile.app.Base;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class BaseScreen {


    protected AppiumDriver driver;

    public BaseScreen(AppiumDriver driver) {
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
