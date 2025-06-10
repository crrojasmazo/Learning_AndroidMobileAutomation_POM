package com.mobile.app;


import com.mobile.app.Base.BaseTest;
import com.mobile.app.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenTheAppTest extends BaseTest {

    @Test
    public void testAccessibility(){
        HomeScreen homeScreen = new HomeScreen(getDriver());
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed());
    }

}
