package com.fundacionjala.todoist.driver;

import org.openqa.selenium.WebDriverException;

/**
 * Created by RosarioGarcia on 6/23/2016.
 */
public class FactoryDriver {
    private static final String FIREFOX = "firefox";

    private FactoryDriver(){

    }
    public static IDriver getDriver(String browser){
        if (FIREFOX.equals(browser))
        return new Firefox();
        throw new WebDriverException("Browser not found");
    }
}
