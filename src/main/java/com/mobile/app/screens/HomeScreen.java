package com.mobile.app.screens;

import com.mobile.app.Base.BaseScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    private WebElement txtTitle = getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"API Demos\"]"));

    private WebElement btnAccesibility = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));

    public AccesibilityScreen tapOnAccessibility(){
        click(btnAccesibility);
        AccesibilityScreen accesibilityScreen = new AccesibilityScreen();
        return accesibilityScreen;
    }

    public boolean isHomeScreenDisplayed(){
        return btnAccesibility.isDisplayed();
    }
}
