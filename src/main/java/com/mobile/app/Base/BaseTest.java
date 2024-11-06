package com.mobile.app.Base;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static com.mobile.app.Base.BaseScreen.driver;


public class BaseTest {

    @BeforeTest
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
