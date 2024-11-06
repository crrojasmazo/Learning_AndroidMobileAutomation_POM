package com.mobile.app;

import com.mobile.app.screens.AccesibilityScreen;
import com.mobile.app.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest {

    @Test
    public void testAccessibility(){
        HomeScreen homeScreen = new HomeScreen();
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed());
        AccesibilityScreen accesibilityScreen = homeScreen.tapOnAccessibility();
        Assert.assertTrue(accesibilityScreen.isAccessibilityScreenDisplayed());
    }
}
