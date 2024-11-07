package com.mobile.app;

import com.mobile.app.Base.BaseTest;
import com.mobile.app.screens.AccessibilityScreen;
import com.mobile.app.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testAccessibility(){
        HomeScreen homeScreen = new HomeScreen(driver);
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed());
        AccessibilityScreen accesibilityScreen = homeScreen.tapOnAccessibility();
        Assert.assertTrue(accesibilityScreen.isAccessibilityScreenDisplayed());
    }

    @Test
    public void testOpenNavigateAndTurnBack() {
        HomeScreen homeScreen = new HomeScreen(driver);
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed());
        AccessibilityScreen accesibilityScreen = homeScreen.tapOnAccessibility();
        Assert.assertTrue(accesibilityScreen.isAccessibilityScreenDisplayed());
        accesibilityScreen.navigateBack();
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed());
    }
}
