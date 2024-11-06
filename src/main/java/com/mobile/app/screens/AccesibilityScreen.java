package com.mobile.app.screens;

import com.mobile.app.Base.BaseScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccesibilityScreen extends BaseScreen {
    private WebElement btnAccessNodeProvider = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]"));

    private WebElement btnAccessNodeQuerying = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]"));

    private WebElement btnAccessService = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Service\"]"));

    private WebElement btnCustomView = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Custom View\"]"));

    public boolean isAccessibilityScreenDisplayed() {
        return btnAccessNodeProvider.isDisplayed() &&
                btnAccessNodeQuerying.isDisplayed() &&
                btnAccessService.isDisplayed() &&
                btnCustomView.isDisplayed();
    }


}
